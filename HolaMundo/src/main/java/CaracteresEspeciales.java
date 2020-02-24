public class CaracteresEspeciales {
    public static void main(String args[]){
        // Declaración de variables
        var nombre = "Roberto";
        var apellido = "Legido";

        // Acciones con caracteres especiales
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre); // Añade nueva linea
        System.out.println("Tabulador: \t" + nombre); // Añade tabulacion
        System.out.println("Retroceso: \b" + nombre); // Se come el espacio en blanco
        System.out.println("Retroceso: \b\b" + nombre); // Se come el espacio en blanco - Manipulacion de stdout
        System.out.println("Retorno de carro: \r " + nombre); // \n y \r depende de plataforma ->
        // System.lineSeparator System.lineSeparator()
        System.out.println("Comilla simple: \'" + nombre + "\'"); // comillas simples
        System.out.println("Comilla simple: \"" + nombre + "\""); // comillas dobles
        System.out.print("Sin utilizar una nueva linea");
        System.out.print("adios amigos");
    }
}
