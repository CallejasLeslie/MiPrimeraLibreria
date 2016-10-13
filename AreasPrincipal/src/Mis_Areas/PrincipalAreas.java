/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mis_Areas;

import CIRCULOS.areaCirculo;
import RECTANGULOS.areaRectangulo;
import TRIANGULOS.areaTriangulo;
import java.util.Scanner;

/**
 *
 * @author Leslie Callejas
 */
public class PrincipalAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("\nMenu de opciones\n");
            System.out.println("1.- Area Triangulo");
            System.out.println("2.- Area Circulo");
            System.out.println("3.- Area Rectangulo");
            System.out.println("ingrese la opcion deseada");
            int respuesta = leer.nextInt();

            if (respuesta == 1) {
                System.out.print("Ingrese valor de la base: ");
                int valor1 = leer.nextInt();
                System.out.print("Ingrese valor de la altura: ");
                int valor2 = leer.nextInt();
                areaTriangulo c = new areaTriangulo();
                int resultado = c.areaTriangulo(valor1, valor2);
                System.out.println("Resultado = " + resultado);
            } else if (respuesta == 2) {
                System.out.print("Ingrese valor del radio: ");
                int valor2 = leer.nextInt();
                areaCirculo c2 = new areaCirculo();
                double resultado = c2.areaCirculo( valor2);
                System.out.println("Resultado = " + resultado);

            } else if (respuesta == 3) {
                System.out.print("Ingrese base: ");
                int valor1 = leer.nextInt();
                System.out.print("Ingrese altura: ");
                int valor2 = leer.nextInt();
                areaRectangulo c3 = new areaRectangulo();
                int resultado = c3.areaTriangulo(valor1, valor2);
                System.out.println("Resultado = " + resultado);

            } else {
                System.out.println("La opcion" + respuesta + "no existe");
            }

        }
    }
}