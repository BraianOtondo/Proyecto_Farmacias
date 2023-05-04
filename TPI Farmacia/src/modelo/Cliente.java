package modelo;

public class Cliente extends Persona{
    private boolean particular;

    public Cliente(int dni, String nombre, String apellido, boolean esEmpleado, int nro_afiliado,
            ObraSocial obra_social, Domicilio domicilio, boolean particular) {
        super(dni, nombre, apellido, esEmpleado, nro_afiliado, obra_social, domicilio);
        this.particular = particular;
    }

    public Cliente(int dni, String nombre, String apellido, boolean esEmpleado, Domicilio domicilio,
            boolean particular) {
        super(dni, nombre, apellido, esEmpleado, domicilio);
        this.particular = particular;
    }

    public boolean IsParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }
    
}
