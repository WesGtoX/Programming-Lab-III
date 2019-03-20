package exercises_list01;

import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Mendes
 */
/*
1. Construa uma classe que calcule a área de um triângulo. Lembre-se de que para
realizar esse cálculo é necessário utilizar a fórmula: Área = (base * altura) / 2.
 */
public class ex01_triangle {

    public static void main(String[] args) {

        double area, base, altura;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura do triângulo (cm): "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Base do triângulo (cm): "));


        area = (base * altura) / 2;

        JOptionPane.showMessageDialog(null,
                String.format("A área do triângulo é: %.2f cm²", area)
        );
    }
}
