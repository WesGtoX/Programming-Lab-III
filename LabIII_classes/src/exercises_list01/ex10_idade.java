package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
10. Faça uma classe que leia a idade de uma pessoa expressa em anos, meses e dias,
e apresente na tela a idade apenas em dias. Considere para isso que um mês possui
trinta dias, e um ano possui trezentos e sessenta e cinco dias.
*/
public class ex10_idade {

    public static void main(String[] args) {

        int idadeAnos, idadeMeses, idadeDias, idadeTotal;

        idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade (Em Anos)"));
        idadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade (Em Meses)"));
        idadeDias = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade (Em Dias)"));

        idadeTotal = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        JOptionPane.showMessageDialog(null,
                String.format("Sua idade em dias é %d dias", idadeTotal)
        );
    }
}
