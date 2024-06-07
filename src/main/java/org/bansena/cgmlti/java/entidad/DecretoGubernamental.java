package org.bansena.cgmlti.java.entidad;
import java.time.LocalDate;

public class DecretoGubernamental {

    private long Numero;
    private LocalDate año;
    
    public DecretoGubernamental(long numero, LocalDate año) {
        Numero = numero;
        this.año = año;
    }
    public long getNumero() {
        return Numero;
    }
    public void setNumero(long numero) {
        Numero = numero;
    }
    public LocalDate getAño() {
        return año;
    }
    public void setAño(LocalDate año) {
        this.año = año;
    }
    @Override
    public String toString() {
        return "DecretoGubernamenta Numero=" + Numero + ", año=" + año + "";
    }

}
