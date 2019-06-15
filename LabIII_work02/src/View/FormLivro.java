package View;

import Classes.Livro;
import static View.FormPrincipal.editoras;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Wesley
 */
public class FormLivro extends javax.swing.JInternalFrame {

    public FormLivro() {
        initComponents();
        configurarFormulario();
        preencherComboEditora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigoLivro = new javax.swing.JLabel();
        txtCodigoLivro = new javax.swing.JTextField();
        lblEditoraLivro = new javax.swing.JLabel();
        cbxEditoraLivro = new javax.swing.JComboBox<>();
        lblTituloLivro = new javax.swing.JLabel();
        txtTituloLivro = new javax.swing.JTextField();
        lblAutorLivro = new javax.swing.JLabel();
        txtAutorLivro = new javax.swing.JTextField();
        lblAnoLivro = new javax.swing.JLabel();
        txtAnoLivro = new javax.swing.JTextField();
        lblPrecoLivro = new javax.swing.JLabel();
        txtPrecoLivro = new javax.swing.JTextField();
        lblQuantidadeLivro = new javax.swing.JLabel();
        txtQuantidadeLivro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblCodigoLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigoLivro.setText("Código:");

        txtCodigoLivro.setEnabled(false);

        lblEditoraLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEditoraLivro.setText("Editora:");

        cbxEditoraLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Atica", "Saraiva", "Compania das Letras", "Vagalume", "Darkside", "Casa do Código" }));
        cbxEditoraLivro.setEnabled(false);

        lblTituloLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTituloLivro.setText("Título:");

        txtTituloLivro.setEnabled(false);

        lblAutorLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAutorLivro.setText("Autor:");

        txtAutorLivro.setEnabled(false);

        lblAnoLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAnoLivro.setText("Ano:");

        txtAnoLivro.setEnabled(false);

        lblPrecoLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecoLivro.setText("Preço:");

        txtPrecoLivro.setEnabled(false);

        lblQuantidadeLivro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQuantidadeLivro.setText("Quantidade:");

        txtQuantidadeLivro.setEnabled(false);

        btnNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(lblTituloLivro)
                    .addComponent(lblAutorLivro)
                    .addComponent(txtAutorLivro)
                    .addComponent(txtTituloLivro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigoLivro)
                            .addComponent(lblAnoLivro)
                            .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEditoraLivro)
                                            .addComponent(lblPrecoLivro))
                                        .addGap(120, 120, 120))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblQuantidadeLivro)
                                    .addComponent(txtQuantidadeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cbxEditoraLivro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigoLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEditoraLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEditoraLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTituloLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAutorLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAutorLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblPrecoLivro)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAnoLivro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAnoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblQuantidadeLivro)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPrecoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantidadeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //Adicionar um novo livro a lista
        FormPrincipal.livros.add(
            new Livro(
                    txtCodigoLivro.getText(),
                    txtTituloLivro.getText(),
                    txtAutorLivro.getText(),
                    Integer.parseInt(txtAnoLivro.getText()),
                    Double.parseDouble(txtPrecoLivro.getText()),
                    Integer.parseInt(txtQuantidadeLivro.getText()),
                    cbxEditoraLivro.getSelectedItem().toString())
        );
        //gravando no arquivo Json que armazena os cadastros dos clientes
        try{
            JsonWriter writer = new JsonWriter(new FileWriter(
                    "D:\\OneDrive\\ESCOLA\\FACULDADE\\UNAERP\\Stage_04-2019-1\\Laboratório de Programação III\\Aulas\\Programming-Lab-III\\LabIII_work02\\src\\files\\livros.json"
                )
            );
            
            writer.beginArray();
            for (Livro cli: FormPrincipal.livros) {
                new Gson().toJson(cli, Livro.class, writer);
            }
            writer.endArray();
            writer.close();
            
        }catch(Exception e){
            System.out.println("ERRO: "+ e.getMessage());
        }    
        JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");

        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        // caixa de textos
        txtCodigoLivro.setEnabled(false);
        txtTituloLivro.setEnabled(false);
        txtAutorLivro.setEnabled(false);
        txtAnoLivro.setEnabled(false);
        txtPrecoLivro.setEnabled(false);
        txtQuantidadeLivro.setEnabled(false);
        cbxEditoraLivro.setEnabled(false);

        // limpar caixa de textos
        txtCodigoLivro.setText("");
        txtTituloLivro.setText("");
        txtAutorLivro.setText("");
        txtAnoLivro.setText("");
        txtPrecoLivro.setText("");
        txtQuantidadeLivro.setText("");
        cbxEditoraLivro.setSelectedIndex(0);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);

        // caixa de textos
        txtCodigoLivro.setEnabled(false);
        txtTituloLivro.setEnabled(false);
        txtAutorLivro.setEnabled(false);
        txtAnoLivro.setEnabled(false);
        txtPrecoLivro.setEnabled(false);
        txtQuantidadeLivro.setEnabled(false);
        cbxEditoraLivro.setEnabled(false);

        // limpar caixa de textos
        txtCodigoLivro.setText("");
        txtTituloLivro.setText("");
        txtAutorLivro.setText("");
        txtAnoLivro.setText("");
        txtPrecoLivro.setText("");
        txtQuantidadeLivro.setText("");
        cbxEditoraLivro.setSelectedIndex(0);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);

        // caixa de textos
        txtCodigoLivro.setEnabled(true);
        txtTituloLivro.setEnabled(true);
        txtAutorLivro.setEnabled(true);
        txtAnoLivro.setEnabled(true);
        txtPrecoLivro.setEnabled(true);
        txtQuantidadeLivro.setEnabled(true);
        cbxEditoraLivro.setEnabled(true);

        // limpar caixa de textos
        txtCodigoLivro.setText("");
        txtTituloLivro.setText("");
        txtAutorLivro.setText("");
        txtAnoLivro.setText("");
        txtPrecoLivro.setText("");
        txtQuantidadeLivro.setText("");
        cbxEditoraLivro.setSelectedIndex(0);

        txtCodigoLivro.requestFocus();

    }//GEN-LAST:event_btnNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxEditoraLivro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAnoLivro;
    private javax.swing.JLabel lblAutorLivro;
    private javax.swing.JLabel lblCodigoLivro;
    private javax.swing.JLabel lblEditoraLivro;
    private javax.swing.JLabel lblPrecoLivro;
    private javax.swing.JLabel lblQuantidadeLivro;
    private javax.swing.JLabel lblTituloLivro;
    private javax.swing.JTextField txtAnoLivro;
    private javax.swing.JTextField txtAutorLivro;
    private javax.swing.JTextField txtCodigoLivro;
    private javax.swing.JTextField txtPrecoLivro;
    private javax.swing.JTextField txtQuantidadeLivro;
    private javax.swing.JTextField txtTituloLivro;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Cadastro de Livro");
        this.setResizable(false);
        
        this.setMaximizable(true);
        this.setClosable(true);
        this.setIconifiable(true);
    }
    
    void preencherComboEditora() {
        int i=0;
        String editora[] = new String[editoras.size()];
        for (Classes.Editora cli : editoras) {
            if (i < editoras.size()) {
                editora[i] = (cli.getEditora());
            }
            i++;
        }
        DefaultComboBoxModel lst = new DefaultComboBoxModel(editora);
        cbxEditoraLivro.setModel(lst);
    }
}
