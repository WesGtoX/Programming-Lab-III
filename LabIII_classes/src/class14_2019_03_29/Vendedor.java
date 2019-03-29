package class14_2019_03_29;

/**
 * @author Wesley Mendes
 */
public class Vendedor extends Funcionario {

    private double totalvendas;

    public Vendedor() {
        this("",0,0);
    }

    public Vendedor(String nome, double salario, double totalvendas) {
        super(nome, salario);
        this.totalvendas = totalvendas;
    }


    @Override
    public String getNome() {
        return super.nome + " (VENDEDOR)";
    }

    @Override
    public double getSalario() {
        return super.salario + (totalvendas * 0.02);
    }

    public double getTotalvendas() {
        return totalvendas;
    }

    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }
}
