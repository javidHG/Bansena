package org.bansena.cgmlti.java.pruebas;

public class Cat
 implements IComportamientoAnimal{

    @Override
    public void alimentarse(String comida) {
      System.out.println("miau me alimente de:" + comida);
    }

}
