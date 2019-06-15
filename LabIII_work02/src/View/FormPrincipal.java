package View;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.awt.Dimension;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley
 */
public class FormPrincipal extends javax.swing.JFrame {

    //ESTRUTURA DE DADOS para Troca entre os JInternalForm
    protected static List<Classes.Usuario> usuarios = new ArrayList<>();
    protected static List<Classes.Editora> editoras = new ArrayList<>();
    protected static List<Classes.Livro> livros = new ArrayList<>();
    
    public FormPrincipal() {
        initComponents();
        configurarFormulario();
        loadFileUsuarios();
        loadFileEditoras();
        loadFileLivros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        btnVenderLivro = new javax.swing.JButton();
        btnListarLivro = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        menuItemCadastrarUsuario = new javax.swing.JMenuItem();
        menuItemCadastrarEditora = new javax.swing.JMenuItem();
        menuItemCadastrarLivro = new javax.swing.JMenuItem();
        menuPesquisar = new javax.swing.JMenu();
        menuItemPesquisarUsuario = new javax.swing.JMenuItem();
        menuItemPesquisarEditora = new javax.swing.JMenuItem();
        menuItemPesquisarLivro = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuItemAjudaSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Desktop.setBackground(new java.awt.Color(204, 204, 204));

        btnVenderLivro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVenderLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_x64.png"))); // NOI18N
        btnVenderLivro.setText("VENDER LIVRO");
        btnVenderLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderLivroActionPerformed(evt);
            }
        });

        btnListarLivro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnListarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search_x64.png"))); // NOI18N
        btnListarLivro.setText("LISTAR LIVROS");
        btnListarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarLivroActionPerformed(evt);
            }
        });

        btnSobre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about_x32.png"))); // NOI18N
        btnSobre.setText("SOBRE");
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off_x32.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        Desktop.setLayer(btnVenderLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(btnListarLivro, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(btnSobre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Desktop.setLayer(btnSair, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addGroup(DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(btnVenderLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DesktopLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnVenderLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnListarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuArquivo.setText("Arquivo");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        jMenuBar1.add(menuArquivo);

        menuCadastrar.setText("Cadastrar");

        menuItemCadastrarUsuario.setText("Usuários");
        menuItemCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarUsuario);

        menuItemCadastrarEditora.setText("Editora");
        menuItemCadastrarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarEditoraActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarEditora);

        menuItemCadastrarLivro.setText("Livro");
        menuItemCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCadastrarLivroActionPerformed(evt);
            }
        });
        menuCadastrar.add(menuItemCadastrarLivro);

        jMenuBar1.add(menuCadastrar);

        menuPesquisar.setText("Pesquisar");

        menuItemPesquisarUsuario.setText("Usuário");
        menuItemPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesquisarUsuarioActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuItemPesquisarUsuario);

        menuItemPesquisarEditora.setText("Editora");
        menuItemPesquisarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesquisarEditoraActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuItemPesquisarEditora);

        menuItemPesquisarLivro.setText("Livro");
        menuItemPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPesquisarLivroActionPerformed(evt);
            }
        });
        menuPesquisar.add(menuItemPesquisarLivro);

        jMenuBar1.add(menuPesquisar);

        menuAjuda.setText("Ajuda");

        menuItemAjudaSobre.setText("Sobre");
        menuItemAjudaSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAjudaSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuItemAjudaSobre);

        jMenuBar1.add(menuAjuda);

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

    private void menuItemCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarUsuarioActionPerformed
        abrirFormulario(new FormUsuarios());
    }//GEN-LAST:event_menuItemCadastrarUsuarioActionPerformed

    private void menuItemAjudaSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAjudaSobreActionPerformed
        abrirFormulario(new FormSobre());
    }//GEN-LAST:event_menuItemAjudaSobreActionPerformed

    private void menuItemPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesquisarUsuarioActionPerformed
        abrirFormulario(new FormVisualizarUsuario());
    }//GEN-LAST:event_menuItemPesquisarUsuarioActionPerformed

    private void menuItemCadastrarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarEditoraActionPerformed
        abrirFormulario(new FormEditora());
    }//GEN-LAST:event_menuItemCadastrarEditoraActionPerformed

    private void menuItemPesquisarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesquisarEditoraActionPerformed
        abrirFormulario(new FormVisualizarEditora());
    }//GEN-LAST:event_menuItemPesquisarEditoraActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void menuItemCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrarLivroActionPerformed
        abrirFormulario(new FormLivro());
    }//GEN-LAST:event_menuItemCadastrarLivroActionPerformed

    private void menuItemPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPesquisarLivroActionPerformed
        abrirFormulario(new FormVisualizarLivro());
    }//GEN-LAST:event_menuItemPesquisarLivroActionPerformed

    private void btnListarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarLivroActionPerformed
        abrirFormulario(new FormVisualizarLivro());
    }//GEN-LAST:event_btnListarLivroActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        abrirFormulario(new FormSobre());
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnVenderLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderLivroActionPerformed
        abrirFormulario(new FormVenderLivro());
    }//GEN-LAST:event_btnVenderLivroActionPerformed

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
    private javax.swing.JButton btnListarLivro;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnVenderLivro;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenuItem menuItemAjudaSobre;
    private javax.swing.JMenuItem menuItemCadastrarEditora;
    private javax.swing.JMenuItem menuItemCadastrarLivro;
    private javax.swing.JMenuItem menuItemCadastrarUsuario;
    private javax.swing.JMenuItem menuItemPesquisarEditora;
    private javax.swing.JMenuItem menuItemPesquisarLivro;
    private javax.swing.JMenuItem menuItemPesquisarUsuario;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuPesquisar;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("WWBookStore");
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
    //leitura do arquivo Json que armazena os cadastros dos clientes
    private void loadFileUsuarios() {
        
        try {
            JsonReader reader = new JsonReader(new FileReader(
                    "D:\\OneDrive\\ESCOLA\\FACULDADE\\UNAERP\\Stage_04-2019-1\\Laboratório de Programação III\\Aulas\\Programming-Lab-III\\LabIII_work02\\src\\files\\usuarios.json"
                )
            );
            
            reader.beginArray();
            while(reader.hasNext()){
                Classes.Usuario cli = new Gson().fromJson(reader, Classes.Usuario.class);
                usuarios.add(cli);
            }
        } catch (Exception e) {
            System.out.println("ERRO: "+e.getMessage());
        }
    }
    //leitura do arquivo Json que armazena os cadastros dos clientes
    private void loadFileEditoras() {
        
        try {
            JsonReader reader = new JsonReader(new FileReader(
                    "D:\\OneDrive\\ESCOLA\\FACULDADE\\UNAERP\\Stage_04-2019-1\\Laboratório de Programação III\\Aulas\\Programming-Lab-III\\LabIII_work02\\src\\files\\editoras.json"
                )
            );
            
            reader.beginArray();
            while(reader.hasNext()){
                Classes.Editora cli = new Gson().fromJson(reader, Classes.Editora.class);
                editoras.add(cli);
            }
        } catch (Exception e) {
            System.out.println("ERRO: "+e.getMessage());
        }
    }
    //leitura do arquivo Json que armazena os cadastros dos clientes
    private void loadFileLivros() {
        
        try {
            JsonReader reader = new JsonReader(new FileReader(
                    "D:\\OneDrive\\ESCOLA\\FACULDADE\\UNAERP\\Stage_04-2019-1\\Laboratório de Programação III\\Aulas\\Programming-Lab-III\\LabIII_work02\\src\\files\\livros.json"
                )
            );
            
            reader.beginArray();
            while(reader.hasNext()){
                Classes.Livro cli = new Gson().fromJson(reader, Classes.Livro.class);
                livros.add(cli);
            }
        } catch (Exception e) {
            System.out.println("ERRO: "+e.getMessage());
        }
    }
}
