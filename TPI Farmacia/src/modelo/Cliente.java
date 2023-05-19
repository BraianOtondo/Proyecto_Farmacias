package modelo;

public class Cliente extends Persona{
   

    public Cliente(int dni, String nombre, String apellido, int nro_afiliado,
     ObraSocial obra_social, Domicilio domicilio) {
        super(dni, nombre, apellido, nro_afiliado, obra_social, domicilio);
        
    }

    public Cliente(int dni, String nombre, String apellido, Domicilio domicilio) {
        super(dni, nombre, apellido, domicilio);
    }

    @Override
    public String toString() {
        return "Cliente [dni=" + this.getDni() + ", nombre=" + this.getNombre() + ", apellido=" + this.getApellido() + ", nro_afiliado="
        +this.getNro_afiliado()+ ", obra_social=" + this.getObra_social() + ", domicilio=" +this.getDomicilio() + "]";
    }

    
    
}
