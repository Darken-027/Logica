/*
    Programa que de divisas
    Autor: Juan Dadiv Plaza
    Fecha: 2 Diciembre 2024
    Licencia: GNU GPL v3
*/

/*
Problema:
La Gobernacion del quindio quiere mostrar en una pantalla la temperatura en el momento que se ejecuta el programa
, para que asi las personas interesadas en este dato, lo puedan consultar facilmente, La temperactura puede tener
decimales

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
public class Temperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temperatura = 0.0;
        
        System.out.println("Ingrese el valor de la temperatura");
        temperatura = entrada.nextDouble();
        
        System.out.println("La temperatura actual es: " + temperatura);
    }
}

/*
Abstraccion
-Que se solicita finalmente?(Problema)
    Mostrar un mensaje con la temperatura actual

-Que informacion es relevante dado el problema anterior ?
    El valor de la temperatura (Puede tener decimales)
    Mensaje: "Temperactura es 27.1" suponiendo que esa sea la temperatura 


Descomposicion
-Que acciones se requieren para resolver el problema
    Ingresar la temperatura actual (con decimales)
    Generar mensaje de temperatura
    Mostrar mensaje

Reconocimiento de patrones
-Que puedo reutilizar de la solucion de otros problemas ?
    La funcion mostrar_mensaje
*/