package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex08_pesquisa_aluno {

    public static void main(String[] args) {
        int i=0, a=0, p90=0, p50=0, p100=0;
        String answer, aluno;
        double peso, altura;

        do {
            aluno = JOptionPane.showInputDialog("Nome do aluno:");
            peso = Double.parseDouble(JOptionPane.showInputDialog("Peso do aluno:"));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do aluno:"));

            if (altura < 1.50) {
                a++;
            }

            if (peso > 90) {
                p90++;
            }

            if (peso < 50 && altura > 1.80) {
                p50++;
            }

            if (peso > 100 && altura < 1.50) {
                p100++;
            }

            answer = JOptionPane.showInputDialog("Deseja continuar (S,N)?");

        } while (answer.equals("S"));

        System.out.println(
                "Alunos com Altura inferior a 1.50m: " + a + "\n" +
                "Alunos com Peso superior a 90kg: " + p90 + "\n" +
                "Peso inferior a 50kg e altura superior a 1.80m: " + p50 + "\n" +
                "Peso superior a 100kg e altura inferior a 1.50m: " + p100
        );
    }
}
