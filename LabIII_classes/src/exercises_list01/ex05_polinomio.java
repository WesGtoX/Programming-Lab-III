package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex05_polinomio {

    public static void main(String[] args) {

        double x, polinomio;

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor numérico do polinômio:"));

        polinomio = (Math.pow(x, 3) - (7 * Math.pow(x, 2)) + (3 * x) - 4);

        JOptionPane.showMessageDialog(null,
                String.format("O calculo do valor numérico do polinômio é %.1f", polinomio));
    }
}
