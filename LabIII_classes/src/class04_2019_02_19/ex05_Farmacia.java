package class04_2019_02_19;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex05_Farmacia {

    public static void main(String[] args) {

        double preco, acrescimo;

        do {

            preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));

            if(preco != 0) {

                preco = preco * 1.12;

                acrescimo = Math.round(preco);

                JOptionPane.showMessageDialog(null,
                        String.format("O preço com 12%% de acrescimo é R$ %.0f,00", acrescimo));

            } else {

                JOptionPane.showMessageDialog(null,
                        "Valor inválido!");
            }

        } while(preco <= 0);
    }
}
