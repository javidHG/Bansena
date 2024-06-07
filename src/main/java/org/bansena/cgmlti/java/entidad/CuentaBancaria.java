package org.bansena.cgmlti.java.entidad;

// Clase CuentaBancaria
public class CuentaBancaria  {

    // Atributos de la clase CuentaBancaria
    Long numero; // Número de la cuenta bancaria
    Double saldo; // Saldo de la cuenta bancaria
    String divisa; // Divisa de la cuenta bancaria
    private TarjetaDebito<Habitante, DecretoGubernamental> tarjetaDebito; // Tarjeta de débito asociada a la cuenta bancaria
    
    public CuentaBancaria(Long numero, Double saldo, String divisa,
            TarjetaDebito<Habitante, DecretoGubernamental> tarjetaDebito) {
        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
        this.tarjetaDebito = tarjetaDebito;
    }
    public Long getNumero() {
        return numero;
    }
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public String getDivisa() {
        return divisa;
    }
    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }
    public TarjetaDebito<Habitante, DecretoGubernamental> getTarjetaDebito() {
        return tarjetaDebito;
    }
    public void setTarjetaDebito(TarjetaDebito<Habitante, DecretoGubernamental> tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }
    @Override
    public String toString() {
        return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + ", divisa=" + divisa + ", tarjetaDebito="
                + tarjetaDebito + "]";
    }
   

 
}
