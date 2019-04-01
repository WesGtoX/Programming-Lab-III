package work01;

/**
 * @author Wesley Mendes
 */
public class Passageiros {

    private String nome;
    private String cpf;

    public Passageiros() {
        this("","");
    }

    public Passageiros(String nome, String cpf) {

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n";
    }

}
