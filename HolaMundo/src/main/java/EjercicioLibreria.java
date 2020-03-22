import java.util.Scanner;

/*
Se solicita capturar la siguiente información de una tienda de libros:

nombre (String)

id (int)

precio (double)

simbolo (char)

envioGratuito (boolean)

Tu tarea es imprimir un mensaje en el siguiente formato:

Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el simbolo:
Proporciona el envio gratuito:
<nombre> #<id>
Precio: <simbolo><precio>
Envio Gratuito: <envioGratuito>


Por ejemplo:
Proporciona el nombre:
Programacion con Java
Proporciona el id:
1520
Proporciona el precio:
899
Proporciona el simbolo:
$
Proporciona el envio gratuito:
true
Programacion con Java #1520
Precio: $899.00
Envio Gratuito: true
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.*/

public class EjercicioLibreria {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Solicitudes
        //Solicita nombre
        System.out.println("Proporiciona el nombre: ");
        String nombre = (scanner.nextLine());
        //Solicitud del id
        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(scanner.nextLine());
        //Solicitud del precio
        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(scanner.nextLine());
        //Solicitud del simbolo
        System.out.println("Proporciona el simbolo: ");
        char simbolo  = scanner.nextLine().charAt(0);
        //Solicitud del precio
        System.out.println("Envio gratuito: ");
        boolean envio = Boolean.parseBoolean(scanner.nextLine());

        //Muestra por pantalla
        System.out.println(nombre + ' ' + '#' + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio gratuito: " + envio);
    }
}
