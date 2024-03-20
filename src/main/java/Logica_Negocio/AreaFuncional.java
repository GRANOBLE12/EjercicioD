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
public class AreaFuncional {
    private String tipoArea;
    private int noArea;
    public ArrayList<Computador>listacompus;

    public AreaFuncional(){
        
    }

    public AreaFuncional(String tipoArea, int noArea, ArrayList<Computador> listacompus) {
        this.tipoArea = tipoArea;
        this.noArea = noArea;
        this.listacompus = listacompus;
    }

    public String getTipoArea() {
        return tipoArea;
    }

    public void setTipoArea(String tipoArea) {
        this.tipoArea = tipoArea;
    }

    public int getNoArea() {
        return noArea;
    }

    public void setNoArea(int noArea) {
        this.noArea = noArea;
    }

    public ArrayList<Computador> getListacompus() {
        return listacompus;
    }

    public void setListacompus(ArrayList<Computador> listacompus) {
        this.listacompus = listacompus;
    }
    
}
