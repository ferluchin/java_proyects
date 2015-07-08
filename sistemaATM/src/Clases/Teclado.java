/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Teclado {

    Scanner sc = new Scanner(System.in);

    int intEntrada;

    public Teclado(int intEntrada) {
        this.intEntrada = intEntrada;
    }

    public int obtenerEntrada() {

        System.out.println("Ingrese un valor numerico");
        intEntrada = sc.nextInt();
        System.out.println(" Valor Ingresado es: " + intEntrada);
        return intEntrada;
    }

}
