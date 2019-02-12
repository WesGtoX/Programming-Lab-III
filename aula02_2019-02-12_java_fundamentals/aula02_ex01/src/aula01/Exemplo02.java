/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author 828507
 */
public class Exemplo02 {
    
    public static void main(String[] args) {
        
        double v1, v2, resultado;
        String valor;
        
        // Entrada de dados
        valor = JOptionPane.showInputDialog("Valor 1");
        
        // Converter uma String para um double
        v1 = Double.parseDouble(valor);
        
        valor = JOptionPane.showInputDialog("Valor 2");
        v2 = Double.parseDouble(valor);
        
        resultado = v1 + v2;
        
        JOptionPane.showMessageDialog(null, "Resultado = " + resultado);
    }
    
}
