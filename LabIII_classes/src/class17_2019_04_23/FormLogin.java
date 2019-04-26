package class17_2019_04_23;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Wesley Mendes
 */
public class FormLogin extends javax.swing.JFrame {
    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnEntrar;
    private JButton btnEsqueceuSenha;
    private JLabel lblUsuario;


    private void configurarFormulario() {
        //Título do formulario
        this.setTitle("Login");

        //Posicionamento do Formulário => Centro da Tela
//        this.setLocationRelative(null);

        //Redimensionamento
        this.setResizable(false);

        //Foco do curso no JTextField txtUsuario
        txtUsuario.requestFocus();
    }
}
