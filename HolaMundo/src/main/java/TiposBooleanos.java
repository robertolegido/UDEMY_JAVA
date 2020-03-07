public class TiposBooleanos {
    public static void main(String[] args){
        System.out.println("True para el tipo boolean es: " + Boolean.TRUE);
        System.out.println("True para el tipo boolean es: " + Boolean.FALSE);
        // Valores muy utilizados para ejecutar deficiones de algoritmos !!
        boolean varBoolean = true;
        if (varBoolean){
            System.out.println("El boolean es verdadero");
        }
        else{
            System.out.println("El boolean es falso");
        }
        varBoolean = false;
        if (varBoolean){
            System.out.println("El boolean es verdadero");
        }
        else{
            System.out.println("El boolean es falso");
        }
        // Evaluacion de expresiones
        var edad = 10;
        var esAdulto = edad >= 18; // Se puede asociar un valor boolean sobre una variable creada por var
        System.out.println("Comprobamos si es la edad introducida es de adulto: " + esAdulto);
    }
}
