package test;
import modelo.Cliente;
import modelo.Domicilio;
import modelo.Empleado;
import modelo.ObraSocial;
import modelo.Sistema;
import modelo.Sucursal;

import java.time.LocalDate;
import java.time.LocalTime;
//import modelo.Sistema;
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

       // CREAMOS VENTAS
       //(Hora de venta 24hs todas las farmacias)

       sistema.getLstSucursal().get(0).agregarVenta(4253, LocalDate.of(2023,2,5), LocalTime.of(9, 30),sucursal1,cliente1,empleado1,false);
       
       System.out.println(sistema.getLstSucursal().get(0).getLstVenta().get(0).toString());
       //agregarVenta(int nroTicket, LocalDate fecha, LocalTime hora, Sucursal sucursal, Cliente cliente, Empleado empleado, boolean efectivo){
  
       
        //System.out.println(sistema.getLstSucursal().get(0).toString());
        //LocalDate fecha=LocalDate.of(2022,8,15);
		//LocalTime time = LocalTime.of(5, 30, 45, 35);
        
    }
}
