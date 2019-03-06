package class07_2019_03_01;

/**
 * @author Wesley Mendes
 */
public class Numero {

    //atributos da casse
    public int number;

    //metodos da classe
    public double raiz() {
        return Math.sqrt(this.number);
    }

    public double square() {
        return Math.pow(this.number, 2);
    }

    public double cubo() {
        return Math.pow(this.number, 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Raiz Quadrada: %.1f\nAo Quadrado: %.1f\nAo Cubo: %.1f",
                raiz(), square(), cubo()
        );
    }



}
