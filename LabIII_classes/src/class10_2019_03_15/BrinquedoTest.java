package class10_2019_03_15;

/**
 * @author Wesley Mendes
 */
public class BrinquedoTest {

    public static void main(String[] args) {

        Brinquedo carro = new Brinquedo();
        carro.setNome("Carro de controle remoto");
        carro.setFaixaEtaria("6 a 10");
        carro.setPreco(120.00);
        System.out.println(carro);

        Brinquedo domino = new Brinquedo("Domino");
        carro.setFaixaEtaria("Acima de 10");
        carro.setPreco(50.00);
        System.out.println(domino);

        Brinquedo boneca = new Brinquedo("Barbie", 350.00);
        carro.setFaixaEtaria("3 a 6");
        System.out.println(boneca);
    }
}
