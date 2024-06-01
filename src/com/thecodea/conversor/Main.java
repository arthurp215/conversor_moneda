package com.thecodea.conversor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String monedaPrincipal = "", monedaSecundaria = "";
        float cantidad;
        boolean etapa = true;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(menu());
            try {
                var tipoCambio = sc.nextInt();

                if (tipoCambio == 0) break;

                switch (tipoCambio) {
                    case 1:
                        monedaPrincipal = "MXN";
                        monedaSecundaria = "USD";
                        break;
                    case 2:
                        monedaPrincipal = "USD";
                        monedaSecundaria = "MXN";
                        break;
                    case 3:
                        monedaPrincipal = "MXN";
                        monedaSecundaria = "EUR";
                        break;
                    case 4:
                        monedaPrincipal = "EUR";
                        monedaSecundaria = "MXN";
                        break;
                    case 5:
                        monedaPrincipal = "MXN";
                        monedaSecundaria = "COP";
                        break;
                    case 6:
                        monedaPrincipal = "COP";
                        monedaSecundaria = "MXN";
                        break;
                    default:
                        System.out.println("Opción invalida, intentelo de nuevo");
                        etapa = false;
                        break;
                }

                if (etapa) {
                    System.out.print("Ingresa la cantidad a convertir: ");
                    cantidad = sc.nextFloat();

                    System.out.println("*******************************************");
                    System.out.println("\nLa cantidad de " + cantidad + " " + monedaPrincipal
                            + " corresponde a la cantidad final de "
                            + new ConvertirMoneda(monedaPrincipal, monedaSecundaria, cantidad).convertirMoneda()
                            + " " + monedaSecundaria);
                }
            } catch (InputMismatchException e) {
                System.out.println("\nSeleccione solamente números, sea en el menú o en la cantidad a convertir");
                sc.next();
            }
        }
    }

    public static String menu () {
        return """
                \n*******************************************
                Bienvenido al Conversor de monedas c:
                
                1. Peso Mexicano -> Dolar
                2. Dólar -> Peso Mexicano 
                3. Peso Mexicano -> Euro
                4. Euro -> Peso Mexicano
                5. Peso Mexicano -> Peso Colombino
                6. Peso Colombiano a Peso Mexicano
                0. Salir
                
                Seleccione una opción valida:
                """;
    }

}
