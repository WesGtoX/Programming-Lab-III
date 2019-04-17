package work01;

/**
 * @author Wesley Mendes
 */
public class Passageiros extends Pessoa {

    public Passageiros() {
        this("","");
    }

    public Passageiros(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String getNome() {
        return super.nome;
    }

    @Override
    public String getCpf() {
        return super.cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "CPF: " + getCpf() + "\n";
    }

}
