package class11_2019_03_19;

import class10_2019_03_15.Funcionario;

/**
 * @author Wesley Mendes
 */
public class Retangulo<sout> {

    private double comprimento;
    private double largura;

    // Contrutor Padrão
    public Retangulo() {
        this(0,0);
    }

    // Construtor sobrecarregado 1
    public Retangulo(double comprimento) {
//        this.comprimento = 0;
//        this.largura = 0;
        this(comprimento,0);
    }

    // Construtor sobrecarregado 2
    public Retangulo(double comprimento, double largura) {
//        this.comprimento = 0;
//        this.largura = 0;
        setComprimento(comprimento);
        setLargura(largura);
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        }
    }

    public double getPerimetro() {
        return 2 * (getComprimento() + getLargura());
    }

    public double getArea() {
        return getComprimento() * getLargura();
    }

    @Override
    public String toString() {
        return
                String.format("Comprimento = %.2f\n", getComprimento()) +
                String.format("Largura = %.2f\n", getLargura()) +
                String.format("Perímetro = %.2f\n", getPerimetro()) +
                String.format("Área = %.2f\n", getArea());
    }
}
