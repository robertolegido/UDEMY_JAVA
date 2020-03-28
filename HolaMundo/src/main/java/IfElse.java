import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // Condicionales - determinan flujo de ejecucion
        // La declaración no lleva ; pero las sentencias si
        // Switch se utiliza en menus de opciones (se utiliza menos). Decisiones mas específicas

        // if (condicion){
        //      sentencia;
        // }
        // else{
        //      sentencia2;
        // }
        System.out.println("Introducir true o false: ");
        Scanner scanner = new Scanner(System.in);
        boolean condicion = Boolean.parseBoolean(scanner.nextLine());

        if (condicion){
            System.out.println("La condiciones es verdadera");
        }
        else {
            System.out.println("La condicion es falsa");
        }

        System.out.println("Escribir un numero");
        int variable = Integer.parseInt(scanner.nextLine());
        if (variable==1){
            System.out.println("El valor es 1");
        }
        else if (variable==2){
            System.out.println("El valor es 2");
        }
        else{
            System.out.println("El valor no es 1 o 2");
        }
        // System.out.println("La variable es: " + variable);
    }
}
