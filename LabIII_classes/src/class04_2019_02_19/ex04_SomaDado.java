package class04_2019_02_19;

import javax.swing.*;
import java.util.Random;

/**
 *
 * @author Wesley Mendes
 */
public class SomaDado {

    public static void main(String[] args) {

        int total, num1, num2, num3;

        Random n1, n2, n3;
        n1 = new Random();
        n2 = new Random();
        n3 = new Random();

        num1 = n1.nextInt(6);
        num2 = n2.nextInt(6);
        num3 = n3.nextInt(6);
        total = num1 + num2 + num3;

        JOptionPane.showMessageDialog(null,
                String.format("Números Sorteados:\n%d\n%d\n%d\nTotal = %d",num1,num2,num3,total)
        );



//        String resultado = "Números Sorteados\n";
//        int soma = 0;
//
//        for (int i = 1; i <= 3; i++) {
//            int num = (int) (Math.random() * 6 + 1);
//            soma += num;
//            resultado += num + "\n";
//        }
//
//        resultado += "Total = " + soma;
//        JOptionPane.showMessageDialog(null, resultado);




    }
}
