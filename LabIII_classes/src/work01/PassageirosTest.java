package work01;

import javax.swing.*;

import java.io.IOException;
import java.util.ArrayList;

import static javafx.application.Platform.exit;

/**
 * @author Wesley Mendes
 */
public class PassageirosTest {

    public static void cadastrarPassageiro(ArrayList<Passageiros> passageiro) {
        String condicao;
        //TESTE
//        passageiro.add(new Passageiros("n1","cpf1"));
//        passageiro.add(new Passageiros("n2","cpf2"));

        do {
            passageiro.add(
                new Passageiros(
                    JOptionPane.showInputDialog("Informe o nome do Passageiro"),
                    JOptionPane.showInputDialog("Informe o CPF do Passageiro")
                )
            );
            condicao = JOptionPane.showInputDialog("Deseja cadastrar outro passageiro? <S|N>");
        } while (condicao.toUpperCase().equals("S"));
    }

    public static void cadastrarCidade(ArrayList<Cidades> cidade) {
        String condicao;
        //TESTE
//        cidade.add(new Cidades("c1","e1"));
//        cidade.add(new Cidades("c2","e2"));

        do {
            cidade.add(
                new Cidades(
                    JOptionPane.showInputDialog("Informe a Cidade"),
                    JOptionPane.showInputDialog("Informe o Estado")
                )
            );
            condicao = JOptionPane.showInputDialog("Deseja cadastrar outra cidade? <S|N>");
        } while (condicao.toUpperCase().equals("S"));
    }

    public static int venderPoltrona(Onibus poltronas) {
            int polt, numero, poltrona = 0;

            // PASSAGEM

            // imprimir as poltronas na tela
            polt = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    ++polt;
                    if(poltronas.getPoltrona(i,j)) {
                        poltronas.setPoltrona(i,j);
                        System.out.print("--" + "\t");
                    } else {
                        System.out.print(polt + "\t");
                    }
                }
                if(i == 1) {
                    System.out.println("");
                }
                System.out.println("");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da poltrona"));


            // limpa console
            for (int i = 0; i < 2; ++i) {
                System.out.println();
            }

            // seta poltrona como ocupada
            polt = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 10; j++) {
                    ++polt;
                    if(numero == polt && !poltronas.getPoltrona(i,j)) {
                        poltronas.setPoltrona(i,j);
                        poltrona = polt;
                        System.out.print("--" + "\t");
                    } else {
                        System.out.print(polt + "\t");
                    }
                }
                if(i == 1) {
                    System.out.println("");
                }
                System.out.println("");
            }

            // limpa console
            for (int i = 0; i < 2; ++i) {
                System.out.println();
            }

            return poltrona;
        }

    public static void main(String[] args) throws IOException, InterruptedException {
        String condicao;
        int option;
        ArrayList<Passageiros> passageiro = new ArrayList<Passageiros>();
        ArrayList<Cidades> cidade = new ArrayList<Cidades>();
        Onibus poltronas = new Onibus();
        ArrayList<Passagem> passage = new ArrayList<Passagem>();


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
                    cadastrarPassageiro(passageiro);
                    break;
                }
                // cadastrar cidades
                case 2 : {
                    cadastrarCidade(cidade);
                    break;
                }
                // vender passagem
                case 3 : {
                    do {
                        boolean verify = true;
                        String tempPassageiro, tempCpf, tempCityOrigem, tempCityDestino, tempData;

                        // PASSAGEIRO
                        tempPassageiro = JOptionPane.showInputDialog("Informe o nome do passageiro");
                        for (Passageiros p_passageiro : passageiro) {
                            if (p_passageiro.nome.equals(tempPassageiro)) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            String cond;
                            JOptionPane.showMessageDialog(null,
                                    "PASSAGEIRO NÃO CADASTRADO",
                                    "ERROR",
                                    JOptionPane.WARNING_MESSAGE);

                            cond = JOptionPane.showInputDialog("Deseja cadastrar? <S|N>");
                            if (cond.toUpperCase().equals("S")) {
                                cadastrarPassageiro(passageiro);
                            } else {
                                break;
                            }

                        }

                        // CPF
                        tempCpf = JOptionPane.showInputDialog("Informe o cpf do passageiro");
                        for (Passageiros p_passageiro : passageiro) {
                            if (p_passageiro.cpf.equals(tempCpf)) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            JOptionPane.showMessageDialog(null,
                                    "CPF INVALIDO",
                                    "ERROR",
                                    JOptionPane.WARNING_MESSAGE);
                            break;
                        }

                        // CIDADE ORIGEM
                        tempCityOrigem = JOptionPane.showInputDialog("Informe a cidade de origem");
                        // CIDADE DESTINO
                        tempCityDestino = JOptionPane.showInputDialog("Informe a cidade de destino");
                        for (Cidades p_cidade : cidade) {
                            if (p_cidade.getCidade().equals(tempCityOrigem) || p_cidade.getCidade().equals(tempCityDestino)) {
                                verify = false;
                            }
                        }
                        if (verify) {
                            String cond;
                            JOptionPane.showMessageDialog(null,
                                    "CIDADE NÃO CADASTRADA",
                                    "ERROR",
                                    JOptionPane.WARNING_MESSAGE);

                            cond = JOptionPane.showInputDialog("Deseja cadastrar? <S|N>");
                            if (cond.toUpperCase().equals("S")) {
                                cadastrarPassageiro(passageiro);
                            } else {
                                break;
                            }
                        }

                        tempData = JOptionPane.showInputDialog("Informe a data");

                        passage.add(
                            new Passagem(
                                    tempPassageiro,
                                    tempCpf,
                                    tempCityOrigem,
                                    tempCityDestino,
                                    tempData,
                                    venderPoltrona(poltronas))
                        );

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
                    if (passage != null && !passage.isEmpty()) {
                        for (Passagem p : passage) {
                            System.out.println(p);
                            JOptionPane.showInputDialog(p);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "NÃO TEM PASSAGENS VENDIDAS!",
                                "VENDA", JOptionPane.WARNING_MESSAGE
                        );
                    }
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
