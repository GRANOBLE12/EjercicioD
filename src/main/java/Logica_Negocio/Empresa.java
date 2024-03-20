/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class Empresa {
    private String Nit;
    public ArrayList<AreaFuncional>listaAreas;
    public ArrayList<Persona>listaPersonas;
    
    public Empresa(){
        
    }

    public Empresa(String Nit, ArrayList<AreaFuncional> listaAreas, ArrayList<Persona> listaPersonas) {
        this.Nit = Nit;
        this.listaAreas = listaAreas;
        this.listaPersonas = listaPersonas;
    }

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public ArrayList<AreaFuncional> getListaAreas() {
        return listaAreas;
    }

    public void setListaAreas(ArrayList<AreaFuncional> listaAreas) {
        this.listaAreas = listaAreas;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    
}
