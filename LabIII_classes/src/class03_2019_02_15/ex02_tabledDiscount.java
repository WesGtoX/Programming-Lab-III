package class03_2019_02_15;

import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Mendes
 */
public class tabledDiscount {

    public static void main(String[] args) {

        // variables
        double valor, desconto = 0;
        String produto;

        // Data entry
        produto = JOptionPane.showInputDialog("Nome do produto: ");

        valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do produto: "));

        if(valor > 0) {
            if (valor >= 50) {
                desconto = valor * 0.95;

            } else if (valor >= 200) {
                desconto = valor * 0.94;

            } else if (valor >= 500) {
                desconto = valor * 0.93;

            } else if (valor >= 1000) {
                desconto = valor * 0.92;

            } else {
                desconto = valor;
            }

            JOptionPane.showMessageDialog(null,
                    String.format("Produto: %s \nValor: %.2f\nValor c/ Desconto: %.2f", produto, valor, desconto)
            );
        } else {
            JOptionPane.showMessageDialog(
                    null, "O VALOR DO PRODUTO NÃO É VÁLIDO!!", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
    }
}
