package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
7. Escreva uma classe capaz de exibir na tela a tabuada de um número informado pelo usuário.
Crie três versões da classe utilizando as estruturas de repetição: for, while e do...while.
 */
public class ex07_tabuada_for {

    public static void main(String[] args) {

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        for (int i = 0; i <= 10; i++) {

            System.out.println(
                    number + " x " + i + " = " + number * i
            );
        }
    }
}
