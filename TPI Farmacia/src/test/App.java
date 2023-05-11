package test;
import modelo.Domicilio;
import modelo.Empleado;
import modelo.ObraSocial;
import modelo.Sistema;
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
       
       //CREAMOS DOMICILIOS
       Domicilio domicilio1=new Domicilio(1,"Monte Grande", "Buenos Aires", "Pehuajo", 763);
       Domicilio domicilio2=new Domicilio(2,"Lanus","Buenos Aires","Alsina",323);
       Domicilio domiclilio3=new Domicilio(3, "Berazategui", "Buenos Aires",3);
       Domicilio domicilio4=new Domicilio(4,"Retiro","Buenos Aires","Leandro Alem",1134);
       Domicilio domicilio5=new Domicilio(5,"Banfield","Buenos Aires","Rosas",422);
       sistema.agregarSucursal(domicilio4);
       //CREAMOS EMPLEADOS
       // AGREGAMOS EMPLEADO A LISTA DE SUCURSAL
       sistema.getLstSucursal().get(0).agregarEmpleado(44324234, "Roberto", "Lopez", 4242456, obraSocial3, domicilio1,"20443242349",false);

       sistema.getLstSucursal().get(0).agregarEmpleado(442091994, "Pedro", "Vortereni", 662356, obraSocial3, domicilio2,"214420919949",true);

       System.out.println(sistema.getLstSucursal().get(0).toString());
        
    }
}
