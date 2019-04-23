package work01;

/**
 * @author Wesley Mendes
 */
public class Passageiros extends Pessoa {

    private String city_start;
    private String city_end;

    public Passageiros() {
        this("","","","");
    }

    public Passageiros(String nome, String cpf) {
        super(nome, cpf);
    }

    public Passageiros(String nome, String cpf, String city_start, String city_end) {
        super(nome, cpf);
        this.city_start = city_start;
        this.city_end = city_end;
    }

    @Override
    public String getNome() {
        return super.nome;
    }

    @Override
    public String getCpf() {
        return super.cpf;
    }


    public String getCity_start() {
        return city_start;
    }

    public void setCity_start(String city_start) {
        this.city_start = city_start;
    }

    public String getCity_end() {
        return city_end;
    }

    public void setCity_end(String city_end) {
        this.city_end = city_end;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
