/*Solicitar al usuario dos valores:

numero1 (int)

numero2 (int)

Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):

Proporciona el numero1:
Proporciona el numero2:
El numero mayor es:
<numeroMayor>
*/

import java.util.Scanner;

public class EjercicioComparaNumeros {
    public static void main(String[] args) {
        // Declaracion del Scanner
        Scanner scanner = new Scanner(System.in);

        // Inicializacion de variables
        System.out.println("Proporciona el numero1: ");
        int numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona numero2: ");
        int numero2 = Integer.parseInt(scanner.nextLine());
        // Evaluacion
        var resultado = (numero1 >= numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: ");
        System.out.println(resultado);
    }
}
