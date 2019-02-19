package ex01;

import javax.swing.JOptionPane;

/**
 * @author Wesley Mendes
 */
public class tabuada {

    public static void main(String[] args) {

        int num;
        String resultado = "";

        num = Integer.parseInt(
                JOptionPane.showInputDialog("Forneça um número: ")
        );

        for(int i = 1; i <= 10; i++) {
            resultado += num + " x " + i + " =  " + (num * i)  + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
