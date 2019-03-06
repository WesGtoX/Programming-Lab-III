package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class ex04_PagarContas {

    public static void main(String[] args) {

        double salario, agua, luz, fone, restoSalario;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do mês: "));
        agua = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta de Água: "));
        luz = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta de Luz: "));
        fone = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da conta de Telefone: "));

        restoSalario = salario - (agua + luz + fone);

        JOptionPane.showMessageDialog(null,
                String.format("Sobrou para o trabalhador, R$ %.2f de seu salário.", restoSalario));
    }
}
