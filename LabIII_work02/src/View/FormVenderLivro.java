/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static View.FormPrincipal.livros;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author wesley
 */
public class FormVenderLivro extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormVenderLivro
     */
    public FormVenderLivro() {
        initComponents();
        configurarFormulario();
        preencherComboLivro();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCliente = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblLivro = new javax.swing.JLabel();
        cbxLivro = new javax.swing.JComboBox<>();
        lblAutor = new javax.swing.JLabel();
        cbxAutor = new javax.swing.JComboBox<>();
        cbxEditora = new javax.swing.JComboBox<>();
        lblEditora = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        cbxAno = new javax.swing.JComboBox<>();
        lblQuantidade = new javax.swing.JLabel();
        spnQuantidade = new javax.swing.JSpinner();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JFormattedTextField();
        btnComprar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setClosable(true);

        lblCliente.setText("Cliente:");

        cbxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o cliente", "Wesley", "João", "Fabio", "Weslley", "Quemuel", "Lucas", "Elio", "Matheus", "Fleury" }));

        lblLivro.setText("Livro");

        cbxLivro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Livro", "Do mil ao Milhão", "Programação em Java", "Segredos da Mente Milionaria", "As Cronicas de Gelo e Fogo", "Coração de Pedra", "A Cabana", "Dezesseis Ruas", "Senhos dos Aneis", "As Cronicas de Gelo e Fogo", "50 Tons de Cinza" }));

        lblAutor.setText("Autor");

        cbxAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione por Autor" }));

        cbxEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione por Editora", "Atica", "Saraiva", "Compania das Letras", "Vagalume", "Darkside", "Casa do Código" }));

        lblEditora.setText("Editora:");

        lblAno.setText("Ano:");

        cbxAno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione por Ano", "1998", "2015", "2005", "2007", "1994", "1999", "2000", "2016" }));
        cbxAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAnoActionPerformed(evt);
            }
        });

        lblQuantidade.setText("Quantidade");

        spnQuantidade.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        lblPreco.setText("Preço: R$");

        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel4.setText("Total: R$");

        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        btnComprar.setText("Comprar");

        btnCalcular.setText("Calcular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnComprar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPreco)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnQuantidade)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLivro)
                            .addComponent(lblEditora)
                            .addComponent(cbxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAutor)
                            .addComponent(cbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAno)
                                    .addGap(74, 74, 74)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLivro)
                    .addComponent(lblAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxAno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblEditora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQuantidade)
                    .addComponent(lblPreco))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnComprar;
    private javax.swing.JComboBox<String> cbxAno;
    private javax.swing.JComboBox<String> cbxAutor;
    private javax.swing.JComboBox<String> cbxCliente;
    private javax.swing.JComboBox<String> cbxEditora;
    private javax.swing.JComboBox<String> cbxLivro;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblEditora;
    private javax.swing.JLabel lblLivro;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JSpinner spnQuantidade;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JFormattedTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Vender Livro");
        this.setResizable(false);
        
        this.setMaximizable(true);
        this.setClosable(true);
        this.setIconifiable(true);
    }
    
    void preencherComboLivro() {
        int i=0;
        String livro[] = new String[livros.size()];
        String autor[] = new String[livros.size()];
        String editora[] = new String[livros.size()];
        String ano[] = new String[livros.size()];
        String preco[] = new String[livros.size()];
        for (Classes.Livro cli : livros) {
            if (i < livros.size()) {
                livro[i] = cli.getTitulo();
                autor[i] = cli.getAutor();
                editora[i] = cli.getEditora();
//                ano[] = cli.getAno();
//                preco[] = cli.getPreco();
            }
            i++;
        }
        DefaultComboBoxModel cLivro = new DefaultComboBoxModel(livro);
        cbxLivro.setModel(cLivro);
        DefaultComboBoxModel cAutor = new DefaultComboBoxModel(autor);
        cbxAutor.setModel(cAutor);
        DefaultComboBoxModel cEditora = new DefaultComboBoxModel(editora);
        cbxEditora.setModel(cEditora);
//        DefaultComboBoxModel cAno = new DefaultComboBoxModel(ano);
//        cbxAno.setModel(cAno);
//        txtPreco.setText(preco.toString());
    }
}
