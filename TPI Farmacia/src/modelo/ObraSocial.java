package modelo;
public class ObraSocial{
    private int codigo;
    private String nombre;
    public ObraSocial(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}