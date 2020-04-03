public class DoWhile {
    public static void main(String[] args) {
        var contador = 0;
        while (contador < 10){
            System.out.println("Internet");
            contador++;
        }
        // Una version que ejecuta el codigo al menos una vez
        contador = 0;
        do {
            System.out.println("primera iteración ");
            contador ++;
            }while (contador < 11);
    }
}
