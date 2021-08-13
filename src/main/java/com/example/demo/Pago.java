package com.example.demo;

import java.util.Scanner;

public class Pago {
    MetodosDePago metodoDePago;
    double montoPagado;

    public MetodosDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodosDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void recibirPago() {
        Scanner sc = new Scanner(System.in);
        System.out.println("elija un metodo de pago");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de Credito");
        System.out.println("3. E-pago");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                this.metodoDePago = new PagoEfectivo();
                break;
            }
            case 2: {
                this.metodoDePago = new PagoTarjeta();
                break;
            }
            case 3: {
                this.metodoDePago = new PagoElectronico();
                break;
            }
        }

        System.out.println("Ingrese el monto a pagar");
        double montoAPagar = sc.nextDouble();

        montoPagado = metodoDePago.procesarPago(montoAPagar);
        imprimirPago();
    }

    public void imprimirPago() {
        System.out.println("Usted a abonado " + montoPagado);
    }
}
