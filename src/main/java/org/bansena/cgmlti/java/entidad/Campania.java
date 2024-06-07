package org.bansena.cgmlti.java.entidad;

import java.time.LocalDate;

// Clase Campania que extiende de Habitante
public class Campania<T>{

    // Atributos específicos de la campaña
    private String nombre; // Nombre de la campaña
    private LocalDate fechaInicio; // Fecha de inicio de la campaña
    private LocalDate fechaFin; // Fecha de fin de la campaña
 
    public Campania(String nombre, LocalDate fechaInicio, LocalDate fechaFin, T dato) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
     
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
   
}
