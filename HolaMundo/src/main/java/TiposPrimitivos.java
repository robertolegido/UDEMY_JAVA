public class TiposPrimitivos {
    public static void main(String[] args){
        //byte, short, int, long
        // Utiliza 8 bits[[[ˆ
        byte byteVar = 5;
        System.out.println(byteVar + " valor de byteVar");
        // Para conocer el rango maximo
        System.out.println("bits tipo por byte " + Byte.SIZE);
        System.out.println("bytes tipo por byte " + Byte.BYTES);
        System.out.println("Valor minimo por byte "+ Byte.MIN_VALUE);
        System.out.println("Valor minimo por byte "+ Byte.MAX_VALUE);

        short shortVar = 1000;
        System.out.println(shortVar);
        System.out.println("bits tipo por byte " + Short.SIZE);
        System.out.println("bytes tipo por byte " + Short.BYTES);
        System.out.println("Valor minimo por byte "+ Short.MIN_VALUE);
        System.out.println("Valor minimo por byte "+ Short.MAX_VALUE);

        short intVar = 5000;
        System.out.println(intVar);
        System.out.println("bits tipo por int " + Integer.SIZE);
        System.out.println("bytes tipo por int " + Integer.BYTES);
        System.out.println("Valor minimo por int "+ Integer.MIN_VALUE);
        System.out.println("Valor minimo por int "+ Integer.MAX_VALUE);

        int longVar = 1034500;
        System.out.println(longVar);
        System.out.println("bits tipo por long " + Long.SIZE);
        System.out.println("bytes tipo por long " + Long.BYTES);
        System.out.println("Valor minimo por long "+ Long.MIN_VALUE);
        System.out.println("Valor minimo por long "+ Long.MAX_VALUE);

        // Se puede indicar el tipo en el literal para los longs -> se añade una l / L
        long longVar2 = 1093485L;
        System.out.println(longVar2);

        var varPorDefecto = 340598;
        System.out.println("var por defecto es de tipo int" + varPorDefecto);

        var varModificada = 3098986L;
        System.out.println("var se puede convertir en una valirable de tipo long con literal " + varModificada);

        /* Utilizacion de TIPOS NUMERICOS */
        int numerDecimal = 10;
        System.out.println("Numero decimal por defecto: " + numerDecimal);
        // Octal hay que incluir en el literal un 0
        int numeroOctal = 012;
        System.out.println("Ejemplo de un octal: " + numeroOctal);
        // Valores hexademimales
        int numeroHexa = 0xA;
        System.out.println("Valor en hexadecimal "+ numeroHexa);
        // Valores binarios a partir de v7
        int numeroBin = 0b1010;
        System.out.println("Numero en hexa: "+ numeroBin);
        // Todos estos escenarios también valen para var a partir de la version 10 del JDK

        /* Utilizacion de TIPOS FLOTANTES */
        float numeroFloat = (float) 19238.234;
        float numeroFloat2 = 23498.293487F;
    }
}
