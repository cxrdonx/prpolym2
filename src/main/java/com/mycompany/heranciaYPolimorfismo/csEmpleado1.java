
package com.mycompany.herenciaYpolimofrismo;

public class csEmpleado1 {
    String nombre, direccion;
    int telefono, sueldo; 
    
  public csEmpleado1(String nombre, String direccion, int telefono, int sueldo){
      this.nombre = nombre;
      this.direccion = direccion;
      this.telefono = telefono;
      this.sueldo = sueldo;    
  }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        return "csEmpleado1{" + "nombre =" + nombre + "direccion = "+direccion+"Telefono ="+telefono+"sueldo="+sueldo+'}';
    }
    }

   
    

