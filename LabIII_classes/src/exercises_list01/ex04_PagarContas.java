package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
4. Um trabalhador recebeu seu salário mensal, porém precisa pagar as contas de água, luz e telefone.
Escreva um algoritmo que solicite ao usuário o salário e os valores das contas de água, luz e telefone.
Em seguida, calcule e apresente na tela quanto sobrou para o trabalhador após o pagamento das contas.
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
