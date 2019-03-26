package class13_2019_03_26;

/**
 * @author Wesley Mendes
 */
public class AlunoGraduacao extends Aluno {

    private String curso;

    // AlunoTest1
    public AlunoGraduacao(String nome, double nota1, double nota2) {

        super(nome, nota1, nota2);
    }

    // AlunoTest2
    public AlunoGraduacao(String nome, double nota1, double nota2, String curso) {

        super(nome, nota1, nota2);
        this.curso = curso;
    }

    //POLIMORFISMO POR SOBREPOSIÇÃO
    @Override
    public double getMedia() {
//        return (super.getNota1() * 0.40 + super.getNota2() * 0.60);
        return (super.nota1 * 0.40 + super.nota2 * 0.60);   //se estiver definida como 'protected' pode ser chamada dessa forma
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //POLIMORFISMO POR SOBREPOSIÇÃO
    @Override
    public String toString() {
        return "\nAluno Graduação\n".toUpperCase() +
                super.toString() +
                "Curso: " + getCurso() + "\n";
    }
}
