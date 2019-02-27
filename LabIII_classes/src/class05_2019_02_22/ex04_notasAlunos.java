package class05_2019_02_22;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Wesley Mendes
 */
public class ex04_notasAlunos {

    public static void main(String[] args) {
        double nota[] = new double[5];
        double notaString[] = new double[5];
        double media = 0, m = 0;

        for (int i = 0; i < nota.length; i++) {

            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i+1) + ": "));

            m += nota[i];
        }
        media = m / nota.length;

//        for (double notas: nota) {
//            notaString = notas.toString();
//        }

//        Arrays.sort(notaString, Collections.reverseOrder());

        for (int i = 0; i < notaString.length; i++) {

            System.out.println(
                    String.format("Nota: %s", notaString[i]));
        }

        System.out.println(
                String.format("Média: %.2f", media));
    }
}
