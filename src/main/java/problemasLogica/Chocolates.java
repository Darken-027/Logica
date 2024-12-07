/*
    Programa que calcula el promedio de ventas de chocolate las ultimas 5 semanas
    Autor: Juan Dadiv Plaza
    Fecha: 3 Diciembre 2024
    Licencia: GNU GPL v3
*/

/*
Problema: 
Daniel es estudiante del colegio Casd de la ciudad de armenia y desea ir a la excursion para ello decide vender
chocolates por cinco semanas.

Cuantos chocolates en promedio vendio en las ultimas cinco semanas ?
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
public class Chocolates {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       int chocolates  = 0;
       int semanas = 0;
       int promedio = 0;
        System.out.println("Ingre la cantidad de chocolates vendido");
        chocolates = entrada.nextInt();
        
        System.out.println("Ingre la cantidad de semanas");
        semanas = entrada.nextInt();
        
        promedio = chocolates / semanas;
        
        System.out.println("La el promedio de chocolates vendido es: " + promedio);
    }
}


/*
Abstraccion:
- Que se solicita finalmente?(problema)
   Calcular cuantos chocolates en promedio vendio la ultima semana

- Que informacion es relevante dado el problema anterior?
    Chocolates vendidos en las ultimas cinco semanas
    

Desconposion:
-Que acciones se requieren para resolver el problema
    Ingresar la cantidad vendida de chocolates
    Calcular el promedio
    Generar mensaje de promedio
    Mostrar el mensaje generado

Reconocimiento de patrones
-Que puedo reutilizar de la solucion de otros problemas ?
    La funcion ingresar_entero
    La funcion mostrar_mensaje
*/