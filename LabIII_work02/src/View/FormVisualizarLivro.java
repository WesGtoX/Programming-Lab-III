package View;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wesley
 */
public class FormVisualizarLivro extends javax.swing.JInternalFrame {

    public FormVisualizarLivro() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivro = new javax.swing.JTable();
        lblPesquisarLivro = new javax.swing.JTextField();
        txtPesquisarLivro = new javax.swing.JLabel();

        tblLivro.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblLivro);

        txtPesquisarLivro.setText("Pesquisar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPesquisarLivro)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisarLivro)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPesquisarLivro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPesquisarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblPesquisarLivro;
    private javax.swing.JTable tblLivro;
    private javax.swing.JLabel txtPesquisarLivro;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Visualizar Livro");
        this.setResizable(false);
        
        this.setMaximizable(false);
        this.setClosable(true);
        this.setIconifiable(false);
        
        DefaultTableModel book = new DefaultTableModel();
        book.addColumn("Código");
        book.addColumn("Título");
        book.addColumn("Autor");
        book.addColumn("Ano");
        book.addColumn("Preço");
        book.addColumn("Quantidade");
        book.addColumn("Editora");
        
        for(Classes.Livro edit : FormPrincipal.livros) {
            book.addRow(new Object[] {
                edit.getCodigo(),
                edit.getTitulo(),
                edit.getAutor(),
                edit.getAno(),
                edit.getPreco(),
                edit.getQuantidade(),
                edit.getEditora()
            });
        }
        tblLivro.setModel(book);
    }

}
