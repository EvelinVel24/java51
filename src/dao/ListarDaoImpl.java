package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import conexion.AdministradorConexion;
import dto.Usuario;

public class ListarDaoImpl implements ListarDao {

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        String query = "SELECT ID_USUARIO, NOMBRE, CLAVE, RUT, DV FROM USUARIO";

        try (Connection conexion = AdministradorConexion.obtenerConexion();
             PreparedStatement ps = conexion.prepareStatement(query);
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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarios;
    }
}

