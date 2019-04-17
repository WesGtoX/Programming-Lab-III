package work01;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class PassageirosTest {

    public static void main(String[] args) {

        String condicao;
        int option;
        int city=0, pass=0;
        Passageiros passageiro[] = new Passageiros[10];
        Cidades cidade[] = new Cidades[10];

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("" +
                    "1 - Cadastrar Passageiro\n" +
                    "2 - Cadastrar Cidades\n" +
                    "3 - Vender Passagem\n" +
                    "4 - Cancelar Passagem\n" +
                    "5 - Listar Passageiros\n" +
                    "6 - Listar Cidades\n" +
                    "7 - Listar Passagens Vendidas\n" +
                    "8 - Sobre\n" +
                    "0 - Sair")
            );

            switch(option) {
                case 1 : {
                    do {
                        passageiro[pass] = new Passageiros(
                                JOptionPane.showInputDialog("Informe o nome do Passageiro"),
                                JOptionPane.showInputDialog("Informe o CPF do Passageiro")
                        );
                        ++pass;
                        condicao = JOptionPane.showInputDialog("Deseja cadastrar outro passageiro? <S|N>");
                    } while (condicao.toUpperCase().equals("S"));
                }
                case 2 : {

                    do {
                        cidade[city] = new Cidades(
                                JOptionPane.showInputDialog("Informe a Cidade"),
                                JOptionPane.showInputDialog("Informe o Estado")
                        );
                        ++city;
                        condicao = JOptionPane.showInputDialog("Deseja cadastrar outra cidade? <S|N>");
                    } while (condicao.toUpperCase().equals("S"));
                }
                case 3 : {
                    do {

                        condicao = JOptionPane.showInputDialog("Deseja vender outra passagem? <S|N>");
                    } while(condicao.toUpperCase().equals("S"));
                }
                case 4 : {
                    do {

                        condicao = JOptionPane.showInputDialog("Deseja cancelar outra passagem? <S|N>");
                    } while(condicao.toUpperCase().equals("S"));
                }
                case 5 : {
                    for (Passageiros p : passageiro) {
                        System.out.println(p);
                    }
                }
                case 6 : {
                    for (Cidades c : cidade) {
                        System.out.println(c);
                    }
                }
                case 7 : {}
                case 8 : {
                    JOptionPane.showMessageDialog(null,
                            "Código: 828507\n" +
                                    "Aluno: Wesley de Oliveira Mendes\n" +
                                    "Data de Entrega: 22/04/2019");
                }
            }



        } while(option != 0);
    }
}
