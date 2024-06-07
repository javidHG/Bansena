package org.bansena.cgmlti.java.pruebas;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        
    
//Metodo add de la lista raw
    List<Integer> LEnteros = new ArrayList<Integer>();
    LEnteros.add(2);
    LEnteros.add(5);
    LEnteros.add(50);
    LEnteros.add(45);
    LEnteros.add(4);

//metodo get(Indice): Saca un elemento de la lista
    //System.out.println(LEnteros.get(0));

    //recorrer lista
    for(  Object n  : LEnteros ){
        Integer numero = (Integer) n;
        System.out.println(numero);

    }
}

}
