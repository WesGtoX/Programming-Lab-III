package class12_2019_03_22;

/**
 * @author Wesley Mendes
 */
//PessoaFisica HERDA Pessoa
public class PessoaFisica extends Pessoa {

    private String cpf;
    private String rg;

    public PessoaFisica() {
        this("","","","");
    }

    public PessoaFisica(String nome, String endereco, String cpf, String rg) {
        super(nome,endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CPF: " + getCpf() + "\n" +
                "RG: " + getRg() + "\n";
    }
}
