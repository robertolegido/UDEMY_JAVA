import java.util.Scanner;

public class CoversionesYScanner {
    public static void main(String[] args){
        // Declaracion de Scanner para capturar entrada
        var scanner = new Scanner(System.in);
        System.out.println("Introducir la edad: ");
        // Al definir un tipo int solo se puede asociar un entero
        int edad = 0;
        // Si utilizamos nextLine lee un string, que debemos convertir con Integer.parseInt
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("La edad introducid en string es: " + edad);

        // para caracteres (tomando una posicion)
        System.out.println("Introduce una serie de caracteres");
        char c = scanner.nextLine().charAt(0);
        System.out.println("El primero caracter es c:" + c);

    }
}
