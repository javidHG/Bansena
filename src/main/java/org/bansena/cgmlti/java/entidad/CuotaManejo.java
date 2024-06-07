package org.bansena.cgmlti.java.entidad;

import java.time.LocalDate;

public class CuotaManejo<T> {
    private LocalDate fechaInicio; // Fecha de inicio de la cuota de manejo
    private LocalDate fechaFin; // Fecha de fin de la cuota de manejo
    private Double valor; // Valor de la cuota de manejo
    private T dato;
    
    public CuotaManejo(LocalDate fechaInicio, LocalDate fechaFin, Double valor, T dato) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valor = valor;
        this.dato = dato;
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
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    @Override
    public String toString() {
        return "CuotaManejo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", valor=" + valor + ", dato="
                + dato + "]";
    }
    

}