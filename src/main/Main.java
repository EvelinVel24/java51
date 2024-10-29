package main;

import dao.ListarDao;
import dao.ListarDaoImpl;
import dto.Usuario;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListarDao listarDao = new ListarDaoImpl();
        List<Usuario> usuarios = listarDao.listarUsuarios();

        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getIdUsuario());
            System.out.println("Nombre: " + usuario.getNombre());
            System.out.println("Clave: " + usuario.getClave());
            System.out.println("RUT: " + usuario.getRut() + "-" + usuario.getDv());
            System.out.println("---------------------------");
        }
    }
}
