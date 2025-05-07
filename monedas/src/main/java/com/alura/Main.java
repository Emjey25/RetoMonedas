package com.alura;

import static java.lang.System.out;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        consultarMoneda resuConsultarMoneda = new consultarMoneda();

        mostrarConversionRates();

        int option;
        do {
            mostrarMenu();
            option = leerOpcion(scanner);

            procesarOpcion(option, resuConsultarMoneda, scanner);
        } while (option != 9);

        scanner.close();
    }

    private static void mostrarConversionRates() {
        out.println("""
                    "conversion_rates Keys 🤑 (Latinoamérica)":
                      "ARS" | Argentina,
                      "BOB" | Bolivia,
                      "BRL" | Brasil,
                      "CLP" | Chile,
                      "COP" | Colombia,
                      "CRC" | Costa Rica,
                      "CUP" | Cuba,
                      "DOP" | República Dominicana,
                      "ECU" | Ecuador (usa USD),
                      "GTQ" | Guatemala,
                      "HNL" | Honduras,
                      "MXN" | México,
                      "NIO" | Nicaragua,
                      "PAB" | Panamá (usa USD),
                      "PEN" | Perú,
                      "PYG" | Paraguay,
                      "SRD" | Surinam,
                      "UYU" | Uruguay,
                      "VES" | Venezuela
                """);
    }

    private static void mostrarMenu() {
        out.println("\u001B[34m-------------------------------\u001B[0m"); // Azul
        out.println("\u001B[32mIngresa la opción que deseas\u001B[0m"); // Verde
        out.println("\u001B[33m1. Convertir\u001B[0m"); // Amarillo
        out.println("\u001B[31m9. Salir\u001B[0m"); // Rojo
    }

    private static int leerOpcion(Scanner scanner) {
        out.print("\u001B[34mSelecciona una opción: \u001B[0m"); // Azul
        while (!scanner.hasNextInt()) {
            out.println("\u001B[31mPor favor, ingresa un número válido.\u001B[0m"); // Rojo
            scanner.next(); // Descarta la entrada no válida
        }
        return scanner.nextInt();
    }

    private static void procesarOpcion(int option, consultarMoneda resuConsultarMoneda, Scanner scanner) {
        switch (option) {
            case 1:
                convertidorMonedas.convertirMoneda(resuConsultarMoneda, scanner);
                break;
            case 9:
                out.println("\u001B[36mGracias por utilizar ExchangeRateAPI👍\u001B[0m"); // Cian
                break;
            default:
                out.println("\u001B[31mOpción inválida. Intenta nuevamente.\u001B[0m"); // Rojo
        }
    }
}
