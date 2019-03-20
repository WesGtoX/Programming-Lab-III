package exercises_list01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
/*
9. Escreva uma classe que receba do teclado uma sequencia de caracteres, por exemplo,
“ABCDEFG” e armazene cada caractere em uma posição do vetor. Em seguida, apresente na
tela a sequencia lida em ordem inversa, ou seja, “GFEDCBA”.
*/
public class ex09_seq_caractere {

    public static void main(String[] args) {

        String sequencia, seq_caractere="";
        char [] caractere;

        sequencia = JOptionPane.showInputDialog("Digite uma sequnência de caractere:");

        caractere = sequencia.toCharArray();

        for (int i = caractere.length - 1; i >= 0; i--) {

            seq_caractere += caractere[i];

        }

        JOptionPane.showMessageDialog(null, seq_caractere);
    }
}
