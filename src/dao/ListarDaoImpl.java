package dao;

import conexion.AdministradorConexion;
import dto.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ListarDaoImpl implements ListarDao {
    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT ID_USUARIO, NOMBRE, CLAVE, RUT, DV FROM USUARIO";

        try (Connection conn = AdministradorConexion.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(rs.getLong("ID_USUARIO"));
                usuario.setNombre(rs.getString("NOMBRE"));
                usuario.setClave(rs.getString("CLAVE"));
                usuario.setRut(rs.getLong("RUT"));
                usuario.setDv(rs.getString("DV").charAt(0));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
