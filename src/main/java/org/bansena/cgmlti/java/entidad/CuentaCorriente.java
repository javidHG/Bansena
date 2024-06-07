package org.bansena.cgmlti.java.entidad;

// Clase CuentaCorriente que extiende de CuentaBancaria
public class CuentaCorriente extends CuentaBancaria {

    public CuentaCorriente(Long numero, Double saldo, String divisa, TarjetaDebito tarjetadebito1) {
        super(numero, saldo, divisa, tarjetadebito1);
    }
    
}
