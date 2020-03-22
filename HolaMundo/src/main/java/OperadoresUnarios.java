public class OperadoresUnarios {
    public static void main(String[] args) {
        // inversion de valores int
        int a = 3;
        int b = -a;

        // inversion de valores boolean
        boolean c = true;
        boolean d = !c;
        System.out.println();

        // cuidado con el ++ o -- antes o despues de la variable!! pre y post
        // preincremento
        int e = 3;
        int f = ++e; // opera antes con e de la asignacion a f
        // Mismo valor
        System.out.println(e);
        System.out.println(f);
        // postincremneto
        int g = 5;
        int h = g++; // asocia valor a h y despues opera sobre g
        System.out.println(g); // vale 6
        System.out.println(h);
    }
}
