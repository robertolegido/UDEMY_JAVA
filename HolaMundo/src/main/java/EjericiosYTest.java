import java.util.Scanner;

public class EjericiosYTest {
    public static void main(String[] args) {
/*
        String color = "Rojo";
        System.out.println(color);
        //color = “Rojo”;
    }
*/
/*
Se solicita incluir la siguiente información acerca de un libro:

titulo
autor

Debes imprimir la información en el siguiente formato:
Proporciona el titulo:
Proporciona el autor:
<titulo> fue escrito por <autor>
Puedes utilizar el IDE de tu preferencia para desarrollar la solución y después pegar aquí tu respuesta, ya que este
editor no contiene ningún tipo de ayuda.
 */
        var titulo = "";
        var autor = "";
        Scanner scannerTitulo = new Scanner(System.in);
        Scanner scannerAutor = new Scanner(System.in);

        System.out.println("Proporciona el titulo: ");
        titulo = scannerTitulo.nextLine();
        System.out.println("Proporciona el autor: ");
        autor = scannerAutor.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);
    }
}
