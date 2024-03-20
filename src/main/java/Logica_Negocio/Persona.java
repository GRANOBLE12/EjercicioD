/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Persona {
    private String Identificacion;
    private String Nombre;
    public Fecha objFecha;
    
    public Persona(){    
        
    }

    public Persona(String Identificacion, String Nombre, Fecha objFecha) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.objFecha = objFecha;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Fecha getObjFecha() {
        return objFecha;
    }

    public void setObjFecha(Fecha objFecha) {
        this.objFecha = objFecha;
    }
    
}
