package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
5. Na área de matemática, funções polinomiais, também conhecidas como polinômios representam uma classe
importante de funções simples e infinitamente diferenciáveis. Os polinômios, devido a sua estrutura e
simples avaliação são muito empregados em análise numérica. Dentro deste contexto escreva uma classe na
linguagem Java capaz de calcular o valor numérico do polinômio P(x) = x3–7x2+3x – 4.
O valor do elemento x deverá ser informado pelo usuário.
 */
public class ex05_polinomio {

    public static void main(String[] args) {

        double x, polinomio;

        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor numérico do polinômio:"));

        polinomio = (Math.pow(x, 3) - (7 * Math.pow(x, 2)) + (3 * x) - 4);

        JOptionPane.showMessageDialog(null,
                String.format("O calculo do valor numérico do polinômio é %.1f", polinomio));
    }
}
