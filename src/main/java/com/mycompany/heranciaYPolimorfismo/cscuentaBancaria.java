
package com.mycompany.herenciaYpolimofrismo;
   import java.util.*;

public class cscuentaBancaria {
      public int idBanco, saldo;
      public String nombreBanco, tipoCuenta, usuario;
      public ArrayList<csUsuario>b;

public cscuentaBancaria(int idBanco, int saldo, String nombreBanco, String tipoCuenta, String usuario){
      this.idBanco=idBanco;
      this.saldo=saldo;
      this.nombreBanco=nombreBanco;
      this.tipoCuenta=tipoCuenta;
      this.usuario=usuario;
      
}

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList<csUsuario> getB() {
        return b;
    }

    public void setB(ArrayList<csUsuario> b) {
        this.b = b;
    }
       public String verDatos3(){
           String datos ="";
          for(int i=0;i<b.size ();i++){
           datos = datos+"nombre: "+b.get(i).getUnombre()+", tipo de la cuenta: "+this.tipoCuenta+", nombre del banco: "+this.nombreBanco+", Saldo: "+this.saldo;
}
          return datos;
       }





}