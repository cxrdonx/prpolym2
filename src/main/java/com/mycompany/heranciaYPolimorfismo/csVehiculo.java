package com.mycompany.herenciaYpolimofrismo;
      import java.util.*;
public class csVehiculo {
    int modelo;
     String placa, chasis, color, marca;
 

     public csVehiculo(int modelo, String placa, String chasis, String color, String marca){
         this.modelo=modelo;
         this.placa=placa;
         this.chasis=chasis;
         this.color=color;
         this.marca=marca;
     }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

   

 @Override
    public String toString(){
        return "csVehiculo["+"modelo: "+modelo+"placa: "+placa+"chasis: "+chasis+" color: "+color+"marca: "+marca+'}';
    }  
}
