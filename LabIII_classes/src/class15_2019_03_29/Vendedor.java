package class15_2019_03_29;

/**
 * @author Wesley Mendes
 */
public class Vendedor extends Funcionario implements IEmpregado {

    private double totalVendas;

    public Vendedor() {
        this("",0,0);

    }

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public double getSalario() {
        return super.salario + (super.salario * COMISSAO);
    }
    @Override
    public String getNome() {
        return super.nome + " (VENDEDOR)";
    }
}
