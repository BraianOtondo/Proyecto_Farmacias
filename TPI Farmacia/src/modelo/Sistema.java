package modelo;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Sucursal> lstSucursal= new ArrayList<Sucursal>();

    public Sistema() {
    }

    public List<Sucursal> getLstSucursal() {
        return lstSucursal;
    }

    public void setLstSucursal(List<Sucursal> lstSucursal) {
        this.lstSucursal = lstSucursal;
    }
    public Sucursal traerSucursal(Domicilio domicilio){
        Sucursal sucursal=null;
        int i=0;
        boolean encontrado=false;
        while(encontrado==false && i<this.lstSucursal.size()){
            if(this.lstSucursal.get(i).equals(sucursal)){
                sucursal=this.lstSucursal.get(i);
                encontrado=true;
            }
            i++;
        }
        return sucursal;
    }
    public Sucursal traerSucursal(int idSucursal){
        Sucursal sucursal=null;
        int i=0;
        boolean encontrado=false;
        while(encontrado==false && i<this.lstSucursal.size()){
            if(this.lstSucursal.get(i).getIdSucursal()==idSucursal){
                sucursal=this.lstSucursal.get(i);
                encontrado=true;
            }
            i++;
        }
        return sucursal;
    }


    public int traerIdSucursaldMayor(){
        int mayor=0;
        if(this.lstSucursal.size()!=0){

          mayor=this.lstSucursal.get(this.lstSucursal.size()-1).getIdSucursal();  
        }
        return mayor;
    }

    public void agregarSucursal(Domicilio domicilio){
        Sucursal objeto=this.traerSucursal(domicilio);
        if(objeto!=null){
            System.out.println("Esta sucursal ya existe con ese domicilio");

        }else{
            objeto= new Sucursal(this.traerIdSucursaldMayor()+1, domicilio);
            this.lstSucursal.add(objeto);
        }
        
    }
    public boolean eliminarProducto(int idSucursal){
		Sucursal objeto=this.traerSucursal(idSucursal);
		if(objeto==null){
            System.out.println("Esta sucursal no existe con ese domicilio");

		}
		return this.lstSucursal.remove(objeto);
	}
}
