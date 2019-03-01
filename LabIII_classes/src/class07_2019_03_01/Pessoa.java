package class07_2019_03_01;

/**
 * @author Wesley Mendes
 */
public class Pessoa {

    //atributos da classe
    public String nome;
    public double peso;
    public double altura;

    //metodos da classe
    public double imc() {
        return this.peso / Math.pow(this.altura, 2);
    }

    @Override
    public String toString() {
        return String.format(
                "Peso: %.2f\nAltura: %.2f\nIMC: %.2f",
                this.peso, this.altura, imc()
        );
    }
}
