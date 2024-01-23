package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        String nombreFruta;
        boolean estaEnTemporada=true;
        Integer costoCargar;

        System.out.print("Ingrese Fruta: ");
        nombreFruta=lea.nextLine();

        System.out.println("Esta en Temporada");
        estaEnTemporada=lea.nextBoolean();

        if(estaEnTemporada==true){
            System.out.println("La Fruta es Colombiana ");
            boolean esColombiana=lea.nextBoolean();
            if(esColombiana==true){
                costoCargar=100000;
                System.out.println("El costo es: "+costoCargar);
            }else{
                costoCargar=200000;
                System.out.println("El costo es: "+costoCargar);
            }
        }else{
            costoCargar=350000;
            System.out.println("El costo es: "+costoCargar);
        }

    }
}