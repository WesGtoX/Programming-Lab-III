package class04_2019_02_19;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * @author Wesley Mendes
 */
public class ex06_sqrt {

    public static void main(String[] args) {

        double numero, sqrt;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));

        sqrt = Math.sqrt(numero);

        DecimalFormat df = new DecimalFormat("#,##0.00");

        JOptionPane.showMessageDialog(null,
                String.format("Raiz Quadrada de %.0f é ", numero) + df.format(sqrt));
    }
}
