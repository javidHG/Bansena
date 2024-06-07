package org.bansena.cgmlti.java.pruebas;

public class PruebaJaulas {
public static void main(String[] args) {
    //Primera jaula solo va a albergar perros
    Dog perro1 = new Dog();
    Dog perro2 = new Dog();
    Cat gato1 = new Cat();

    Cage <Dog> jaula1 = new Cage<>();
    jaula1.setMascota1(perro1);
    jaula1.setMascota2 (perro2);
    jaula1.alimentarMascotas();

    Cage<Cat> JaulaGatos = new Cage<Cat>();
    JaulaGatos.setMascota1(gato1);

}
}
