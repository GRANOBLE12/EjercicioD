/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelpersImpresion;
import Logica_Negocio.AreaFuncional;
import Logica_Negocio.Computador;
import Logica_Negocio.Empresa;
import Logica_Negocio.Fecha;
import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha objfechanac1 = new Fecha(01, 02, 93);
        Fecha objfechanac2 = new Fecha(01, 03, 94);
        Fecha objfechanac3 = new Fecha(01, 04, 95);
        Fecha objfechanac4 = new Fecha(01, 05, 96);

        Persona persona1 = new Persona("1020", "Santiago", objfechanac1);
        Persona persona2 = new Persona("1021", "Daniel", objfechanac2);
        Persona persona3 = new Persona("1022", "Paola", objfechanac3);
        Persona persona4 = new Persona("1023", "Juan", objfechanac4);

        ArrayList<Persona> listapersonas1 = new ArrayList<>();
        ArrayList<Persona> listapersonas2 = new ArrayList<>();

        listapersonas1.add(persona1);
        listapersonas1.add(persona2);

        listapersonas2.add(persona3);
        listapersonas2.add(persona4);

        System.out.println("Fijando Fechas de Nacimiento");

        System.out.println("Creando computadores");

        Computador compu1 = new Computador("Lenovo", "S340", 11);
        Computador compu2 = new Computador("Lenovo", "S341", 12);
        Computador compu3 = new Computador("Lenovo", "S342", 23);
        Computador compu4 = new Computador("Lenovo", "S343", 24);
        Computador compu5 = new Computador("Lenovo", "S344", 25);
        Computador compu6 = new Computador("Lenovo", "S345", 26);

        ArrayList<Computador> listacompus1 = new ArrayList<>();
        ArrayList<Computador> listacompus2 = new ArrayList<>();
        ArrayList<Computador> listacompus3 = new ArrayList<>();
//Agragacion
        listacompus1.add(compu1);
        listacompus1.add(compu2);

        listacompus2.add(compu3);
        listacompus2.add(compu4);

        listacompus3.add(compu5);
        listacompus3.add(compu6);

        AreaFuncional area1 = new AreaFuncional("contable", 1, listacompus1);
        AreaFuncional area2 = new AreaFuncional("contable", 2, listacompus2);
        AreaFuncional area3 = new AreaFuncional("financiera", 3, listacompus3);

        ArrayList<AreaFuncional> listaareafuncional1 = new ArrayList<>();
        ArrayList<AreaFuncional> listaareafuncional2 = new ArrayList<>();

        listaareafuncional1.add(area1);
        listaareafuncional1.add(area3);

        listaareafuncional2.add(area2);

        System.out.println("Creando Empresa");

        Empresa nuevaempresa = new Empresa("10-90", listaareafuncional1,listapersonas1);
        Empresa nuevaempresa1 = new Empresa("10-90", listaareafuncional2,listapersonas2);

        System.out.println("Imprimiendo empresa");
        System.out.println("\n");
        System.out.println("Empresa" + "\t" + "01");
        HelpersImpresion.MostrarDetalleEmpresa(nuevaempresa);
        System.out.println("Empresa" + "\t" + "02");
        System.out.println("\n");

        HelpersImpresion.MostrarDetalleEmpresa(nuevaempresa1);
    }
    
}
