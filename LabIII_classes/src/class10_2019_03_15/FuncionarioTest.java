package class10_2019_03_15;

/**
 * @author Wesley Mendes
 */
public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario joao = new Funcionario();
        System.out.println(joao);
        joao.setNome("João da Silva");
        joao.setFuncao("Estagiário");
        joao.setSalario(1250.00);
        System.out.println(joao);

        Funcionario jose = new Funcionario("José Antônio");
        jose.setFuncao("Programador");
        jose.setSalario(2000.00);
        System.out.println(jose);

        Funcionario quemuel = new Funcionario("Quemuel Nassor", "Auxiliar de Estagiário");
        quemuel.setSalario(550.00);
        System.out.println(quemuel);

        Funcionario wesley = new Funcionario("Wesley Mendes","Developer Intern", 1200);
        System.out.println(wesley);
    }
}
