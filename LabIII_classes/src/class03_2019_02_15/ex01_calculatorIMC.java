package class03_2019_02_15;

import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Mendes
 */
public class calculatorIMC {

    public static void main(String[] args) {

        double imc, peso, altura;
        String valor;

        valor = JOptionPane.showInputDialog("Digite seu peso: ");
        peso = Double.parseDouble(valor);

        valor = JOptionPane.showInputDialog("Digite sua altura: ");
        altura = Double.parseDouble(valor);

        imc = peso / Math.pow(altura, 2);

        JOptionPane.showMessageDialog(
                null,
                String.format("Seu IMC é: %.2f", imc)
        );
    };
}
