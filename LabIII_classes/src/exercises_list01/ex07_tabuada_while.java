package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex07_tabuada_while {
    public static void main(String[] args) {

        int number, i =0;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        while (i <= 10) {

            System.out.println(
                    number + " x " + i + " = " + number * i
            );
            i++;
        }
    }
}
