package class12_2019_03_22;

/**
 * @author Wesley Mendes
 */
public class PessoaJuridica extends Pessoa {

    private String cnpj;
    private String ie;

    public PessoaJuridica() {
        this("","","","");
    }

    public PessoaJuridica(String nome, String endereco, String cnpj, String ie) {
        super(nome,endereco);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CNPJ: " + getCnpj() + "\n" +
                "IE: " + getIe() + "\n";
    }
}
