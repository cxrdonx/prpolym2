package com.mycompany.herenciaYpolimofrismo;
        import java.util.*;
public class csNomina{
   public int idNomina, empleado;
   double igss, sueldoLiquido;
   public ArrayList<csEmpleado1> e; 
   

  public csNomina(int idNomina, double igss, double sueldoLiquido){
      this.idNomina= idNomina;
      this.igss = igss;
      this.sueldoLiquido = sueldoLiquido;
  }

    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }

    public double getIgss() {
        return igss;
    }

    public void setIgss(double igss) {
        this.igss = igss;
    }

    public double getSueldoLiquido() {
        return sueldoLiquido;
    }

    public void setSueldoLiquido(double sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

   
    public ArrayList<csEmpleado1>getE(){
    return e;
}
    public void setE(ArrayList<csEmpleado1>e){
        this.e = e;

}
    
    public String verDatos(){
        String datos = "";
        for (int i= 0; i<e.size(); i++){         
        
        datos = datos + " Id nomina: "+this.idNomina+ " nombre: "+e.get(i).getNombre() + " sueldo : "+e.get(i).getSueldo()+" igss: "+this.igss+" sueldo liquido: "+this.sueldoLiquido;
    }
        return datos;
    }
}




  