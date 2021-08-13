package com.example.demo;

import java.util.Scanner;

public class PagoElectronico implements MetodosDePago{
    @Override
    public double procesarPago(double montoPagado) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un correo electronico");
        String email;
        email = in.nextLine();
        double montoConRecargo;
        montoConRecargo = montoPagado * 1.005;
        return montoConRecargo;
    }
}
