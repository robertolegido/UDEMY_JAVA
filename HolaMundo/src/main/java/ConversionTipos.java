public class ConversionTipos {
    public static void main(String[] args){
        // De string a int
        var edad = Integer.parseInt("20");
        System.out.println("La edad es: " + edad);
        // De string a double
        double varPi = Double.parseDouble("3.1416");
        System.out.println("El valor es: " + varPi);
        // El tipo char tiene una unica excepción. El char solo puede almacenar un caracter
        // Se puede asociar una posicion del array de un string
        char c = "hola".charAt(1); // segundo caracter
        System.out.println("Valor del caracter c es: " + c);


        // De entero a string
        String edadTexto = String.valueOf(edad);
        System.out.println("El valor de la edad en tipo string es: " + edadTexto);

    }
}
