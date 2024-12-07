
/*
    Programa que de divisas
    Autor: Juan Dadiv Plaza
    Fecha: 6 Diciembre 2024
    Licencia: GNU GPL v3
*/


/*
Problema:
Adriana encargada de la nomina en una empresa de medicamentos, requiere un algoritmo que calcule el salario
a pagar a un empleado.

Al empleado le pagan deacuerdo al numero de horas que haya laborado.

El valor de la hora depende del empleado, Sim embargo la oficina de recursos humanos de la empresa 
limita el salario aun maximo de 2,500,000.

*


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
public class Salario_a_Pagar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salarioFijo = 25000000;
        int valor_Horas = 0;
        int numero_horas = 0;
        int salarioFinal = 0;
        
        
        System.out.println("Ingrese la cantidad de horas trabajadas: ");
        numero_horas = entrada.nextInt();
        
        System.out.print("Ingrese el valor de la hora: ");
        valor_Horas = entrada.nextInt();
        
        salarioFinal = numero_horas * numero_horas;
        if (salarioFinal >= salarioFijo) {
            System.out.println("Su salario esta limitado a 2,5000,0000");
        }else {
            System.out.println("Su salario es: " + salarioFinal);
        }
        
    }
}


/*
Abstraccion
-Que se solicita finalmente?(Problema)
    Calcular el salario del empleado
    (Maximo salario final 2,500,000)

-Que informacion es relevante dado el problema anterior ?
    Numero de horas trabajadas
    valor hora

Descomposicion
-Que acciones se requieren para resolver el problema
    Ingresar cantidad de horas
    Ingresar el valor de la hora 
    Calcular el salario
    Determinar el valor final del salario
    Generar mensaje salario final
    Mostrar mensaje

Reconocimiento de patrones
-Que puedo reutilizar de la solucion de otros problemas ?
    La funcion ingresar_entero
    La funcion mostrar_mensaje 
*/