/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.AreaFuncional;
import Logica_Negocio.Empresa;
import Logica_Negocio.Fecha;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class HelpersImpresion {
    public static void MostrarDetalleEmpresa(Empresa objEmpresa)
    {
         
        ArrayList<Persona> listapersonas= objEmpresa.getListaPersonas();
     
        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println("\n"+ "Persona No: "+"\t"+ (i+1));
            System.out.println("Nombre: "+"\t"+ listapersonas.get(i).getNombre());
            System.out.println("Identificacion: "+"\t"+ listapersonas.get(i).getIdentificacion());
            Fecha objFecha= listapersonas.get(i).getObjFecha();
            System.out.println("Fecha de nacimiento: "+"\t"+ objFecha.getDia()+"/" +objFecha.getMes() +"/" +objFecha.getAño() +"\n");
        }
        ArrayList<AreaFuncional> listaareas= objEmpresa.getListaAreas();
        for (int i = 0; i < listaareas.size(); i++) {
            System.out.println("Area No: "+"\t"+ listaareas.get(i).getNoArea());
            System.out.println("Tipo de area: "+"\t"+ listaareas.get(i).getTipoArea());
            for (int j = 0; j < listaareas.get(i).getListacompus().size(); j++) {
                System.out.println("Marca Computador: "+"\t"+ listaareas.get(i).getListacompus().get(j).getMarca());
                System.out.println("Modelo Computador: "+"\t"+ listaareas.get(i).getListacompus().get(j).getModelo());
                System.out.println("Id computador: "+"\t"+ listaareas.get(i).getListacompus().get(j).getId()+"\n");
            }
           
        }
    }
}
