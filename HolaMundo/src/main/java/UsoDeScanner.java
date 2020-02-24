import java.util.Scanner;

public class UsoDeScanner {
    public static void main(String[] args){
        // Ejemplo de variable hardcodeada
        var usuario = "Juancho";
        System.out.println("usuario hardcodeado es: " + usuario);

        // Utilizacion de la clase scanner para pedir información al usuario

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del usuario a parametrizar: ");
        var usuario_parametrizado = scanner.nextLine();
        System.out.println("Usuario parametrizado es: " + usuario_parametrizado);
    }
}
