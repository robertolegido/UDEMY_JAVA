public class TipoChar {
    public static void main(String[] args){
        // float floatVar = 10340;
        // System.out.println(floatVar);
        System.out.println("bits tipo por char " + Character.SIZE); // 16 bits
        System.out.println("bytes tipo por char " + Character.BYTES); // 2 bytes
        System.out.println("Valor minimo por char "+ Character.MIN_VALUE); // Valor de null
        System.out.println("Valor minimo por char "+ Character.MAX_VALUE);

        //Char solo soporta un unico caracter - tipo unicode
        char varChar = 'a'; // se emplea la comilla sencilla
        System.out.println("Varlor de : " + varChar);
        // Para establecer caracteres unicode
        varChar = '\u0516';
        System.out.println("Valor unicode raruno: " + varChar);
    }
}
