package class13_2019_03_26;

/**
 * @author Wesley Mendes
 */
public class Aluno {

    protected String nome;
    protected double nota1;
    protected double nota2;

    //POLIMORFISMO POR SOBRECARGA
    public Aluno() {
        this("", 0.0, 0.0);
    }

    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getMedia () {
        return (this.nota1 + this.nota2) / 2;
    }

    public double getMedia ( double nota1, double nota2){
        this.nota1 = nota1;
        return getMedia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Média: " + String.format("%.1f\n", getMedia());
    }
}
