
package com.mycompany.herenciaYpolimofrismo;
import java.util.*;

public class csUsuario {
        String uNombre, direccion;
        int telefono;
        
     public csUsuario(String uNombre, String direccion, int telefono){
         this.uNombre=uNombre;
         this.direccion=direccion;
         this.telefono=telefono;
}

    public String getUnombre() {
        return uNombre;
    }

    public void setuNombre(String nombre) {
        this.uNombre = uNombre;
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
 
     @Override
     public String toString(){
         return "csUsuario{"+"nombre: "+uNombre+"direccion: "+direccion+"telefono: "+telefono+'}';
     }

}
