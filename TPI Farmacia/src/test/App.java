package test;
import modelo.Domicilio;
import modelo.Sistema;
import java.time.LocalDate;
import java.time.LocalTime;
//import modelo.Sistema;
public class App {
    public static void main(String[] args){
       Sistema sistema=new Sistema();
       Domicilio domicilio=new Domicilio(1,"Monte Grande", "Buenos Aires", "Pehuajo", 763);
       //System.out.println(domicilio.toString());
       sistema.agregarSucursal(domicilio);
       System.out.println(sistema.getLstSucursal().get(0).toString());
        
    }
}
