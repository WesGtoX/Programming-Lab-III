package class16_2019_04_02;

/**
 * @author Wesley Mendes
 */
public class Quadrado extends Forma {

    private double lado;

    public Quadrado() {
        this(0);
    }

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
}
