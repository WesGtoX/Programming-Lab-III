package class10_2019_03_15;

/**
 * @author Wesley Mendes
 */
public class Brinquedo {

    private String nome;
    private String faixaEtaria;
    private double preco;

    // Construtor padrão
    public Brinquedo() {
        this.nome = "NÃO DEFINIDO";
        this.faixaEtaria = "NÃO DEFINIDO";
        this.preco = 0;

    }

    // Construtor sobrecarregado
    public Brinquedo(String nome) {
        this.nome = nome;
        this.faixaEtaria = "NÃO DEFINIDO";
        this.preco = 0;
    }

    // Construtor sobrecarregado
    public Brinquedo(String nome, double preco) {
        this.nome = nome;
        this.faixaEtaria = "NÃO DEFINIDO";
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        if (faixaEtaria.equals("0 a 2") ||
                faixaEtaria.equals("3 a 5") ||
                faixaEtaria.equals("6 a 10") ||
                faixaEtaria.equals("Acima de 10")) {
            this.faixaEtaria = faixaEtaria;
        } else {
            System.out.println("O valor informado não é valido");
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                "nome='" + nome + '\'' +
                ", faixaEtaria='" + faixaEtaria + '\'' +
                ", preco=" + preco +
                '}';
    }
}
