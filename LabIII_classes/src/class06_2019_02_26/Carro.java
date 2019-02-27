package class06_2019_02_26;

/**
 * @author Wesley Mendes
 */
public class Carro {

    //atributos da classe
    public String fabricante;
    public String modelo;
    public int anofabricacao;
    public int velocidade;

    //Métodos da classe
    public void ligar() {
        System.out.println(modelo + " ligado");
    }

    public void desligar() {
        System.out.println(modelo + " desligado");
    }

    @Override
    public String toString() {
        return
                "Fabricante: " + fabricante + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de fabricação: " + anofabricacao + "\n" +
                "Velocidade: " + velocidade + "\n";
    }
}
