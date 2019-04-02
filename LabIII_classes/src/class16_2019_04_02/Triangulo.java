package class16_2019_04_02;

/**
 * @author Wesley Mendes
 */
public class Triangulo extends Forma {

    private double base;
    private double altura;

    //construtores
    public Triangulo() {
        this(0,0);
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //metodos abstratos
    @Override
    public String getNome() {
        return "Triângulo";
    }

    @Override
    public double getArea() {
        return (base * altura) / 2;
    }
}
