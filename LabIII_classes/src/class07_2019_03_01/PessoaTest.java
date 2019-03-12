package class07_2019_03_01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class PessoaTest {

    public static void main(String[] args) {

        //instanciar objetos
        Pessoa wesley = new Pessoa();
        wesley.peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        wesley.altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

        wesley.imc();

        JOptionPane.showMessageDialog(null, wesley.toString());
    }

}
