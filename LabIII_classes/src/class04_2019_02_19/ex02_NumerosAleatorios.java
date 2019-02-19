package class04_2019_02_19;

/**
 *
 * @author Wesley Mendes
 */
public class NumerosAleatorios {

    public static void main(String[] args) {

        double n1 = Math.random();
        int n2 = (int)n1;

        System.out.println("n1 = " + n1);
        System.out.println(String.format("n1 = %.2f", n1));
        System.out.println("n2 = " + n2);
    }
}
