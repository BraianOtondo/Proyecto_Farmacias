package modelo;

public class Domicilio {
    private int id;
    private String localidad;
    private String provincia;
    private String calle;
    private int nroCalle;
    
    

    public Domicilio(int id, String localidad, String provincia, String calle, int nroCalle) {
        this.id = id;
        this.localidad = localidad;
        this.provincia = provincia;
        this.calle = calle;
        this.nroCalle = nroCalle;
    }
    public Domicilio(int id,String localidad,String provincia, int nroCalle){
        this.id = id;
        this.localidad = localidad;
        this.provincia = provincia;
        this.nroCalle = nroCalle;
    }

    public int getId() {
        return id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNroCalle(int nroCalle) {
        this.nroCalle = nroCalle;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCalle() {
        return calle;
    }

    public int getNroCalle() {
        return nroCalle;
    }

    public boolean equals(Domicilio domicilio) {
        return (this.id==domicilio.id);
    }

    @Override
    public String toString() {
        return "[id=" + id + ", localidad=" + localidad + ", provincia=" + provincia + ", calle=" + calle
                + ", nroCalle=" + nroCalle + "]";
    }

    
}
