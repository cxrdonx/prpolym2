package com.mycompany.herenciaYpolimofrismo;
import java.util.*;
public class menu {
   public static ArrayList<csEmpleado1> listaempleado = new ArrayList();
   public static ArrayList<csPuesto>listaPuesto=new ArrayList();
   public static ArrayList<csVehiculo>listaVehiculo=new ArrayList();
   public static ArrayList<csUsuario>listaUsuario=new ArrayList();
    public static void main(String[] args) {
        menu();
        csNomina();
        reparacionVehiculo();
    }
    public static void menu(){
        int op;
        Scanner in = new Scanner (System.in);
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Nomina");
        System.out.println("2. asignar puesto empleado");
        System.out.println("3. Reparacion de vehiculo");
        System.out.println("4. notas estudiantes");
        System.out.println("5. cuenta bancaria");
        op = in.nextInt();
                 switch(op){
                     case 1: csNomina();menu();break;
                     case 2: asignarPuesto();menu();break;
                     case 3: reparacionVehiculo(); menu(); break;
                     case 4: notasEstudiantes();menu();break;
                     case 5: cuentaBancaria();menu();break;
                     default : System.out.println("no disponible");break; 
                     
                 }
    }
    public static void csNomina(){
        int  telefono, sueldo;
        String nombre, direccion;
        int cantidad;
        Scanner in = new Scanner (System.in);
        System.out.println("Numero de trabajadores a ingresar:");
           cantidad = in.nextInt();
           csEmpleado1 e;
                 for(int i = 0 ; i<cantidad; i++){
        System.out.println("ingrese el nombre");
        nombre = in.nextLine();
        in.nextLine();
        System.out.println("Ingrese el telefono");
        telefono = in.nextInt();
        System.out.println("Ingrese el sueldo: ");
        sueldo = in.nextInt();
        in.nextLine();
        System.out.println("ingrese la direccion: ");
        direccion = in.nextLine();
        e = new csEmpleado1(nombre, direccion, telefono, sueldo);
        listaempleado.add(e);
                 
                 
               int idNomina;  double igss; double sueldoLiquido;
               
               System.out.println("ingrese el id nomina: ");
               idNomina = in.nextInt();
                    igss = (sueldo*4.83)/100;
                    sueldoLiquido = sueldo-igss;
                csNomina n = new csNomina(idNomina, igss, sueldoLiquido);
               n.setE(listaempleado);
                     System.out.println(n.verDatos());
    }
    
}
public static void asignarPuesto(){
          Scanner in = new Scanner(System.in);
         String nombre, direccion;
         int telefono, sueldo;
         csPuesto  p;
       for(int i=0; i<5; i++){
            System.out.println("ingrese el nombre:");
            nombre = in.nextLine();
            System.out.println("ingrese la direccion: ");
            direccion = in.nextLine();
            System.out.println("Ingrese el telefono: ");
            telefono = in.nextInt();
            System.out.println("Ingrese el sueldo: ");
            sueldo = in.nextInt();
 
                   //falta asignar el constructor
//    }
       int idPuesto, sueldoPuesto, idAsignacion;
       String nombrePuesto, empleado, fechaAsignacion;
       System.out.println("ingrese el id del puesto:");
       idPuesto = in.nextInt();
       System.out.println("Ingrese el nombre del puesto: ");
       nombrePuesto=in.nextLine();
       System.out.println("ingrese el sueldo del puesto: ");
       sueldoPuesto=in.nextInt();
       System.out.println("ingrese el id asignacion: ");
       idAsignacion = in.nextInt();
       System.out.println("ingrese el empleado: ");
       empleado=in.nextLine();
       System.out.println("Ingrese la fecha de asignacion: ");
       fechaAsignacion=in.nextLine();
       
       
}
}
public static void reparacionVehiculo(){
     int modelo;
     String placa, chasis, marca, color;
       int cantidad;
     csVehiculo r;
     Scanner in = new Scanner(System.in);
     System.out.println("cuantos vehiculos desea ingresar?");
     cantidad = in.nextInt();
     for(int i=0; i<cantidad;i++){   
     System.out.println("programa de reparacin de vehiculos");
     System.out.println("Ingrese la placa del vehiculo:");
     placa = in.nextLine();
     in.nextLine();
     System.out.println("Ingrese el numero de chasis:");
     chasis=in.nextLine();
     System.out.println("Ingrese el modelo:");
     modelo=in.nextInt();
     System.out.println("Ingrese el color: ");
     color = in.nextLine();
     in.nextLine();
     System.out.println("Ingrese la marca: ");
     marca = in.nextLine();
   r = new csVehiculo( modelo, placa, chasis, color, marca);
     listaVehiculo.add(r);
     
     
     String vehiculo, tipoReparacion,caracteristicas, fechaReparacion;
     int costos;
     
         System.out.println("ingrese el vehiculo: ");
         vehiculo = in.nextLine();
         System.out.println("ingrese el tipo de reparacion: ");
         tipoReparacion =in.nextLine();
         System.out.println("ingrese las caracteristicas: ");
         caracteristicas = in.nextLine();
         System.out.println("infrese la fecha de reparacion: ");
         fechaReparacion = in.nextLine();
         System.out.println("Ingrese los costos: ");
         costos = in.nextInt();
         csReparacion v = new csReparacion(vehiculo, tipoReparacion, caracteristicas, fechaReparacion, costos);
         v.setR(listaVehiculo);
            System.out.println(v.verDatos2());
         
     }
         
}
public static void notasEstudiantes(){
}
public static void cuentaBancaria(){
    String uNombre, direccion;
     int telefono, cantidad;
    csUsuario b;
    Scanner in = new Scanner(System.in);
    System.out.println("cuantos usuarios desea ingresar?");
    cantidad = in.nextInt();
    for(int i=0; i<cantidad;i++){
      System.out.println("cuenta bancaria");
      System.out.println("Ingrese el nombre del usuario: ");
      uNombre=in.nextLine();
      in.nextLine();
      System.out.println("Ingrese la direccion: ");
      direccion = in.nextLine();
      System.out.println("ingrese el telefono: ");
      telefono = in.nextInt();
      b=new csUsuario(uNombre, direccion, telefono);
      listaUsuario.add(b);
        
      int idBanco, saldo;
      String nombreBanco, tipoCuenta, usuario;
      
          System.out.println("ingrese el id del banco: ");
          idBanco = in.nextInt();
          System.out.println("Ingrese el saldo: ");
          saldo = in.nextInt();
          System.out.println("Ingrese el nombre del banco: ");
          nombreBanco = in.nextLine();
          in.nextLine();
          System.out.println("ingrese el tipo de cuenta: ");
          tipoCuenta = in.nextLine();
          System.out.println("ingrese el usuario: ");
          usuario = in.nextLine();
          cscuentaBancaria c = new cscuentaBancaria(idBanco, saldo, nombreBanco,tipoCuenta,usuario);
          c.setB(listaUsuario);
           System.out.println(c.verDatos3());
    }
}
}