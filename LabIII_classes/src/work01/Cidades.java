package work01;

/**
 * @author Wesley Mendes
 */
public class Cidades {

    private String cidade;
    private String estado;

    public Cidades() {
        this("", "");
    }

    public Cidades(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }

    public Cidades(String informe_o_nome_da_cidade) {
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado(String estado) {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
