/*
    Programa que de varillas de hierro
    Autor: Juan Dadiv Plaza
    Fecha: 8 Diciembre 2024
    Licencia: GNU GPL v3
*/


/*
Problema:
La empresa Hierro S.A necesita una aplicacion que le ayude a saber cuantos vehiculos de carga
(Completamente llenos) se necesitan para mover un pedido de varillas de hierro, ignorando las varillas 
que no se pueden llevar hasta llenar el proximo vehiculo.

por el seguro que la empresa tiene, el vehiculo solo puede cargat 100 varillas.

Adicional mente si el pedido supera la cantidad de 10 veiculos, se debe indicar que el pedido se cancela
por no tener veiculos disponibles.
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemasLogica;

/**
 *
 * @author Juan Plaza
 */
public class Varillas_Hierro {
    public static void main(String[] args) {
        
    }
}



/*
Abstraccion
-Que se solicita finalmente?(Problema)
    Cantidad de vehiculos de carga para mover un pedido de varillas de hierro

-Que informacion es relevante dado el problema anterior ?
    Cantidad de varillas vendidas
    Maximo 100 varillas de hierro por vehiculo
    Maximo 10 vehiculos disponibles por pedido
    Ignorando las varillas que no se puedan llevar hasta completar el vehiculo 

Descomposicion
-Que acciones se requieren para resolver el problema
   Ingresar la cantidad de varillas vendidas
   Calcular la cantidad de vehiculos de carga
   Generar mensaje
   Mostrar mensaje

Reconocimiento de patrones
-Que puedo reutilizar de la solucion de otros problemas ?
     La funcion ingresar_entero, mostrar_mensaje
*/