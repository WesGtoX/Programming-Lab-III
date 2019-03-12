package class07_2019_03_01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class NumeroTest {

    public static void main(String[] args) {

        //instanciar objetos
        Numero n = new Numero();

        n.number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        n.raiz();
        n.square();
        n.cubo();

        JOptionPane.showMessageDialog(null, n.toString());
    }
}
