package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class Venta {
    private String ticketFiscal;
    private int nroTicket;
    private LocalDate fecha;
	private LocalTime hora;
    private Sucursal sucursal;
    private Cliente cliente;
    private Empleado empleado;
    private boolean efectivo;
    private List<DetalleVenta> lstVenta=new ArrayList<DetalleVenta>();
    public Venta(int nroTicket, LocalDate fecha, LocalTime hora, Sucursal sucursal, Cliente cliente,
            Empleado empleado, boolean efectivo) {
        this.nroTicket = nroTicket;
        this.fecha = fecha;
        this.hora = hora;
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.empleado = empleado;
        this.efectivo = efectivo;
    }
    public String getTicketFiscal() {
        return ticketFiscal;
    }
    // Se cambia en base a sucursal y nroTicket
   public void setTicketFiscal(String ticketFiscal) {
     this.ticketFiscal = ticketFiscal;           
    }
    public int getNroTicket() {
        return nroTicket;
    }
    public void setNroTicket(int nroTicket) {
        this.nroTicket = nroTicket;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public Sucursal getSucursal() {
        return sucursal;
    }
    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public boolean isEfectivo() {
        return efectivo;
    }
    public void setEfectivo(boolean efectivo) {
        this.efectivo = efectivo;
    }
    public List<DetalleVenta> getLstVenta() {
        return lstVenta;
    }
    public void setLstVenta(List<DetalleVenta> lstVenta) {
        this.lstVenta = lstVenta;
    }
    
    public DetalleVenta traerDetalleVenta(Producto producto){
        DetalleVenta objeto=null;
        int i=0;
        while(i<this.lstVenta.size()&& objeto==null){
            if(this.lstVenta.get(i).getProducto().equals(producto)){
                objeto=this.lstVenta.get(i);
            }
            i++;
        }
        return objeto;
    }

    public void agregardetalleVenta(Producto producto, int cantidad){
		DetalleVenta objeto=this.traerDetalleVenta(producto);
		if(objeto!=null){
            objeto.setCantidad(objeto.getCantidad()+cantidad);
		}else{
            objeto=new DetalleVenta(producto, cantidad);
            this.lstVenta.add(objeto);
        }
	}
    @Override
    public String toString() {
        return "Venta [ticketFiscal=" + ticketFiscal + ", nroTicket=" + nroTicket + ", fecha=" + fecha + ", hora="
                + hora + ", sucursal=" + sucursal + ", cliente=" + cliente + ", empleado=" + empleado + ", efectivo="
                + efectivo + ", lstVenta=" + lstVenta + "]";
    }
	
}
