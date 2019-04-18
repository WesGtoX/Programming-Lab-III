package work01;

import javax.swing.*;

import java.util.ArrayList;

import static javafx.application.Platform.exit;

/**
 * @author Wesley Mendes
 */
public class PassageirosTest {

    public static void main(String[] args) {

        String condicao;
        int option;
        int city=0, pass=0;
        ArrayList<Passageiros> passageiro = new ArrayList<Passageiros>();
        ArrayList<Cidades> cidade = new ArrayList<Cidades>();

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
                // cadastrar passageiro
                case 1 : {
                    do {
                        passageiro.add(
                                new Passageiros(
                                        JOptionPane.showInputDialog("Informe o nome do Passageiro"),
                                        JOptionPane.showInputDialog("Informe o CPF do Passageiro")
                                )
                        );
                        condicao = JOptionPane.showInputDialog("Deseja cadastrar outro passageiro? <S|N>");
                    } while (condicao.toUpperCase().equals("S"));
                    break;
                }
                // cadastrar cidades
                case 2 : {

                    do {
                        cidade.add(
                                new Cidades(
                                        JOptionPane.showInputDialog("Informe a Cidade"),
                                        JOptionPane.showInputDialog("Informe o Estado"))
                        );
                        condicao = JOptionPane.showInputDialog("Deseja cadastrar outra cidade? <S|N>");
                    } while (condicao.toUpperCase().equals("S"));
                    break;
                }
                // vender passagem
                case 3 : {
                    do {

                        condicao = JOptionPane.showInputDialog("Deseja vender outra passagem? <S|N>");
                    } while(condicao.toUpperCase().equals("S"));
                    break;
                }
                // cancelar passagem
                case 4 : {
                    do {

                        condicao = JOptionPane.showInputDialog("Deseja cancelar outra passagem? <S|N>");
                    } while(condicao.toUpperCase().equals("S"));
                    break;
                }
                // listar passageiros
                case 5 : {
                    if (passageiro != null && !passageiro.isEmpty()) {
                        for (Passageiros p : passageiro) {
                            System.out.println(p);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "NÃO TEM PASSAGEIROS CADASTRADOS!",
                                "CADASTRO", JOptionPane.WARNING_MESSAGE
                        );
                    }
                    break;
                }
                // listar cidades
                case 6 : {
                    if (cidade != null && !cidade.isEmpty()) {
                        for (Cidades c : cidade) {
                            System.out.println(c);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "NÃO TEM CIDADES CADASTRADOS!",
                                "CADASTRO", JOptionPane.WARNING_MESSAGE
                        );
                    }
                    break;
                }
                // listar passagens vendidas
                case 7 : {
//                    if (passagem != null && !passagem.isEmpty()) {
//                        for (Passagens p : passagem) {
//                            System.out.println(c);
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null,
//                                "NÃO TEM PASSAGENS VENDIDAS!",
//                                "VENDA", JOptionPane.WARNING_MESSAGE
//                        );
//                    }
                    break;
                }
                // sobre
                case 8 : {
                    JOptionPane.showMessageDialog(
                            null,
                            "Código: 828507\n" +
                                    "Aluno: Wesley de Oliveira Mendes\n" +
                                    "Data de Entrega: 22/04/2019",
                            "SOBRE",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                }
                // sair
                case 0 : {
                    exit();
                }
            }



        } while(option != 0);
    }
}
