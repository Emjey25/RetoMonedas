package com.alura;

import java.util.Scanner;

public class convertidorMonedas {

    public static void convertir(String from, String to, consultarMoneda consulta, Scanner scanner) {
        try {
            double cantidad;
            double cantidadConvertida;

            Moneda moneda = consulta.buscarMoneda(from, to);

            if (moneda == null || moneda.conversion_rate() <= 0) {
                System.out.println("Error: No se pudo obtener la tasa de conversión. Verifique los códigos de moneda.");
                return;
            }

            System.out.println("Ingrese la cantidad de " + from + ":");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            cantidad = scanner.nextDouble();

            cantidadConvertida = cantidad * moneda.conversion_rate();
            System.out.printf("La Tasa de conversión de hoy para %s es: 1 %s = %.2f %s\n", to, from,
                    moneda.conversion_rate(), to);
            System.out.printf("%.2f %s = %.2f %s\n", cantidad, from, cantidadConvertida, to);
        } catch (Exception e) {
            System.out.println("Ocurrió un error durante la conversión: " + e.getMessage());
        }
    }

    public static void convertirMoneda(consultarMoneda consulta, Scanner scanner) {
        System.out.println("Ingrese el Código de la moneda a convertir (ejemplo: USD):");
        String from = scanner.next().toUpperCase();

        System.out.println("Ingrese el Código de la moneda destino (ejemplo: EUR):");
        String to = scanner.next().toUpperCase();

        convertir(from, to, consulta, scanner);
    }
}
