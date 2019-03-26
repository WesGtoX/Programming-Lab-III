package class13_2019_03_26;

/**
 * @author Wesley Mendes
 */
public class AlunoTest1 {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("João da Silva", 6.0, 8.0);
        System.out.println(a1);

        Aluno a2 = new AlunoGraduacao("Ana Maria", 6.0, 8.0);
        System.out.println(a2);
    }
}
