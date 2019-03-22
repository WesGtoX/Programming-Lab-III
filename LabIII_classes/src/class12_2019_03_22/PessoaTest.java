package class12_2019_03_22;

/**
 * @author Wesley Mendes
 */
public class PessoaTest {

    public static void main(String[] args) {

        PessoaFisica pf1 = new PessoaFisica();
        pf1.setNome("João da Silva");
        pf1.setEndereco("Av. IX de Julho, 1234");
        pf1.setCpf("123.456.789-00");
        pf1.setRg("12.345.678-9");
        System.out.println(pf1);

        PessoaFisica pf2 = new PessoaFisica(
                "Ana Maria",
                "Rua 1  de Abril, 321",
                "987.654.321-00",
                "98.765.432-1"
        );
        System.out.println(pf2);

        PessoaJuridica pj1 = new PessoaJuridica();
        pj1.setNome("Paulo Pereira");
        pj1.setEndereco("Av. Presidente Vargas, 456");
        pj1.setCnpj("12.345.678/0001-90");
        pj1.setIe("123.456.789.321");
        System.out.println(pj1);

        PessoaJuridica pj2 = new PessoaJuridica(
                "Pedro Antônio",
                "Rua Visconde de Inhauma, 789",
                "98.765.432/0001-10",
                "987.654.321.789"
        );
        System.out.println(pf2);

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Carlos Henrique");
        aluno1.setEndereco("Av. João Fiusa, 1274");
        aluno1.setCpf("123.456.789-00");
        aluno1.setRg("12.345.678-9");
        aluno1.setCodigo(123987);
        aluno1.setCurso("Engenharia da Computação");
        System.out.println(aluno1);
    }
}
