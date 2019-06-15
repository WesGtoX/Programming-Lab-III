package class25_2019_05_24;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley
 */
public class FormPrincipal extends javax.swing.JFrame {
    
    //ESTRUTURA DE DADOS para Troca entre os JInternalForm
    protected static List<Aluno> alunos = new ArrayList<>();
    
    public FormPrincipal() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areaTrabalho = new javax.swing.JDesktopPane();
        barraMenu = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemImportar = new javax.swing.JMenuItem();
        menuItemExportar = new javax.swing.JMenuItem();
        menuItemSeparador = new javax.swing.JPopupMenu.Separator();
        menuItemSair = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        menuItemCadastrarAluno = new javax.swing.JMenuItem();
        menuItemCadastrarCurso = new javax.swing.JMenuItem();
        menuVisualizar = new javax.swing.JMenu();
        menuItemVisualizarAluno = new javax.swing.JMenuItem();
        menuItemVisualizarCurso = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout areaTrabalhoLayout = new javax.swing.GroupLayout(areaTrabalho);
        areaTrabalho.setLayout(areaTrabalhoLayout);
        areaTrabalhoLayout.setHorizontalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        areaTrabalhoLayout.setVerticalGroup(
            areaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");

        menuItemImportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemImportar.setText("Importar");
        menuArquivo.add(menuItemImportar);

        menuItemExportar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemExportar.setText("Exportar");
        menuArquivo.add(menuItemExportar);
        menuArquivo.add(menuItemSeparador);

        menuItemSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemSair.setText("Sair");
        menuArquivo.add(menuItemSair);

        barraMenu.add(menuArquivo);

        menuCadastrar.setText("Cadastrar");

        menuItemCadastrarAluno.setText("Aluno");
        menuItemCadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarAlunoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarAluno);

        menuItemCadastrarCurso.setText("Curso");
        menuItemCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarCursoActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarCurso);

        barraMenu.add(menuCadastrar);

        menuVisualizar.setText("Visualizar");

        menuItemVisualizarAluno.setText("Aluno");
        menuItemVisualizarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarAlunoActionPerformed(evt);
            }
        });
        menuVisualizar.add(menuItemVisualizarAluno);

        menuItemVisualizarCurso.setText("Curso");
        menuVisualizar.add(menuItemVisualizarCurso);

        barraMenu.add(menuVisualizar);

        menuAjuda.setText("Ajuda");

        Sobre.setText("Sobre");
        menuAjuda.add(Sobre);

        barraMenu.add(menuAjuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(areaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarAlunoActionPerformed
        abrirFormulario(new FormCadastroAluno());
    }//GEN-LAST:event_menuItemCadastrarAlunoActionPerformed

    private void menuItemCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarCursoActionPerformed
        abrirFormulario(new FormCadastroCurso());
    }//GEN-LAST:event_menuItemCadastrarCursoActionPerformed

    private void menuItemVisualizarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarAlunoActionPerformed
        abrirFormulario(new FormVisualizarAluno());
    }//GEN-LAST:event_menuItemVisualizarAlunoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JDesktopPane areaTrabalho;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuItemCadastrarAluno;
    private javax.swing.JMenuItem menuItemCadastrarCurso;
    private javax.swing.JMenuItem menuItemExportar;
    private javax.swing.JMenuItem menuItemImportar;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JPopupMenu.Separator menuItemSeparador;
    private javax.swing.JMenuItem menuItemVisualizarAluno;
    private javax.swing.JMenuItem menuItemVisualizarCurso;
    private javax.swing.JMenu menuVisualizar;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Controle de Alunos");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void abrirFormulario(JInternalFrame f){
        if (areaTrabalho.getAllFrames().length == 0) {
            areaTrabalho.add(f);
            centralizarFormulario(f);
            f.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(
                    rootPane,
                    "Você precisa fechar a janela atual antes de abrir outro formulário!");
        }

    }
    
    private void centralizarFormulario(JInternalFrame f){
        Dimension d = f.getDesktopPane().getSize();
        f.setLocation(
            (d.width-f.getSize().width)/2,
            (d.height-f.getSize().height)/2
        );
    }
}
