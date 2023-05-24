package modelo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
public class Sucursal {
    private int idSucursal;
    private Domicilio domicilio;
    private Empleado encargado;
    private List<Empleado> lstEmpleado= new ArrayList<Empleado>();
    private List<Venta> lstVenta= new ArrayList<Venta>();
    public Sucursal(int idSucursal, Domicilio domicilio) { //primero la lista y luego ver en la lista cual empleado es encargado
        this.idSucursal = idSucursal;
        this.domicilio = domicilio;
    }
    public int getIdSucursal() {
        return idSucursal;
    }
    public void setId(int idSucursal) {
        this.idSucursal = idSucursal;
    }
    public Domicilio getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    public Empleado getEncargado() {
        return encargado;
    }
    public void setEncargado(Empleado encargado) {
        this.encargado = encargado;
    }
    public List<Empleado> getLstEmpleado() {
        return lstEmpleado;
    }
    public void setLstEmpleado(List<Empleado> lstEmpleado) {
        this.lstEmpleado = lstEmpleado;
    }
    public List<Venta> getLstVenta() {
        return lstVenta;
    }
    public void setLstVenta(List<Venta> lstVenta) {
        this.lstVenta = lstVenta;
    }
    @Override
    public String toString() {
    return "Sucursal [idSucursal=" + idSucursal + ", domicilio=" + domicilio + ", encargado=" + encargado+"]";
    }

    public Empleado traerEmpleado(int dni){
        Empleado empleado=null;
        int i=0;
        boolean encontrado=false;
        while(i<this.lstEmpleado.size() && encontrado==false){
            if(dni==this.lstEmpleado.get(i).getDni()){
                empleado=this.lstEmpleado.get(i);
                encontrado=true;
            }
            i++;
        }
        return empleado;
    }

    public void agregarEmpleado(int dni,String cuil, String nombre, String apellido, int nro_afiliado,
    ObraSocial obra_social, Domicilio domicilio,boolean encargado){
        Empleado objeto=this.traerEmpleado(dni);
        if(objeto!=null){
            System.out.println("Este empleado "+ dni+" ya existe");
        }else{
            objeto=new Empleado(dni, nombre, apellido, nro_afiliado, obra_social, domicilio, cuil,encargado);
            this.lstEmpleado.add(objeto);
            agregarEncargado(objeto);
        }
        
    }

    public void agregarEncargado(Empleado empleado){
        if(empleado.IsEncargado()==true){
            this.setEncargado(empleado);
        }
        this.encargado=empleado;

    }
    public Venta traerVenta(int nroTicket){
        Venta venta=null;
        int i=0;
        boolean encontrado=false;
        while(i<this.lstVenta.size() && encontrado==false){
            if(this.lstVenta.get(i).getNroTicket()==nroTicket){
                venta=this.lstVenta.get(i);
                encontrado=true;
            }
            i++;
        }
        return venta;
    }

    public void agregarVenta(int nroTicket, LocalDate fecha, LocalTime hora, Sucursal sucursal, Cliente cliente, Empleado empleado, boolean efectivo){
        Venta objeto=this.traerVenta(nroTicket);
        if(objeto!=null){
            System.out.println("Esta venta ya esta agregada");
        }else{
            objeto=new Venta(nroTicket, fecha, hora, sucursal, cliente, empleado, efectivo);
            String nroTicketString= Integer.toString(nroTicket);
            String nroIdSucrsalString=Integer.toString(this.idSucursal);
            String cadenaTicketFiscal=nroIdSucrsalString+"-"+nroTicketString;
            objeto.setTicketFiscal(cadenaTicketFiscal);
            this.lstVenta.add(objeto);
        }
    }

}
