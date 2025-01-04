/*
    Programa que muestra un mensaje del valor del TRM (Tasa Representativa del Mercado)
    Autor: Juan Dadiv Plaza
    Fecha: 1 Diciembre 2024
    Licencia: GNU GPL v3
*/

/* 
Problema:
La empresa "Divisas_4 S.A", de la ciudad de Armenia, necesita un programa que muestre  la tasa representativa del mercado (TMR)
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
public class Divisas_4 {
    /* Funcion principal */
    public static void main(String[] args) {
       ingresarTRM();
       mostrarMensaje();
    }
    
    public static void ingresarTRM(){
        Scanner entrada = new Scanner(System.in);
        int valorTRM = 0;
        System.out.println("Valor actual TRM");
        valorTRM = entrada.nextInt();
    }
    
    public static void mostrarMensaje(){
        //System.out.println("El valor del TRM es: " + valorTRM);
    }
   
}


/*
Abstraccion
-Que se solicita finalmente?(Problema)
    Mostrar un mensaje con la TRM

-Que informacion es relevante dado el problema anterior ?
    El valor del TRM( Tasa Representativa del Mercado) sin sentavos
    Mensaje: "El TRM es de 4775" suponiendo que el valor es 4775

Descomposicion
-Que acciones se requieren para resolver el problema
    Ingresar el TRM(sin sentavos)
    Generar mensaje del valor del TRM
    Mostrar el mensaje

Reconocimiento de patrones
-Que puedo reutilizar de la solucion de otros problemas ?
     mostrarMensaje
*/


