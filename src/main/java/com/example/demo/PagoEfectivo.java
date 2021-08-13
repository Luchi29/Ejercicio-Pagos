package com.example.demo;

public class PagoEfectivo implements MetodosDePago{

    @Override
    public double procesarPago(double montoPagado) {
        return montoPagado;
    }
}
