package class12_2019_03_22;

/**
 * @author Wesley Mendes
 */
//Aluno HERDA PessoaFisica
public class Aluno extends PessoaFisica {

    private int codigo;
    private String curso;

    public Aluno() {
        this(0,"","","","","");
    }

    public Aluno(int codigo, String curso, String nome, String endereco, String cpf, String rg) {
        super(nome,endereco,cpf,rg);
        this.codigo = codigo;
        this.curso = curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Código: " + getCodigo() + "\n" +
                "Curso: " + getCurso() + "\n";
    }
}