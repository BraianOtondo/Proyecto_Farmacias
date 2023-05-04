package modelo;

public class Empleado extends Persona{
    private int cuil;
    private boolean encargado;
    public Empleado(int dni, String nombre, String apellido, int nro_afiliado,
            ObraSocial obra_social, Domicilio domicilio, int cuil) {
        super(dni, nombre, apellido, true, nro_afiliado, obra_social, domicilio);
        this.cuil = cuil;
        
    }

    public int getCuil() {
        return cuil;
    }
    public void setCuil(int cuil) {
        this.cuil = cuil;
    }
    public boolean IsEncargado() {
        return encargado;
    }
    public void setEncargado(boolean encargado) {
        this.encargado = encargado;
    }
    
    
}
