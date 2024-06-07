package org.bansena.cgmlti.java.entidad;
import java.time.LocalDate;


public class Prueba {

    public static void main(String[] args) {
         DecretoGubernamental decreto1 = new DecretoGubernamental(7654, LocalDate.of(2024, 8, 4));

        CuotaManejo<DecretoGubernamental> cuotaManejo = new CuotaManejo<>(
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 12, 31),
                100.0,
                decreto1
        );

        TarjetaDebito<Habitante, DecretoGubernamental> tarjetaDebito1 = new TarjetaDebito<>(
                123456789L, // Número de tarjeta
                LocalDate.of(2025, 12, 31), // Fecha de vencimiento
                500.0, // Tope
                cuotaManejo // Cuota de manejo
        );

        
        CuentaBancaria cuentaBancaria = new CuentaBancaria(
                123456789L, // Número de cuenta
                1000.0, // Saldo
                "USD", // Divisa
                tarjetaDebito1 // Tarjeta de débito
        );

        Titular titular = new Titular("Javid", 
        1016834106L, 
        cuentaBancaria);



        System.out.println("Datos del tiular con todas las clases");
        System.out.println(titular);





    }
}
