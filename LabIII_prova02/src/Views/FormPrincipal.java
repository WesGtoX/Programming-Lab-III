package Views;

//import com.google.gson.Gson;
//import com.google.gson.stream.JsonReader;
import java.awt.Dimension;
//import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 828507
 */
public class FormPrincipal extends javax.swing.JFrame {

    protected static List<Classes.Passageiro> passageiros = new ArrayList<>();
    
    public FormPrincipal() {
        initComponents();
        configurarFormulario();
//        loadFilePassageiros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemReservar = new javax.swing.JMenuItem();
        menuItemVisualizar = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        menuArquivo.setText("Arquivo");

        menuItemReservar.setText("Reservar");
        menuItemReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemReservarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemReservar);

        menuItemVisualizar.setText("Visualizar");
        menuItemVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVisualizarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemVisualizar);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        jMenuBar1.add(menuArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemReservarActionPerformed
        abrirFormulario(new FormReservarPassagem());
    }//GEN-LAST:event_menuItemReservarActionPerformed

    private void menuItemVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVisualizarActionPerformed
        abrirFormulario(new FormVisualizarReservas());
    }//GEN-LAST:event_menuItemVisualizarActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

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
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemReservar;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenuItem menuItemVisualizar;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Fly Passagens");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private void abrirFormulario(JInternalFrame f){
        if (Desktop.getAllFrames().length == 0) {
            Desktop.add(f);
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
    
//    private void loadFilePassageiros() {
//        try {
//            JsonReader reader = new JsonReader(new FileReader(
//                    "D:\OneDrive\ESCOLA\FACULDADE\UNAERP\Stage_04-2019-1\Laboratório de Programação III\Aulas\Programming-Lab-III\LabIII_prova02\src\files\\passageiros.json"
//                )
//            );
//            reader.beginArray();
//            while(reader.hasNext()){
//                Classes.Passageiro cli = new Gson().fromJson(reader, Classes.Passageiro.class);
//                passageiros.add(cli);
//            }
//        } catch (Exception e) {
//            System.out.println("ERRO: "+e.getMessage());
//        }
//    }
}
