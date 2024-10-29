package dto;

public class Usuario {
    private Long idUsuario;
    private String nombre;
    private String clave;
    private Long rut;
    private char dv;

    // Getters y Setters
    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }

    public Long getRut() { return rut; }
    public void setRut(Long rut) { this.rut = rut; }

    public char getDv() { return dv; }
    public void setDv(char dv) { this.dv = dv; }
}
