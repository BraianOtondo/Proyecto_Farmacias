package test;

import modelo.*;
import java.time.LocalDate;
import java.time.LocalTime;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
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
       Domicilio domicilio10=new Domicilio(10, "Ezpeleta", "Buenos Aires", 3);
       
       Domicilio domicilio11=new Domicilio(11,"Lanus", "Buenos Aires", "25 de Mayo", 555);
       Domicilio domicilio12=new Domicilio(12,"Lanus","Buenos Aires","2 de Mayo",1383);
       Domicilio domicilio13=new Domicilio(13, "Gerli", "Buenos Aires","Hipolito Yrigoyen",4545);
       Domicilio domicilio14=new Domicilio(14,"Remedios de Escalada","Buenos Aires","Rosales",587);
       Domicilio domicilio15=new Domicilio(15,"Banfield","Buenos Aires","Antonio Beruti",977);
       Domicilio domicilio16=new Domicilio(16, "Banfield", "Buenos Aires", "Tucuman",1860);
 
       
       //CREAMOS LA SUCURSALES
       //Sucursal1
       sistema.agregarSucursal(domicilio4);
       Sucursal sucursal1=sistema.getLstSucursal().get(0);       
       //Sucursal 2
       sistema.agregarSucursal(domicilio11);
       Sucursal sucursal2=sistema.getLstSucursal().get(1);
       
       
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
      
      //Empleados Sucursal 2
      sistema.getLstSucursal().get(1).agregarEmpleado(42522794,"27425527943", "Rocio", "Torres", 1547821, obraSocial2, domicilio12,true);
       Empleado empleado5=sistema.getLstSucursal().get(1).traerEmpleado(42522794);
       
       sistema.getLstSucursal().get(1).agregarEmpleado(48961255,"20489612559", "Jose", "Rodriguez", 554478, obraSocial2, domicilio13,false);
      Empleado empleado6=sistema.getLstSucursal().get(1).traerEmpleado(48961255);
      
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
       //Cliente Roberto Gonzalez
       Cliente cliente10=new Cliente(115423, "Roberto", "Gonzalez", 336604, obraSocial4, domicilio14);
       //Cliente Ivana Mendez
       Cliente cliente11=new Cliente(997700, "Ivana", "Mendez", 895401, obraSocial2, domicilio15);
       //Cliente Santiago Mena
       Cliente cliente12=new Cliente(485926, "Santiago", "Mena",181878,obraSocial1, domicilio16);


       
      
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
       //(Hora de venta 24h todas las farmacias)

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
      
      //--------------------------------------------------------------
      
      //Ventas Sucursal 2
      sistema.getLstSucursal().get(1).agregarVenta(5566, LocalDate.of(2023,2,25), LocalTime.of(19, 30),sucursal2,cliente10,empleado6,false);
      Venta venta6=sistema.getLstSucursal().get(1).traerVenta(5566);
      //Detalle de Venta
      venta6.agregardetalleVenta(producto4, 3);

     sistema.getLstSucursal().get(1).agregarVenta(98743, LocalDate.of(2023, 3, 3), LocalTime.of(14, 11), sucursal2, cliente11, empleado6, true);
     Venta venta7=sistema.getLstSucursal().get(1).traerVenta(98743);
     //Detalle de venta
     venta7.agregardetalleVenta(producto5, 1);
     venta7.agregardetalleVenta(producto2, 5);
     venta7.agregardetalleVenta(producto3, 1);

     sistema.getLstSucursal().get(1).agregarVenta(33114, LocalDate.of(2023, 4, 8), LocalTime.of(9,06), sucursal2, cliente12, empleado6, false);
     Venta venta8=sistema.getLstSucursal().get(1).traerVenta(33114);
     //Detalle de venta
     venta8.agregardetalleVenta(producto6, 2);
     venta8.agregardetalleVenta(producto3, 1);
     venta8.agregardetalleVenta(producto1, 1);
      
      
      //JSON
      
      //JSON Sucursales
      JSONObject jsonDomicilio=crearJsonDomicilio(sucursal1.getDomicilio());
      JSONObject jsonEncargado=crearJsonEmpleado(sucursal1.getEncargado());
      JSONArray jsonArraySucursal=crearJsonArraySucursal(sistema.getLstSucursal(),jsonEncargado, jsonDomicilio);
      String contenido = jsonArraySucursal.toString();
        contenido = aplicarSaltosLineaObjetosAnidados(contenido);

    try (FileWriter fileWriter = new FileWriter("sucursales.json")) {
      //fileWriter.write(jsonArraySucursal.toJSONString());
      fileWriter.write(contenido);
      fileWriter.flush();
  } catch (IOException e) {
      e.printStackTrace();
  }

  //JSON Ventas
  JSONObject jsonVentas;
  JSONObject jsonEmpleado=crearJsonEmpleado(sucursal1.getLstEmpleado().get(0));
  JSONObject jsonCliente=crearJsonCliente();
  JSONArray jsonArrayVenta=crearJsonArrayVenta(sucursal1.getLstVenta());
  String contenido = jsonArrayVenta.toString();
    contenido = aplicarSaltosLineaObjetosAnidados(contenido);

try (FileWriter fileWriter = new FileWriter("ventas.json")) {
  //fileWriter.write(jsonArraySucursal.toJSONString());
  fileWriter.write(contenido);
  fileWriter.flush();
} catch (IOException e) {
  e.printStackTrace();
}

 
  }

  public static JSONArray crearJsonArrayVenta(List<Venta> lstVenta){
    JSONArray jsonArrayVenta=new JSONArray();

    for(Venta venta:lstVenta){
      JSONObject jsonVenta = new JSONObject();
      JSONObject jsonEmpleado= crearJsonEmpleado(venta.getEmpleado());
      JSONObject jsonCliente=crearJsonCliente(venta.getCliente());
      //ESTO HAY QUE HACER LO MISMO COMO SUCURSALES con FOR 
      //JSONObject jsonDetalleVenta=crearJsonDetalleVenta(venta.ge)
      jsonVenta.put("Ticket: ",venta.getNroTicket());
      jsonVenta.put("Ticket Fiscal: ",venta.getTicketFiscal());
      jsonVenta.put("Fecha: ",venta.getFecha());
      jsonVenta.put("Hora: ",venta.getHora());
      jsonVenta.put("Efectivo: ",venta.isEfectivo());
      jsonVenta.put("Empleado: ",jsonEmpleado);
      jsonVenta.put("Cliente: ",jsonCliente);
      jsonVenta.put("Detalle Venta", jsonArrayVenta);
      jsonArrayVenta.add(jsonVenta);
  
      }
    return jsonArrayVenta;
  }
  
public static JSONObject crearJsonDetalleVenta(DetalleVenta detalleVenta){
  JSONObject jsonDetalleVenta=new JSONObject();
  JSONObject jsonProducto=crearJsonProducto(detalleVenta.getProducto());
  jsonDetalleVenta.put("Cantidad: ",detalleVenta.getCantidad());
  jsonDetalleVenta.put("Producto: ",jsonProducto);
  
  return jsonDetalleVenta;
}

public static JSONObject crearJsonProducto(Producto producto){
  JSONObject jsonProducto=new JSONObject();
  jsonProducto.put("ID: ",producto.getIdProducto());
  jsonProducto.put("Descipcion: ",producto.getDescripcion());
  jsonProducto.put("Precio: ",producto.getPrecio());

return jsonProducto;
}

public static JSONObject crearJsonDomicilio(Domicilio domicilio){
  JSONObject jsonDomicilio=new JSONObject();
  jsonDomicilio.put("ID :",domicilio.getId());
  jsonDomicilio.put("Provincia",domicilio.getProvincia());
  jsonDomicilio.put("Localidad: ",domicilio.getLocalidad());
  jsonDomicilio.put("Calle: ",domicilio.getCalle());
  jsonDomicilio.put("Numero de Calle: ",domicilio.getNroCalle());

  return jsonDomicilio;
}

public static JSONObject crearJsonEmpleado(Empleado empleado){
  JSONObject jsonEmpleado=new JSONObject();
  jsonEmpleado.put("Cuil: ",empleado.getCuil());
  jsonEmpleado.put("DNI: ",empleado.getDni());
  jsonEmpleado.put("Nombre: ",empleado.getNombre());
  jsonEmpleado.put("Apellido: ",empleado.getApellido());
  return jsonEmpleado;
}

public static JSONArray crearJsonArraySucursal(List<Sucursal> lstSucursal,JSONObject jsonEncargado,JSONObject jsonDomicilio){
  JSONArray jsonArraySucursal=new JSONArray();

  for(Sucursal sucursal:lstSucursal){
    JSONObject jsonSucursal = new JSONObject();
    jsonSucursal.put("ID: ",sucursal.getIdSucursal());
    jsonSucursal.put("Encargado: ",jsonEncargado);
    jsonSucursal.put("Domicilio: ",jsonDomicilio);
    
    jsonArraySucursal.add(jsonSucursal);

    }
    return jsonArraySucursal;
}

public static JSONObject crearJsonCliente(Cliente cliente){
  JSONObject jsonCliente=new JSONObject();

  jsonCliente.put("Nombre: ",cliente.getNombre());
  jsonCliente.put("Apellido: ",cliente.getNombre());
  jsonCliente.put("DNI: ",cliente.getDni());
  jsonCliente.put("Numero afiliado: ",cliente.getNro_afiliado());

  return jsonCliente;
}

public static JSONObject crearJsonObraSocial(ObraSocial obraSocial){
	JSONObject jsonObrasocial=new JSONObject();
	jsonObrasocial.put("Nombre: ",obraSocial.getNombre());
	jsonObrasocial.put("Codigo: ",obraSocial.getCodigo());
	return jsonObrasocial;
}

public static String aplicarSaltosLineaObjetosAnidados(String json) {
    StringBuilder resultado = new StringBuilder();
    int nivel = 0;

    for (char c : json.toCharArray()) {
        if (c == '{' || c == '[') {
            nivel++;
            resultado.append(c).append("\n").append(indentar(nivel));
        } else if (c == '}' || c == ']') {
            nivel--;
            resultado.append("\n").append(indentar(nivel)).append(c);
        } else if (c == ',') {
            resultado.append(c).append("\n").append(indentar(nivel));
        } else {
            resultado.append(c);
        }
    }

    return resultado.toString();
}

public static String indentar(int nivel) {
    StringBuilder espacios = new StringBuilder();

    for (int i = 0; i < nivel; i++) {
        espacios.append("    "); // 4 espacios por nivel
    }

    return espacios.toString();
}

}
