package class06_2019_02_26;

import javax.swing.*;

/**
 * @author Wesley Mendes
 */
public class CarroTest {

    public static void main(String[] args) {

        //Instanciar (criar) objetos
        Carro fusca = new Carro();
        fusca.fabricante = "VM";
        fusca.modelo = "Fusca";
        fusca.anofabricacao = 1970;
        fusca.velocidade = 85;

        Carro corsa = new Carro();
        corsa.fabricante = "GM";
        corsa.modelo = "Corsa Sedan";
        corsa.anofabricacao = 2002;
        corsa.velocidade = 98;

        fusca.ligar();
        corsa.ligar();
        fusca.desligar();
        corsa.desligar();

        JOptionPane.showMessageDialog(null, fusca.toString());
        JOptionPane.showMessageDialog(null, corsa.toString());
    }
}
