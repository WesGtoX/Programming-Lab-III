package ex02;

import javax.swing.JOptionPane;

/**
 * @author Wesley Mendes
 */
public class successor {

    public static void main(String[] args) {

        double inteiro, sucessor, antecessor;

        inteiro = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: "));

        sucessor = inteiro + 1;
        antecessor = inteiro - 1;

        JOptionPane.showMessageDialog(null,
                String.format("Sucessor: %.0f\nAntecessor: %.0f", sucessor, antecessor));
    }

}
