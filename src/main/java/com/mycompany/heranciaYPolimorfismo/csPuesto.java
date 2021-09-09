
package com.mycompany.herenciaYpolimofrismo;

public class csPuesto {
    int idPuesto, sueldoPuesto;
    String nombrePuesto;
    public csPuesto(int idPuesto, int sueldoPuesto, String nombrePuesto){
        this.idPuesto=idPuesto;
        this.nombrePuesto=nombrePuesto;
        this.sueldoPuesto=sueldoPuesto;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public int getSueldoPuesto() {
        return sueldoPuesto;
    }

    public void setSueldoPuesto(int sueldoPuesto) {
        this.sueldoPuesto = sueldoPuesto;
    }

    public String getNombrePuesto() {
        return nombrePuesto;
    }

    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }
    @Override
    public String toString(){
        return"csPuesto{"+"idPuesto: "+idPuesto+" nombre puesto: "+nombrePuesto+"sueldoPuesto: "+sueldoPuesto+'}';
    }
}
