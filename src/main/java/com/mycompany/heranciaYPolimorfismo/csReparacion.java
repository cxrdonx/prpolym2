package com.mycompany.herenciaYpolimofrismo;

import java.util.ArrayList;

public class csReparacion {
      public String vehiculo, tipoReparacion,caracteristicas, fechaReparacion;
      public int costos;
         public ArrayList<csVehiculo> r;
    
    public csReparacion(String vehiculo, String tipoReparacion, String fechaReparacion,String carateristicas, int costos){
        this.vehiculo=vehiculo;
        this.tipoReparacion=tipoReparacion;
        this.caracteristicas=caracteristicas;
        this.fechaReparacion=fechaReparacion;
        this.costos=costos;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(String fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public int getCostos() {
        return costos;
    }

    public void setCostos(int costos) {
        this.costos = costos;
    }
    public ArrayList<csVehiculo> getR() {
        return r;
    }

    public void setR(ArrayList<csVehiculo> r) {
        this.r = r;
    }

   public String verDatos2(){
       String verVehiculo = "";
       for(int i= 0; i<r.size();i++){
         verVehiculo = verVehiculo + "placa del vehiculo : "+this.vehiculo+" tipo de reparacion : "+this.tipoReparacion+" costos: "+this.costos+" fecha de reparacion: "+this.fechaReparacion;
        
     }
   return verVehiculo;
}
    
}
