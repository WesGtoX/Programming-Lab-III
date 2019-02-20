package exercises_list01;

import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Mendes
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
