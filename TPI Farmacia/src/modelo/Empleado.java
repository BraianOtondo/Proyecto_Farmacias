package modelo;

public class Empleado extends Persona{
    private String cuil;
    private boolean encargado;

    public Empleado(int dni, String nombre, String apellido, int nro_afiliado,
            ObraSocial obra_social, Domicilio domicilio, String cuil,boolean encargado) {
        super(dni, nombre, apellido, nro_afiliado, obra_social, domicilio);
        this.cuil = cuil;
        this.encargado=encargado;
    }

    public String getCuil() {
        return cuil;
    }
    public void setCuil(String cuil) {
        this.cuil = cuil;
    }
    public boolean IsEncargado() {
        return encargado;
    }
    public void setEncargado(boolean encargado) {
        this.encargado = encargado;
    }

    @Override
    public String toString() {
        return "Empleado [cuil=" + cuil + ", encargado=" + encargado + "]\n";
    }
    
    
}
