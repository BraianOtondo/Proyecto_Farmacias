package test;
import modelo.Cliente;
import modelo.Domicilio;
import modelo.Empleado;
import modelo.Laboratorio;
import modelo.ObraSocial;
import modelo.Producto;
import modelo.Sistema;
import modelo.Sucursal;
import modelo.Venta;
import java.time.LocalDate;
import java.time.LocalTime;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args){
        //CREAMOS SISTEMA QUE TIENE SUCURSALES
       Sistema sistema=new Sistema();
       //CREAMOS OBRAS SOCIALES
       ObraSocial obraSocial1=new ObraSocial(1, "OSCA");
       ObraSocial obraSocial2=new ObraSocial(2, "OSDE");
       ObraSocial obraSocial3=new ObraSocial(3, "Galeano");
       ObraSocial obraSocial4=new ObraSocial(4, "SaludAr");
       
       //CREAMOS DOMICILIOS
       Domicilio domicilio1=new Domicilio(1,"Monte Grande", "Buenos Aires", "Pehuajo", 763);
       Domicilio domicilio2=new Domicilio(2,"Lanus","Buenos Aires","Alsina",323);
       Domicilio domiclilio3=new Domicilio(3, "Berazategui", "Buenos Aires",3);
       Domicilio domicilio4=new Domicilio(4,"Retiro","Buenos Aires","Leandro Alem",1134);
       Domicilio domicilio5=new Domicilio(5,"Banfield","Buenos Aires","Rosas",422);
       Domicilio domicilio6=new Domicilio(6, "Quilmes", "Buenos Aires", 56);
       Domicilio domicilio7=new Domicilio(7, "Burzaco", "Buenos Aires", "Las Tanarias", 6235);
       Domicilio domicilio8=new Domicilio(8, "Ezpeleta", "Buenos Aires", 3);
       Domicilio domicilio9=new Domicilio(9, "Monte Grande", "Buenos Aires", "Pehuajo", 793);
       //CREAMOS LA SUCURSAL 
       //Tiene domicilio 4 
       sistema.agregarSucursal(domicilio4);
       Sucursal sucursal1=sistema.getLstSucursal().get(0);
       //CREAMOS EMPLEADOS
       // AGREGAMOS EMPLEADO A LISTA DE SUCURSAL
      
       //Empleado Roberto Lopez
       sistema.getLstSucursal().get(0).agregarEmpleado(44324234,"20443242349", "Roberto", "Lopez", 4242456, obraSocial3, domicilio1,false);
        Empleado empleado1=sistema.getLstSucursal().get(0).traerEmpleado(44324234);
      //Empleado Pedro Vortereni
        sistema.getLstSucursal().get(0).agregarEmpleado(442091994,"214420919949", "Pedro", "Vortereni", 662356, obraSocial3, domicilio2,true);
       Empleado empleado2=sistema.getLstSucursal().get(0).traerEmpleado(442091994);
       //Empleado Gustavo Sabina
      sistema.getLstSucursal().get(0).agregarEmpleado(4252225, "2142522257", "Gustavo", "Sabina", 63432, obraSocial2, domicilio5, false);
      Empleado empleado3=sistema.getLstSucursal().get(0).traerEmpleado(4252225);
      //Empleado Maria Sbatiny 
      sistema.getLstSucursal().get(0).agregarEmpleado(74844235,"25748442358", "Maria", "Sbatiny", 8544, obraSocial3, domicilio6, false); 
      Empleado empleado4=sistema.getLstSucursal().get(0).traerEmpleado(74844235);
      //CREAMOS CLIENTES 
      
      //Cliente Guillermo Francella 
       Cliente cliente1=new Cliente(442452, "Guillermo", "Francella", 532523, obraSocial1, domicilio1);
       //Cliente Pepito Mbakku 
       Cliente cliente2=new Cliente(525525, "Pepito", "Mbakku", 53553, obraSocial3, domicilio5);
       //Cliente Matthew Farith
       Cliente cliente3=new Cliente(5325673, "Matthew", "Farith", domiclilio3);
       //Cliente Sofia Meracia
       Cliente cliente4=new Cliente(532568, "Sofia", "Meracia", 9953, obraSocial2, domicilio7);
       //Cliente Pedro Pascal
       Cliente cliente5=new Cliente(6788437, "Pedro", "Pascal", 72348, obraSocial1, domicilio8);
       //Cliente Noelia Esperanza
       Cliente cliente6=new Cliente(9212375, "Noelia", "Esperanza", domicilio8);
       //Cliente Ammer Barqawi
       Cliente cliente7=new Cliente(126895, "Ammer", "Barqawi", 48722, obraSocial4, domicilio9);
       //Cliente Tomas Solari
       Cliente cliente8=new Cliente(7603764, "Tomas", "Solari", domicilio6);
       //Cliente Adrian Thinks
       Cliente cliente9=new Cliente(5125468, "Adrian", "Thinks", domiclilio3);
      
       // CREAMOS LABORATORIOS
      //Laboratorio 2356
      Laboratorio laboratorio1= new Laboratorio(2356, "La Maxx");
      //Laboratorio 721
      Laboratorio laboratorio2=new Laboratorio(721, "HermanosLarrel");
      //Laboratorio 29873
      Laboratorio  laboratorio3=new Laboratorio(29873, "La barata");

      //CREAMOS PRODUCTOS
      //Producto 231 Tableta de Ibuprofeno
      Producto producto1=new Producto(231, 500, true, "Tableta de Ibuprofeno con 8 comprimidos", laboratorio3);
      //Producto 672
      Producto producto2=new Producto(672, 479, false, "Shampoo Garnier Aguacate ", laboratorio3);
      //Producto 29
      Producto producto3=new Producto(29, 800, false, "Cepillo de dientes para brackets GUM", laboratorio2);
      //Producto 16
      Producto producto4=new Producto(16, 3000, true, "Vitaminas Superdin ", laboratorio1);
      //Producto 178
      Producto producto5=new Producto(178,100, false, "Packete de Gasas", laboratorio2);
      //Producto 10
      Producto producto6=new Producto(10, 6000, false, "EvaTest", laboratorio2);
      //Producto 177
      Producto producto7=new Producto(177, 60, true, "Migral 600mg 1 comprimido", laboratorio1);
      //Producto 82
      Producto producto8=new Producto(82, 1000, true, "Tableta de IbuEvanol 6 comprimidos", laboratorio3);
      //Producto 9
      Producto producto9=new Producto(9, 460, false, "Colgate Menta ", laboratorio3);

       // CREAMOS VENTAS
       //(Hora de venta 24hs todas las farmacias)

       //Venta  1-4253------------------------------------------------------------------
       sistema.getLstSucursal().get(0).agregarVenta(4253, LocalDate.of(2023,2,5), LocalTime.of(9, 30),sucursal1,cliente1,empleado1,false);
       Venta venta1=sistema.getLstSucursal().get(0).traerVenta(4253);
       //Detalle Venta
       venta1.agregardetalleVenta(producto8, 2);
       venta1.agregardetalleVenta(producto2, 4);
       
      //Venta 1-62346------------------------------------------------------------------
      sistema.getLstSucursal().get(0).agregarVenta(62346, LocalDate.of(2023, 1, 15), LocalTime.of(23, 11), sucursal1, cliente9, empleado4, true);
      Venta venta2=sistema.getLstSucursal().get(0).traerVenta(62346);
      //Detalle venta
      venta2.agregardetalleVenta(producto4, 1);
      venta2.agregardetalleVenta(producto6, 5);
      venta2.agregardetalleVenta(producto1, 2);

      //Venta 1-45615------------------------------------------------------------------
      sistema.getLstSucursal().get(0).agregarVenta(45615, LocalDate.of(2023, 2, 6), LocalTime.of(14,42), sucursal1, cliente5, empleado3, true);
      Venta venta3=sistema.getLstSucursal().get(0).traerVenta(45615);
      //Detalle venta
      venta3.agregardetalleVenta(producto7, 6);

      //Venta 1-8321------------------------------------------------------------------
      sistema.getLstSucursal().get(0).agregarVenta(8321, LocalDate.of(2023, 9, 21), LocalTime.of(2, 31), sucursal1, cliente8, empleado2, false);
      Venta venta4=sistema.getLstSucursal().get(0).traerVenta(8321);
      //Detalle venta
      venta4.agregardetalleVenta(producto9, 1);
      venta4.agregardetalleVenta(producto4, 4);
      venta4.agregardetalleVenta(producto3, 2);

      //Venta 1-5167------------------------------------------------------------------
      sistema.getLstSucursal().get(0).agregarVenta(5167,LocalDate.of(2023, 10, 2),LocalTime.of(8, 11), sucursal1, cliente9, empleado4, true);
      Venta venta5=sistema.getLstSucursal().get(0).traerVenta(5167);
      //Detalle venta
      venta5.agregardetalleVenta(producto5, 6);
      //JSON
      JSONObject jasonDomicilio=new JSONObject();
      jasonDomicilio.put("ID :",sucursal1.getDomicilio().getId());
      jasonDomicilio.put("Provincia",sucursal1.getDomicilio().getProvincia());
      jasonDomicilio.put("Localidad: ",sucursal1.getDomicilio().getLocalidad());
      jasonDomicilio.put("Calle: ",sucursal1.getDomicilio().getCalle());
      jasonDomicilio.put("Numero de Calle: ",sucursal1.getDomicilio().getNroCalle());

      JSONObject jasonEncargado=new JSONObject();
      jasonEncargado.put("Cuil: ",sucursal1.getEncargado().getCuil());
      jasonEncargado.put("DNI: ",sucursal1.getEncargado().getDni());
      jasonEncargado.put("Nombre: ",sucursal1.getEncargado().getNombre());
      jasonEncargado.put("Apellido: ",sucursal1.getEncargado().getApellido());
      


      JSONArray jsonArraySucursal=new JSONArray();
      for(Sucursal sucursal:sistema.getLstSucursal()){
        JSONObject jasonSucursal = new JSONObject();
        jasonSucursal.put("ID: ",sucursal.getIdSucursal());
        jasonSucursal.put("Encargado: ",jasonEncargado);
        jasonSucursal.put("Domicilio: ",jasonDomicilio);

        jsonArraySucursal.add(jasonSucursal);
        }
    
    



    try (FileWriter fileWriter = new FileWriter("sucursales.json")) {
      fileWriter.write(jsonArraySucursal.toJSONString());
      fileWriter.flush();
  } catch (IOException e) {
      e.printStackTrace();
  }

 
  }
}
