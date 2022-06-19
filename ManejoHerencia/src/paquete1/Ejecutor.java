/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        boolean condicion = true;
        String cadenaA = "";
        String cadenaB = ""; 
        while (condicion) {
            System.out.println("Ingrese el tipo de prestamo a ingresar");
            System.out.println("Prestamo Automovil (1)");
            System.out.println("Prestamo Educativo (2)");
            int condi = entrada.nextInt();
            if (condi != 1 && condi != 2) {
                System.out.println("Valor ingresado Fuera de Rango");
            } else {
                entrada.nextLine();
                System.out.println("Ingrese el nombre del Beneficiario");
                String beneficiario = entrada.nextLine();
                System.out.println("Ingrese el apellido del Beneficiario");
                String apellidoB = entrada.nextLine();
                System.out.println("Ingrese el Username");
                String username = entrada.nextLine();
                System.out.println("Ingrese el Tiempo de Prestamo en Meses");
                int tiempoPMeses = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese la Ciudad donde se relizara el Prestamo");
                String ciudad = entrada.nextLine();
                Persona per1 = new Persona(beneficiario, apellidoB, username);
                Prestamo pres1 = new Prestamo(per1, tiempoPMeses, ciudad);

                if (condi == 1) {
                    System.out.println("Ingrese el tipo de Automovil");
                    String tipoA = entrada.nextLine();
                    System.out.println("Ingrese la Marca del Automovil");
                    String marcaA = entrada.nextLine();
                    System.out.println("Ingrese el valor del Automovil");
                    double valorA = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoAutomovil prestAt = new PrestamoAutomovil(per1,
                            tiempoPMeses, ciudad, tipoA, marcaA, valorA);
                    cadenaA = String.format("%s%s", cadenaA,prestAt.toString());
                }
                if (condi == 2) {
                    System.out.println("Ingrese el nombre de la institucion Educativa");
                    String insEdu = entrada.nextLine();
                    System.out.println("Ingrese las siglas de la Instirucion Educativa");
                    String siglas = entrada.nextLine();
                    InstitucionEducativa insEd1 = new InstitucionEducativa(insEdu,
                            siglas);
                    System.out.println("Ingrese el NIvel de Estudios");
                    String nivelE = entrada.nextLine();
                    System.out.println("Ingrese el valor de la Carrera");
                    double valorC = entrada.nextDouble();
                    entrada.nextLine();
                    PrestamoEducativo prestamoEdu1 = new PrestamoEducativo(per1,
                            tiempoPMeses, ciudad, nivelE, insEd1, valorC);
                    cadenaB = String.format("%s%s", cadenaB,prestamoEdu1.toString());
                }

            }
            System.out.println("Ingrese (SI) para salir y presentar los valores");
            String salir = entrada.nextLine();
            if (salir.equals("S")|| salir.equals("s")) {
                condicion = false;
            }
        }
        System.out.println("---Datos Ingresados Prestamo Automovil---");
        System.out.print(cadenaA);
        System.out.println("---Datos Ingresados Prestamo Educativo---");
        System.out.print(cadenaB);
    }
}
