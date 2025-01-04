/*
    Programa que imprime un mensaje de bienvenida personalizado
    Autor: Juan David Plaza
    Fecha: 1 Diciembre 2024
    Licencia: GNU GPL v3
 */

 /*
Problema: 
Juan, requiere un programa  que permita mostrar un mensaje de bienvenida para un cliente que entra asu 
tienda de videojuegos. Para esto su asistente carlos le solicita el nombre al ingresar a la tienda, de tal
manera que se observe en la pantalla el mensaje a: "Bienvenido Jorge a la tienda", suponiendo que el cliente
se llame "Jorge".
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

/* Clase principal */
public class Mensaje_Personalizado_3 {

    /* funcion principal */
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String texto = "";

        System.out.print("Ingrese El Nombre Del Cliente: ");
        texto = entrada.nextLine();
    
         mostrarMensaje(texto);
    }
 
    public static void mostrarMensaje(String texto) {
        System.out.println("Bienvenido a la tienda " + texto);
    }
   

}



/*
Abstraccion:
    - Que se solicita finalmente?(problema)
        Mostrar un mensaje de bienvenida para un cliente

    - Que informacion es relevante dado el problema anterior?
        El nombre del cliente
        Mensaje: "Bienvenido Jorge a la tienda" suponiendo que el cliente se llame "Jorge"
    

Desconposion:
    -Que acciones se requieren para resolver el problema
        Ingresar untexto(nombre del cliente)
        Generar mensaje de bienvenida
        Mostrar el mensaje

Reconocimiento de patrones
    -Que puedo reutilizar de la solucion de otros problemas ?
        La funcion mostrar_mensaje
*/
