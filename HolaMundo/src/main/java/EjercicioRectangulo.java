/*
En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las
siguientes variables:
        alto (int)
        ancho (int)
El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato(no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
    Proporciona el alto:
    Proporciona el ancho:
Calculos
    Area: <area>
        Perimetro: <perimetro>
        Las fórmulas para calcular el área y el perímetro de un Rectángulo son:
        Área: alto * ancho
        Perímetro: (alto + ancho) * 2
*/

import java.util.Scanner;

public class EjercicioRectangulo {
    public static void main (String[] args){
        // Definicion de scanner para entrada
        Scanner scanner = new Scanner(System.in);

        // Solicitud e inicialización de variables de alto y ancho
        System.out.println("Introducir el alto: ");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Introducir el ancho: ");
        int ancho = Integer.parseInt(scanner.nextLine());

        // Calculos
        int area = alto*ancho;
        int perimetro = (alto + ancho) *2;

        // Salida
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

    }
}
