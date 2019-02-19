package class02_2019_02_12;

import javax.swing.JOptionPane;

/**
 *
 * @author Wesley Mendes
 */
public class Exemplo02 {
    
    public static void main(String[] args) {
        
        double v1, v2, resultado;
        String valor;
        
        // Entrada de dados
        valor = JOptionPane.showInputDialog("Valor 1");
        
        // Converter uma String para um double
        v1 = valor);
        
        valor = JOptionPane.showInputDialog("Valor 2");
        v2 = Double.parseDouble(valor);
        
        resultado = v1 + v2;
        
        JOptionPane.showMessageDialog(null, "Resultado = " + resultado);
    }
    
}
