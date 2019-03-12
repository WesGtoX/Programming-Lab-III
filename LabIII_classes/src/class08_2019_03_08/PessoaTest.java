package class08_2019_03_08;

/**
 * @author Wesley Mendes
 */
public class PessoaTest {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa();

//        joao.nome = "João da Silva";
//        joao.setNome("J");
        joao.setNome("João da Silva");

//        joao.peso = 96;
        joao.setPeso(96);

//        joao.altura = 1.99;
        joao.setAltura(1.99);

        joao.usuario = "joao";
        joao.senha = "joao123";

        System.out.println(joao.toString());

    }
}
