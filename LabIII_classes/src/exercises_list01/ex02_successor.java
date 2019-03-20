package exercises_list01;

import javax.swing.JOptionPane;

/**
 * @author Wesley Mendes
 */
/*
2. Escreva uma classe que receba um número inteiro do teclado e imprima na
tela seu sucessor (numero +1) e seu antecessor (numero -1).
 */
public class ex02_successor {

    public static void main(String[] args) {

        double inteiro, sucessor, antecessor;

        inteiro = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: "));

        sucessor = inteiro + 1;
        antecessor = inteiro - 1;

        JOptionPane.showMessageDialog(null,
                String.format("Sucessor: %.0f\nAntecessor: %.0f", sucessor, antecessor));
    }
}
