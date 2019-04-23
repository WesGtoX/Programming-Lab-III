package work01;

/**
 * @author Wesley Mendes
 */
public class  Passagem extends Passageiros {

//    private int passagem;
    private String date;
    private int poltronaPassagem;

    public Passagem() {
        this("", "", "", "", "", 0);
    }

    public Passagem(String nome, String cpf, String city_start, String city_end, String date, int poltronaPassagem) {
        super(nome, cpf, city_start, city_end);
//        this.passagem = passagem;
        this.date = date;
        this.poltronaPassagem = poltronaPassagem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPoltronaPassagem() {
        return poltronaPassagem;
    }

    public void setPoltronaPassagem(int poltronaPassagem) {
        this.poltronaPassagem = poltronaPassagem;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getCpf() {
        return super.getCpf();
    }

    @Override
    public String getCity_start() {
        return super.getCity_start();
    }

    @Override
    public void setCity_start(String city_start) {
        super.setCity_start(city_start);
    }

    @Override
    public String getCity_end() {
        return super.getCity_end();
    }

    @Override
    public void setCity_end(String city_end) {
        super.setCity_end(city_end);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cidade Origem: " + getCity_start() + "\t" +
                "Cidade Destino: " + getCity_end() + "\n" +
                "Poltrona: " + getPoltronaPassagem() + "\n" +
                "Data: " + getDate();
    }
}
