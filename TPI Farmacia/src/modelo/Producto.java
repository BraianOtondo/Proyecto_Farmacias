package modelo;

public class Producto {
    private int idProducto;
    private float precio;
    private boolean medicamento;
    private StringBuffer descripcion;
    private Laboratorio laboratorio;
    public Producto(int idProducto, float precio, boolean medicamento, StringBuffer descripcion,
            Laboratorio laboratorio) {
        this.idProducto = idProducto;
        this.precio = precio;
        this.medicamento = medicamento;
        this.descripcion = descripcion;
        this.laboratorio = laboratorio;
    }
    public int getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public boolean isMedicamento() {
        return medicamento;
    }
    public void setMedicamento(boolean medicamento) {
        this.medicamento = medicamento;
    }
    public StringBuffer getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(StringBuffer descripcion) {
        this.descripcion = descripcion;
    }
    public Laboratorio getLaboratorio() {
        return laboratorio;
    }
    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
   

    public boolean equals(Producto producto) {
        return (this.idProducto==producto.getIdProducto());
    }
    
    

}
