package class14_2019_03_29;

/**
 * @author Wesley Mendes
 */
public class Gerente extends Funcionario {

    private final double GRATIFICACAO;

    public Gerente() {
        this("",0);
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.GRATIFICACAO = 500.00;
    }

    @Override
    public String getNome() {
        return super.nome + " (GERENTE)";
    }

    @Override
    public double getSalario() {
        return super.salario + this.GRATIFICACAO;
    }
}
