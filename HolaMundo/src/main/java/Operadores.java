public class Operadores {
    public static void main (String[] args){
        int a = 3, b=2;
        // Sumar
        int resultado = a + b;
        System.out.println("Resultado suma = " + resultado);
        // no confundir con System.out.println("Resultado = " + a + b) o ... a - b );
        System.out.println("Resultado resta = " + (a -b));
        // Multiplica
        resultado = a*b;
        System.out.println("Resultado multiplicacion = " + resultado);
        // Division
        resultado = a / b;
        double resultado2 = a/b;
        System.out.println("Resultado division int = " + resultado);
        System.out.println("Resultado division double entre enteros = " + resultado2);
        resultado2 = 3F/2F;
        System.out.println("Resultado division double y floats = " + resultado2);

        // Resto u operador de modulo
        resultado = a % b;
        System.out.println("Resultado del resto: " + resultado);
        // Se puede utilizar para probar si un numero es divisible
        resultado = a % 2;
        if (resultado==0)
             System.out.println("El numero es par");
         else
             System.out.println("El numero es impar");
    }
}
