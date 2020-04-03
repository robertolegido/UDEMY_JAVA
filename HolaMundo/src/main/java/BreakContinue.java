import javax.swing.*;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            System.out.println("imprimimos valor de contador: " + i);
            //llbreak;
        }
        for (int i = 0; i < 5; i++){
            // comprobamos si es un par
            if (i % 2 == 0){
                System.out.println("El primer numero par es: " + i);
                break;
            }
        }
    }
}
