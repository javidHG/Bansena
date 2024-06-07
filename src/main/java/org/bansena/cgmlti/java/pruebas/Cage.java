package org.bansena.cgmlti.java.pruebas;

//<E>: UN TIPO DE DATO GENERICO
//Puede ser cualquier tipo de objeto
public class Cage<E extends IComportamientoAnimal> {
    // Una jaula ouede tener dos mascotas
    // las mascotas pueden ser del tipo que sean
    // Pero ambos deben ser del mismo tipo

    private E mascota1;
    private E mascota2;

    public E getMascota1() {
        return mascota1;
    }

    public E getMascota2() {
        return mascota2;
    }

    public void setMascota1(E mascota1) {
        this.mascota1 = mascota1;
    }

    public void setMascota2(E mascota2) {
        this.mascota2 = mascota2;
    }

    // Comportamieto para alimetar mascota
    public void alimentarMascotas() {
        this.mascota1.alimentarse("purina");

    }

}
