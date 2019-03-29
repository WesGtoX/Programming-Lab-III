package class14_2019_03_29;

/**
 * @author Wesley Mendes
 */
public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario() {
        this("",0);
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Métodos ABSTRATOS
    public abstract String getNome();
    public abstract double getSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Salário: R$ " + String.format("%.2f\n", getSalario());
    }
}
