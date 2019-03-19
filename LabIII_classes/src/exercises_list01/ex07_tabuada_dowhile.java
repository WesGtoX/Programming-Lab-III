package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex07_tabuada_dowhile {
    public static void main(String[] args) {

        int number, i=0;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        do {

            System.out.println(
                    number + " x " + i + " = " + number * i
            );
            i++;
        } while (i <= 10);
    }
}
