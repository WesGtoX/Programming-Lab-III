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
        String notaString = "Notas: ";
        double media = 0, m = 0;

        for (int i = 0; i < nota.length; i++) {

            nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota " + (i+1) + ": "));

            m += nota[i];
        }
        media = m / nota.length;

        Arrays.sort(nota);

        for (int i = nota.length - 1; i > 0; i--) {
            notaString += nota[i] + ", ";
        }

        JOptionPane.showMessageDialog(null,
                String.format("%s\n média das notas: %.2f", notaString, media));
    }
}
