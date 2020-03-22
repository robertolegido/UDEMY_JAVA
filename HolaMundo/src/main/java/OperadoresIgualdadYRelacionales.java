import java.util.Scanner;

public class OperadoresIgualdadYRelacionales {
    public static void main(String[] args) {
        //Operadores condicionales reciben 2 argumentos boolenos
        // && AND
        // || OR

        //int a = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducir un valor: ");
        int a = Integer.parseInt(scanner.nextLine());
        int maximo = 10;
        int minimo = 0;
        boolean resultado = a >= minimo && a <= maximo;
        System.out.println("Resultado : " + resultado);

        //Sobre condicionales
        boolean vacaciones = true;
        boolean libre = false;
        if (vacaciones || libre)
            System.out.println("Posible");
        else
            System.out.println("No es posible");
    }
}
