package class13_2019_03_26;

/**
 * @author Wesley Mendes
 */
public class AlunoTest2 {

    public static void main(String[] args) {

        // Vetor de Alunos:
        Aluno vet[] = new Aluno[5];

        vet[0] = new Aluno("João", 6.0,8.0);
        vet[1] = new AlunoGraduacao("Ana", 6.0,8.0, "Engenharia da Computação");
        vet[2] = new AlunoGraduacao("José", 7.5,9.0);
        vet[3] = new Aluno("Maria", 6.8,7.0);
        vet[4] = new AlunoGraduacao("Antônio", 7.0,4.0);

        // Definir o curso do AlunoGraduacao
        ((AlunoGraduacao)vet[2]).setCurso("Nutrição");

        for(Aluno a : vet) {
            System.out.println(a);
        }

        // Definir todos os AlunosGraduacao como Eng. Computação
        for(Aluno a : vet) {
            if (a instanceof AlunoGraduacao) {
                ((AlunoGraduacao)a).setCurso("Eng. da Computação");
            }
            System.out.println(a);
        }
    }
}
