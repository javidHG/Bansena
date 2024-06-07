package org.bansena.cgmlti.java.entidad;

import java.time.LocalDate;

// Clase abstracta Habitante
public abstract class Habitante {

    // Atributos de la clase Habitante
    protected double valor; // Valor asociado al habitante
    protected LocalDate fechaInicio; // Fecha de inicio de la relación con el habitante
    protected LocalDate fechaFin; // Fecha de fin de la relación con el habitante

    // Constructor de la clase Habitante
    public Habitante(double valor, LocalDate fechaInicio, LocalDate fechaFin) {
        this.valor = valor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Método getter para obtener la fecha de inicio
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    // Método setter para establecer la fecha de inicio
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    // Método getter para obtener la fecha de fin
    public LocalDate getFechaFin() {
        return fechaFin;
    }

    // Método setter para establecer la fecha de fin
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Método getter para obtener el valor
    public double getValor() {
        return valor;
    }

    // Método setter para establecer el valor
    public void setValor(double valor) {
        this.valor = valor;
    }
}
