package class16_2019_04_02;

/**
 * @author Wesley Mendes
 */
public class Circulo extends Forma {

    private double raio;

    //construtores
    public Circulo() {
        this(0);
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    //metodos abstratos
    @Override
    public String getNome() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}
