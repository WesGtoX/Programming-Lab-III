package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
3. Escreva uma classe que receba um número inteiro positivo e maior que zero.
Assim, calcule e apresente na tela:
a) a raiz quadrada do número;   b) o número ao quadrado;    c) o número ao cubo.
 */
public class ex03_numero {

    public static void main(String[] args) {

        int number;
        double raiz, square, cubo;

        number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        raiz = Math.sqrt(number);
        square = Math.pow(number, 2);
        cubo = Math.pow(number, 3);

        JOptionPane.showMessageDialog(null,
                String.format(
                        "Raiz Quadrada: %.1f\nAo Quadrado: %.1f\n Ao Cubo: %.1f",
                        raiz, square, cubo
                )
        );
    }
}
