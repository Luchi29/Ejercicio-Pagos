package com.example.demo;

import java.util.Scanner;

public class PagoTarjeta implements MetodosDePago{
    @Override
    public double procesarPago(double montoPagado) {
        Scanner in = new Scanner(System.in);
        String numeroTarjeta;
        System.out.println("Ingrese el numero de tarjeta");
        numeroTarjeta = in.nextLine();
        double montoConRecargo = montoPagado * 1.01;
        return montoConRecargo;
    }
}
