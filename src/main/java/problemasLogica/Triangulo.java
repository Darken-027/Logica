
/*
    Programa que de divisas
    Autor: Juan Dadiv Plaza
    Fecha: 8 Diciembre 2024
    Licencia: GNU GPL v3
*/


/*
Problema:
La profesora de matematicas de juan le solicita manejar la informacion referente aun triangulo.
un triangulo tiene base y una altura. juan necesita conocer dichos datos y efectuar el calculo del aera
sin embargo, la profesora solo quiere que muestre el valor del area, si esta es positiva, en otro caso 
debe mostrar un mensaje mostrando un incoveniente.

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
public class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura = 0;
        double base = 0;
        double area = 0;
        
        System.out.print("Ingrese la altura: ");
        altura = entrada.nextDouble();
        
        System.out.print("Ingrese la base: ");
        base = entrada.nextDouble();
        
        area = (altura * base) / 2;
        
        if (area >= 0.0) {
            System.out.println("El area es: " + area);
        }else{
            System.out.println("No se muestra area Negativa");
        }
       
    }
}


/*
Abstraccion
-Que se solicita finalmente?(Problema)
    Calcular el area del triangulo

-Que informacion es relevante dado el problema anterior ?
    base
    altura

Descomposicion
-Que acciones se requieren para resolver el problema
    Ingresar la base
    Ingresar la altura
    Calcular el area del triangulo
    Generar el mensaje del area
    Mostrar los resultados

Reconocimiento de patrones
-Que puedo reutilizar de la solucion de otros problemas ?
     
*/