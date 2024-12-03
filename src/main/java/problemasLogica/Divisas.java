/*
    Programa que de divisas
    Autor: Juan Dadiv Plaza
    Fecha: 1 Diciembre 2024
    Licencia: GNU GPL v3
*/

/* 
Problema:
La empresa "Divisas S.A", de la ciudad de Armenia, necesita un programa la tasa representativa del mercado (TMR)
-sin centavos-, es decir, la cantidad de pesos necesarios para comprar un dolar estadounidense.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemasLogica;

import java.util.Scanner;

/**
 *
 * @author Juan Plaza
 */
public class Divisas {
    /* Funcion principal */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        int valor_trm = 0;
        
        System.out.println("Ingrese el valor TRM");
        valor_trm = en.nextInt();
        
        System.out.println("El valor del TRM es: " + valor_trm);
    }
}



