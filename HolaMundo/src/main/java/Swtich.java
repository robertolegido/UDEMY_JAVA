import java.util.Scanner;

public class Swtich {
    public static void main(String[] args) {
        // simplificacion de estructuras if else sencillas

        // Ejemplo para transformar un numero a un texto
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un valor entero para convertir a string: ");
        var numero = Integer.parseInt(scanner.nextLine());
        var numeroTexto = "numero desconocido";



        // se recibe un argumento a comparar
        switch (numero){
            // comprobracion de valor de variable, se inicia con :
            case 1:
                numeroTexto = "numero uno";
                break; // deja de ejecutar casos
            case 2:
                numeroTexto = "numero dos";
                break;
            case 3:
                numeroTexto =  "numero tres";
                break;
            default:
                numeroTexto = "numeraco desconocido";
        }
        System.out.println("El numero texto es: " + numeroTexto);
    }
}
