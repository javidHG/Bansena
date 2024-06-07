package org.bansena.cgmlti.java.entidad;

// Definición de la clase Titular
public class Titular {

    // Atributos de la clase Titular
    private String nombre; // Nombre del titular
    private Long numeroIdentificacion; // Número de identificación del titular
    private CuentaBancaria cuentabancaria1;

    public Titular(String nombre, Long numeroIdentificacion, CuentaBancaria cuentabancaria1) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.cuentabancaria1 = cuentabancaria1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public CuentaBancaria getCuentabancaria1() {
        return cuentabancaria1;
    }

    public void setCuentabancaria1(CuentaBancaria cuentabancaria1) {
        this.cuentabancaria1 = cuentabancaria1;
    }

    @Override
    public String toString() {
        return "Titular nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + ", cuentabancaria1="
                + cuentabancaria1 + "";
    }

}
