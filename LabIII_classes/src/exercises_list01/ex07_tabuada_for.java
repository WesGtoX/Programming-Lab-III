package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex07_tabuada_for {

    public static void main(String[] args) {

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        for (int i = 0; i <= 10; i++) {

            System.out.println(
                    number + " x " + i + " = " + number * i
            );
        }
    }
}
