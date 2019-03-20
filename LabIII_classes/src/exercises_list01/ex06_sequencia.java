package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
6. Escreva uma classe que leia uma sequencia indeterminada de números inteiros maiores que zero. Apresente na tela:
a. O total de números pares.        b. O total de números ímpares       c. A média dos números
d. O maior número                   e. O menor número
O programa deverá terminar a execução quando o valor zero for digitado pelo usuário.
 */
public class ex06_sequencia {

    public static void main(String[] args) {

        int number, par = 0, impar = 0, media = 0, maior = 0, menor = 0;
        int i = 0, soma = 0;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

            if (number != 0) {
                menor = number;

                if (number % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }

                if (number > maior) {
                    maior = number;
                }

                if (number < menor) {
                    menor = number;
                }

                soma += number;
                i++;


                media = soma / i;

            } else if (number == 0 && i == 0) {
                JOptionPane.showMessageDialog(null,
                        "O primeiro número digitado foi 0");
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("" +
                                        "a. O total de números pares: %d\n" +
                                        "b. O total de números ímpares: %d\n" +
                                        "c. A média dos números: %d\n" +
                                        "d. O maior número: %d\n" +
                                        "e. O menor número: %d\n",
                                par, impar, media, maior, menor)
                );
            }
        } while (number != 0);
    }
}
