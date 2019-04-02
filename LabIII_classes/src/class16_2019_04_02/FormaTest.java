package class16_2019_04_02;

/**
 * @author Wesley Mendes
 */
public class FormaTest {

    public static void main(String[] args) {

        Forma formas[] = new Forma[6];

        formas[0] = new Quadrado(5);
        formas[1] = new Cilindro(10,3);
        formas[2] = new Circulo(6);
        formas[3] = new Quadrado(15);
        formas[4] = new Triangulo(5,8);
        formas[5] = new Circulo(15);

        for(Forma f: formas) {
            System.out.println(f);
        }
    }
}
