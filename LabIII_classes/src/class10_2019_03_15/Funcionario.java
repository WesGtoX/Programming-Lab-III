package class10_2019_03_15;

/**
 * @author Wesley Mendes
 */
public class Funcionario {

    private String nome;
    private String funcao;
    private double salario;

    // Construtor Padrão
    public Funcionario() {
        System.out.println("Construtor Padrão");
        this.nome = "NÃO DEFINIDO";
        this.funcao = "NÃO DEFINIDO";
        this.salario = 0;
    }

    // Construtor sobrecarregado
    public Funcionario(String nome) {
        this.nome = nome;
        this.funcao = "";
        this.salario = 0;
    }

    // Construtor sobrecarregado
    public Funcionario(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = 0;
    }

    // Construtor sobrecarregado
    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", funcao='" + funcao + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
