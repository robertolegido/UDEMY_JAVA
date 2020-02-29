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
    }
}
