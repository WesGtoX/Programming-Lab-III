package class16_2019_04_02;

/**
 * @author Wesley Mendes
 */
public class Cilindro extends Forma {

    private double raio;
    private double altura;

    //construtores
    public Cilindro() {
        this(0,0);
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    //metodos abstratos
    @Override
    public String getNome() {
        return "Cilindro";
    }

    @Override
    public double getArea() {
        return Math.PI * raio * (altura + raio);
    }
}
