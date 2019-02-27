package class04_2019_02_19;

import javax.swing.*;
import java.text.DecimalFormat;

public class ex07_potentiation {

        public static void main(String[] args) {

        double numero, potenciaDe, potencia;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));

        potencia = Double.parseDouble(JOptionPane.showInputDialog("Informe sua potência: "));

        potenciaDe = Math.pow(numero, potencia);

        DecimalFormat df = new DecimalFormat("#0");

        JOptionPane.showMessageDialog(null,
                String.format("O número %.0f elevado a %.0f é ", numero, potencia) + df.format(potenciaDe));
    }
}
