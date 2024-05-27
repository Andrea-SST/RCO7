package com.ejercicios3;

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
	
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        HashMap<String, String> capitales = new HashMap<>();

        capitales.put("Canadá", "Ottawa");
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José");
        capitales.put("El Salvador", "San Salvador");
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String pais = "";
        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = s.nextLine();

            if (!pais.equalsIgnoreCase("salir")) {
                if (capitales.containsKey(pais)) {
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de " + pais + "?: ");
                    String capital = s.nextLine();
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!pais.equalsIgnoreCase("salir"));

        s.close();
    }
}
