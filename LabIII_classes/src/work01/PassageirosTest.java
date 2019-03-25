package work01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class PassageirosTest {

    public static void main(String[] args) {

        int opcao;
        String condicao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1 - Cadastrar Passageiro\n" +
                    "2 - Cadastrar Cidades\n" +
                    "3 - Vender Passagem\n" +
                    "4 - Cancelar Passagem\n" +
                    "5 - Listar Passageiros\n" +
                    "6 - Listar Cidades\n" +
                    "7 - Listar Passagens Vendidas\n" +
                    "8 - Sobre")
            );

            switch(opcao) {
                case 1 : {}
                case 2 : {}
                case 3 : {}
                case 4 : {}
                case 5 : {}
                case 6 : {}
                case 7 : {}
                case 8 : {}
            }


            condicao = JOptionPane.showInputDialog("Deseja cadastrar mais uma passagem? <S|N>");
        } while(condicao.toUpperCase().equals("S"));
    }
}
