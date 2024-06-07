package org.bansena.cgmlti.java.pruebas;

public class PruebaMetodosGenericos {

    //Metodo genericos
    //Es un metodo que acepta parametros ajustable a cualquier tipo de darp
    static <T> void mostrarElemento(T item){
        System.out.println("El elemento ingresado es: "+ item);

    }
     public static void main(String[] args) {
        //Invocar el metodo mostrandoelemto
        mostrarElemento("Hola mundo");
    
    }
}
