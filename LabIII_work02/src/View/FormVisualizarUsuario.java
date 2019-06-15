package View;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wesley
 */
public class FormVisualizarUsuario extends javax.swing.JInternalFrame {

    public FormVisualizarUsuario() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        lblPesquisarUsuario = new javax.swing.JLabel();
        txtPesquisarUsuario = new javax.swing.JTextField();

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblUsuarios);

        lblPesquisarUsuario.setText("Pesquisar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisarUsuario)
                    .addComponent(txtPesquisarUsuario)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPesquisarUsuario;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtPesquisarUsuario;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Visualizar Usuários");
        this.setResizable(false);
        
        this.setMaximizable(false);
        this.setClosable(true);
        this.setIconifiable(false);
        
        DefaultTableModel us = new DefaultTableModel();
        us.addColumn("Usuario");
        us.addColumn("Nome");
        us.addColumn("Sobrenome");
        us.addColumn("Perfil");
        
        for(Classes.Usuario user : FormPrincipal.usuarios) {
            us.addRow(new Object[] {
                user.getLogin(),
                user.getNome(),
                user.getSobrenome(),
                user.getPerfil()
            });
        }
        tblUsuarios.setModel(us);
    }
}
