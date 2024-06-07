package org.bansena.cgmlti.java.entidad;

import java.time.LocalDate;


// Definición de la clase TarjetaDebito con un tipo genérico T que extiende de Habitante

    public class TarjetaDebito<T extends Habitante, U extends DecretoGubernamental> {

    // Atributos de la clase TarjetaDebito
    private Long numeroTarjeta; // Número de la tarjeta de débito
    private LocalDate fechaVencimiento; // Fecha de vencimiento de la tarjeta de débito
    private Double tope; // Límite de gasto permitido en la tarjeta de débito
    private CuotaManejo<U> cuotaManejo; // Cuota de manejo relacionada con el decreto gubernamental
    
    public TarjetaDebito(Long numeroTarjeta, LocalDate fechaVencimiento, Double tope, CuotaManejo<U> cuotaManejo) {
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.tope = tope;
        this.cuotaManejo = cuotaManejo;
    }
    public Long getNumeroTarjeta() {
        return numeroTarjeta;
    }
    public void setNumeroTarjeta(Long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public Double getTope() {
        return tope;
    }
    public void setTope(Double tope) {
        this.tope = tope;
    }
    public CuotaManejo<U> getCuotaManejo() {
        return cuotaManejo;
    }
    public void setCuotaManejo(CuotaManejo<U> cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }
    //Metodos toString
    @Override
    public String toString() {
        return "TarjetaDebito [numeroTarjeta=" + numeroTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", tope="
                + tope + ", cuotaManejo=" + cuotaManejo + "]";
    }
    


    }   

