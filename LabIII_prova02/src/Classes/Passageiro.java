package Classes;

/**
 *
 * @author 828507
 */
public class Passageiro {
    private String checkin;
    private String nome;
    private String tipo;
    private String data;
    private String origem;
    private String destino;
    
    public Passageiro() {
        
    }

    public Passageiro(String checkin, String nome, String tipo, String data, String origem, String destino) {
        this.checkin = checkin;
        this.nome = nome;
        this.tipo = tipo;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
