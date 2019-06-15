package class21_2019_05_10;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wesley
 */
public class FormCadastroCliente extends javax.swing.JFrame {
    
    // List = java.util.List
    private List<Cliente> dados;

    public FormCadastroCliente() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPrincipal = new javax.swing.JTabbedPane();
        tabPesquisar = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblEscolaridade = new javax.swing.JLabel();
        lblProfissao = new javax.swing.JLabel();
        lblTelefoneFixo = new javax.swing.JLabel();
        lblTelefoneCelular = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbxSexo = new javax.swing.JComboBox<>();
        cbxEscolaridade = new javax.swing.JComboBox<>();
        txtTelefoneFixo = new javax.swing.JTextField();
        txtTelefoneCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        scpProfissao = new javax.swing.JScrollPane();
        lstProfissao = new javax.swing.JList<>();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tabCadastrar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        lblPesquisar = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        tabGerenciar = new javax.swing.JPanel();
        btnExportar = new javax.swing.JButton();
        btnImportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblId.setText("Id");

        lblNome.setText("Nome");

        lblSexo.setText("Sexo");

        lblEscolaridade.setText("Escolaridade");

        lblProfissao.setText("Profissão");

        lblTelefoneFixo.setText("Telefone Fixo");

        lblTelefoneCelular.setText("Telefone Celular");

        lblEmail.setText("E-mail");

        txtId.setPreferredSize(new java.awt.Dimension(150, 25));

        txtNome.setMinimumSize(new java.awt.Dimension(25, 100));
        txtNome.setPreferredSize(new java.awt.Dimension(300, 25));

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbxEscolaridade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTelefoneFixo.setPreferredSize(new java.awt.Dimension(150, 25));

        txtTelefoneCelular.setPreferredSize(new java.awt.Dimension(150, 25));

        txtEmail.setPreferredSize(new java.awt.Dimension(150, 25));

        lstProfissao.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scpProfissao.setViewportView(lstProfissao);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabPesquisarLayout = new javax.swing.GroupLayout(tabPesquisar);
        tabPesquisar.setLayout(tabPesquisarLayout);
        tabPesquisarLayout.setHorizontalGroup(
            tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPesquisarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addGroup(tabPesquisarLayout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabPesquisarLayout.createSequentialGroup()
                        .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblProfissao)
                            .addComponent(scpProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSexo)
                            .addComponent(lblId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefoneFixo)
                            .addComponent(lblTelefoneCelular)
                            .addComponent(lblEmail)
                            .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(txtTelefoneCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTelefoneFixo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEscolaridade))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        tabPesquisarLayout.setVerticalGroup(
            tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPesquisarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(lblEscolaridade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxEscolaridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfissao)
                    .addComponent(lblTelefoneFixo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tabPesquisarLayout.createSequentialGroup()
                        .addComponent(txtTelefoneFixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTelefoneCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scpProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabPesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tabPrincipal.addTab("Cadastrar", new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_signup.png")), tabPesquisar); // NOI18N

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        lblPesquisar.setText("Pesquisar");

        txtPesquisar.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout tabCadastrarLayout = new javax.swing.GroupLayout(tabCadastrar);
        tabCadastrar.setLayout(tabCadastrarLayout);
        tabCadastrarLayout.setHorizontalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabCadastrarLayout.createSequentialGroup()
                        .addComponent(lblPesquisar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabCadastrarLayout.setVerticalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPrincipal.addTab("Pesquisar", new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_search.png")), tabCadastrar); // NOI18N

        btnExportar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnImportar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnImportar.setText("Importar");
        btnImportar.setPreferredSize(new java.awt.Dimension(150, 40));
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabGerenciarLayout = new javax.swing.GroupLayout(tabGerenciar);
        tabGerenciar.setLayout(tabGerenciarLayout);
        tabGerenciarLayout.setHorizontalGroup(
            tabGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabGerenciarLayout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(tabGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );
        tabGerenciarLayout.setVerticalGroup(
            tabGerenciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabGerenciarLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        btnExportar.getAccessibleContext().setAccessibleDescription("");

        tabPrincipal.addTab("Gerenciar", new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_manage.png")), tabGerenciar); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPrincipal.getAccessibleContext().setAccessibleName("Pesquisar");
        tabPrincipal.getAccessibleContext().setAccessibleDescription("/home/wesley/ESCOLA/FACULDADE/UNAERP/Stage 04 – 2019-1/Laboratório de Programação III/Aulas/Programming-Lab-III/LabIII_classes_GUI/src/imagens/search.png");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        DefaultTableModel m =
                (DefaultTableModel)tblClientes.getModel();
        
        int lin = 0;
        if (txtId.getText().isEmpty()) {
            //Adicionar dados na TABELA
            m.addRow(new Object[] {
                m.getRowCount() + 1,                // Id
                txtNome.getText(),                  // Nome
                cbxSexo.getSelectedItem(),          // Sexo
                cbxEscolaridade.getSelectedItem(),  // Escolaridade
                lstProfissao.getSelectedValue(),    // Profissão
                txtTelefoneFixo.getText(),          // Telefone Fixo
                txtTelefoneCelular.getText(),       // Telefone Celular
                txtEmail.getText(),                 // E-mail
            });
            lin = m.getRowCount() - 1;
        } else {
            //Editar dados na TABELA
            String id = txtId.getText();
            while (!m.getValueAt(lin, 0).toString().equals(id)) {
                lin++;
            }
            m.setValueAt(txtNome.getText(), lin, 1);                  // Nome
            m.setValueAt(cbxSexo.getSelectedItem(), lin, 2);          // Sexo
            m.setValueAt(cbxEscolaridade.getSelectedItem(), lin, 3);  // Escolaridade
            m.setValueAt(lstProfissao.getSelectedValue(), lin, 4);    // Profissão
            m.setValueAt(txtTelefoneFixo.getText(), lin, 5);          // Telefone Fixo
            m.setValueAt(txtTelefoneCelular.getText(), lin, 6);       // Telefone Celular
            m.setValueAt(txtEmail.getText(), lin, 7);                 // E-mail
        }
        tblClientes.setModel(m);

        JOptionPane.showMessageDialog(null,
                "Operação realizada com Sucesso!"
        );
        
        txtId.setText("");
        txtNome.setText("");
        cbxSexo.setSelectedIndex(0);
        cbxEscolaridade.setSelectedIndex(0);
        lstProfissao.setSelectedIndex(0);
        txtTelefoneFixo.setText("");
        txtTelefoneCelular.setText("");
        txtEmail.setText("");

        tabPrincipal.setSelectedIndex(1);
        
        // Adcionar dados a Lista Dinâmica
        Cliente cli = new Cliente(
            m.getValueAt(lin, 0).toString(),            // Id
            m.getValueAt(lin, 1).toString(),            // Nome
            m.getValueAt(lin, 2).toString(),            // Sexo
            m.getValueAt(lin, 3).toString(),            // Escolaridade
            m.getValueAt(lin, 4).toString(),            // Profissão
            m.getValueAt(lin, 5).toString(),            // Telefone Fixo
            m.getValueAt(lin, 6).toString(),            // Telefone Celular
            m.getValueAt(lin, 7).toString()             // E-mail
        );
        
        if (dados.size() < m.getRowCount()) {
            dados.add(cli);         // Adicionar um novo
        } else {
            dados.set(lin, cli);    // Alterar
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int lin = tblClientes.getSelectedRow();
        if (lin >= 0) {
            txtId.setText(tblClientes.getValueAt(lin, 0).toString());
            txtNome.setText(tblClientes.getValueAt(lin, 1).toString());
            cbxSexo.setSelectedItem(tblClientes.getValueAt(lin, 2));
            cbxEscolaridade.setSelectedItem(tblClientes.getValueAt(lin, 3));
            lstProfissao.setSelectedValue(tblClientes.getValueAt(lin, 4),true);
            txtTelefoneFixo.setText(tblClientes.getValueAt(lin, 5).toString());
            txtTelefoneCelular.setText(tblClientes.getValueAt(lin, 6).toString());
            txtEmail.setText(tblClientes.getValueAt(lin, 7).toString());
            
            tabPrincipal.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtId.setText("");
        txtNome.setText("");
        cbxSexo.setSelectedIndex(0);
        cbxEscolaridade.setSelectedIndex(0);
        lstProfissao.setSelectedIndex(0);
        txtTelefoneFixo.setText("");
        txtTelefoneCelular.setText("");
        txtEmail.setText("");
        txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            JsonWriter writer = new JsonWriter(
                new FileWriter("/home/wesley/ESCOLA/FACULDADE/UNAERP/Stage 04 – 2019-1/Laboratório de Programação III/Aulas/Programming-Lab-III/LabIII_classes_GUI/src/files/dados.json")
            );
            writer.beginArray();

            for(Cliente cli : dados) {
                new Gson().toJson(cli, Cliente.class, writer);
            }
            writer.endArray();
            writer.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        try {
            JsonReader reader = new JsonReader(
                new FileReader("/home/wesley/ESCOLA/FACULDADE/UNAERP/Stage 04 – 2019-1/Laboratório de Programação III/Aulas/Programming-Lab-III/LabIII_classes_GUI/src/files/dados.json")
            );
            configurarTabela();

            DefaultTableModel m = (DefaultTableModel)
                    tblClientes.getModel();
            
            dados = new ArrayList<>();
            reader.beginArray();
            while(reader.hasNext()) {
                Cliente cli = new Gson().fromJson(
                        reader, Cliente.class
                );
                dados.add(cli);
                
                m.addRow(new Object[] {
                    cli.getId(),
                    cli.getNome(),
                    cli.getSexo(),
                    cli.getEscolaridade(),
                    cli.getProfissao(),
                    cli.getTelefoneFixo(),
                    cli.getTelefoneCelular(),
                    cli.getEmail()
                });
            }
            reader.endArray();
            reader.close();
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }//GEN-LAST:event_btnImportarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEscolaridade;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEscolaridade;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPesquisar;
    private javax.swing.JLabel lblProfissao;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefoneCelular;
    private javax.swing.JLabel lblTelefoneFixo;
    private javax.swing.JList<String> lstProfissao;
    private javax.swing.JScrollPane scpProfissao;
    private javax.swing.JPanel tabCadastrar;
    private javax.swing.JPanel tabGerenciar;
    private javax.swing.JPanel tabPesquisar;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtTelefoneCelular;
    private javax.swing.JTextField txtTelefoneFixo;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Cadastro de Clientes");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        //Iniciar com a guia CADASTRAR selecionada
        tabPrincipal.setSelectedIndex(0);
        
        preencherComboSexo();
        preencherEscolaridade();
        preencherListaProfissoes();
        
        configurarTabela();
        txtId.setEditable(false);
        
        // Criar a lista dinâmica de clientes
        dados = new ArrayList<>();
    }
    
    private void preencherComboSexo() {
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        m.addElement("Masculino");
        m.addElement("Feminino");
        cbxSexo.setModel(m);
    }
    
    private void preencherEscolaridade() {
        String escolaridade[] = new String[] {
            "Ensino Fundamental",
            "Ensino Médio",
            "Ensino Superior",
            "Especialização",
            "Mestrado",
            "Doutorado"
        };
        DefaultComboBoxModel m = new DefaultComboBoxModel(escolaridade);
        cbxEscolaridade.setModel(m);
        
        //Definir "Ensino Superior" como selecionado
        cbxEscolaridade.setSelectedIndex(2);
    }
    
    private void preencherListaProfissoes() {
        String profissoes[] = new String[] {
            "Astronomia",
            "Banco de Dados",
            "Ciência da Computação",
            "Ciência e Tecnologia",
            "Computação",
            "Estatística",
            "Física",
            "Gestão da Tecnologia da Informação",
            "Informática Biomédica",
            "Matemática",
            "Nanotecnologia",
            "Química",
            "Redes de Computadores",
            "Segurança da Informação",
            "Sistemas de Informação",
            "Sistemas para Internet",
            "Engenharia da Computação"
        };
        
        //ORDENAÇÃO
        List<String> lista = new ArrayList<>();
        for (String s : profissoes) {
            lista.add(s);
        }
        Collections.sort(lista);
        
        DefaultListModel m = new DefaultListModel();
        for (String u : lista) {
            m.addElement(u);
        }
        lstProfissao.setModel(m);
        
        //Definir o modo de múltiplas seleções
        lstProfissao.setSelectionMode(
            ListSelectionModel.MULTIPLE_INTERVAL_SELECTION
        );
        
//        //Definir o Modo de seleção
//        lstProfissao.setSelectedIndex(
//            ListSelectionModel.SINGLE_SELECTION
//        );
    }
    
    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        
        m.addColumn("Id");
        m.addColumn("Nome");
        m.addColumn("Sexo");
        m.addColumn("Escolaridade");
        m.addColumn("Profissão");
        m.addColumn("Tel.Fixo");
        m.addColumn("Tel.Celular");
        m.addColumn("Email");
        tblClientes.setModel(m);
    }
}
