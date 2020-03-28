/*
*El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

El usuario proporcionará un valor entre 0 y 10.

Si está entre 9 y 10: imprimir una A

Si está entre 8 y menor a 9: imprimir una B

Si está entre 7 y menor a 8: imprimir una C

Si está entre 6 y menor a 7: imprimir una D

Si está entre 0 y menor a 6: imprimir una F

cualquier otro valor debe imprimir: Valor desconocido

Por ejemplo:

Proporciona un valor entre 0 y 10:
A
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.

Preguntas de esta tarea

¿Cuál es el código del requerimiento solicitado?*/
import com.sun.jdi.FloatType;

import java.util.Scanner;

public class EjercicioExamen {
    public static void main(String[] args){
        // Definición de paramaetros de entrada y Scanner de entrada
        float valor = -1;
        System.out.println("Proporciona un valore entre 0 y 10: ");
        Scanner scanner = new Scanner(System.in);
        valor =  Float.parseFloat(scanner.nextLine());
        var resultado = "Valor desconocido";

        // Parseo de condiciones
        // Si está entre 9 y 10: imprimir una A
        if ( valor >= 9 && valor <= 10 ){
            resultado = "A";
        }
        else if ( valor >= 8 && valor < 9 ){
            resultado = "B";
        }
        else if ( valor >= 7 &&  valor < 8 ){
            resultado = "C";
        }
        else if ( valor >= 6 &&  valor < 7 ){
            resultado = "D";
        }
        else if ( valor >= 0 &&  valor < 6 ){
            resultado = "F";
        }
        else {
            resultado = "Valor desconocido";
        }
        // Salida de código
        System.out.println(resultado);
    }
}
