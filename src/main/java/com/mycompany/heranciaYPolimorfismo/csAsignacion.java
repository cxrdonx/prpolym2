

package com.mycompany.herenciaYpolimofrismo;
import java.util.*;
public class csAsignacion {
    int idAsignacion, fechaAsignacion,empleado;
    public csAsignacion(int idAsignacion, int fechaAsignacion, int empleado){
        this.empleado=empleado;
        this.fechaAsignacion=fechaAsignacion;
        this.idAsignacion=idAsignacion;
    }

    public int getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(int idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public int getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(int fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public int getEmpleado() {
        return empleado;
    }

    public void setEmpleado(int empleado) {
        this.empleado = empleado;
    }
  
}
