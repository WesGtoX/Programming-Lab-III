package class20_2019_05_03;

import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley
 */
public class FormPizzariaDoJoao extends javax.swing.JFrame {

    public FormPizzariaDoJoao() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPizzariaDoJoao = new javax.swing.JLabel();
        rdbPequena = new javax.swing.JRadioButton();
        rdbMedia = new javax.swing.JRadioButton();
        rdbGrande = new javax.swing.JRadioButton();
        rdbExtraGrande = new javax.swing.JRadioButton();
        lblIngredientes = new javax.swing.JLabel();
        chkMolho = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        chkQueijo = new javax.swing.JCheckBox();
        chkCebola = new javax.swing.JCheckBox();
        chkBacon = new javax.swing.JCheckBox();
        chkFrango = new javax.swing.JCheckBox();
        chkPresunto = new javax.swing.JCheckBox();
        chkCalabresa = new javax.swing.JCheckBox();
        chkPalmito = new javax.swing.JCheckBox();
        chkAzeitona = new javax.swing.JCheckBox();
        btnCalcularPreco = new javax.swing.JButton();
        imgPizzaBox = new javax.swing.JLabel();
        lblDelivery = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPizzariaDoJoao.setFont(new java.awt.Font("Dialog", 3, 28)); // NOI18N
        lblPizzariaDoJoao.setText("Pizzaria do João");

        rdbPequena.setText("Pequena");
        rdbPequena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPequenaActionPerformed(evt);
            }
        });

        rdbMedia.setText("Média");

        rdbGrande.setText("Grande");

        rdbExtraGrande.setText("Extra Grande");

        lblIngredientes.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        lblIngredientes.setText("Ingredientes");

        chkMolho.setText("Molho");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Tamanho");

        chkQueijo.setText("Queijo");

        chkCebola.setText("Cebola");

        chkBacon.setText("Bacon");

        chkFrango.setText("Frango");

        chkPresunto.setText("Presunto");

        chkCalabresa.setText("Calabresa");

        chkPalmito.setText("Palmito");

        chkAzeitona.setText("Azeitona");

        btnCalcularPreco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCalcularPreco.setText("Calcular preço");
        btnCalcularPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularPrecoActionPerformed(evt);
            }
        });

        imgPizzaBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pizza_box.png"))); // NOI18N

        lblDelivery.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDelivery.setText("Delivery: 16 99169-7336");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcularPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngredientes)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imgPizzaBox)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPizzariaDoJoao)
                                    .addComponent(lblDelivery)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkMolho)
                                    .addComponent(chkQueijo)
                                    .addComponent(chkCebola))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkBacon)
                                    .addComponent(chkFrango)
                                    .addComponent(chkPresunto))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkCalabresa)
                                    .addComponent(chkPalmito)
                                    .addComponent(chkAzeitona)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbPequena)
                                .addGap(18, 18, 18)
                                .addComponent(rdbMedia)
                                .addGap(18, 18, 18)
                                .addComponent(rdbGrande)
                                .addGap(18, 18, 18)
                                .addComponent(rdbExtraGrande)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPizzariaDoJoao)
                        .addGap(13, 13, 13)
                        .addComponent(lblDelivery))
                    .addComponent(imgPizzaBox))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbPequena)
                    .addComponent(rdbMedia)
                    .addComponent(rdbGrande)
                    .addComponent(rdbExtraGrande))
                .addGap(18, 18, 18)
                .addComponent(lblIngredientes)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chkMolho)
                            .addGap(18, 18, 18)
                            .addComponent(chkQueijo)
                            .addGap(18, 18, 18)
                            .addComponent(chkCebola))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(chkBacon)
                            .addGap(18, 18, 18)
                            .addComponent(chkFrango)
                            .addGap(18, 18, 18)
                            .addComponent(chkPresunto)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkCalabresa)
                        .addGap(18, 18, 18)
                        .addComponent(chkPalmito)
                        .addGap(18, 18, 18)
                        .addComponent(chkAzeitona)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnCalcularPreco)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbPequenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPequenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbPequenaActionPerformed

    private void btnCalcularPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularPrecoActionPerformed
        double preco = 0;
        
        if (rdbPequena.isSelected()) {
            preco = 30.0;
        } else if (rdbMedia.isSelected()) {
            preco = 40.00;
        } else if (rdbGrande.isSelected()) {
            preco = 50.00;
        } else if (rdbExtraGrande.isSelected()) {
            preco = 60.00;
        }
        
        if (chkMolho.isSelected()) {
            preco += 2.50;
        }
        preco += chkAzeitona.isSelected() ? 1.50 : 0.00;
        preco += chkBacon.isSelected() ? 5.00 : 0.00;
        preco += chkCalabresa.isSelected() ? 3.50 : 0.00;
        preco += chkCebola.isSelected() ? 2.50 : 0.00;
        preco += chkFrango.isSelected() ? 6.00 : 0.00;
        preco += chkPalmito.isSelected() ? 7.00 : 0.00;
        preco += chkPresunto.isSelected() ? 3.50 : 0.00;
        preco += chkQueijo.isSelected() ? 4.50 : 0.00;
        
        JOptionPane.showMessageDialog(null, 
                String.format("Preço: R$ %.2f", preco));
        
        chkMolho.setSelected(false);
        
        //DESMARCAR todos os CheckBox
        for(Component comp : getContentPane().getComponents()) {
            if (comp instanceof JCheckBox) {
                JCheckBox chk = (JCheckBox)comp;
                chk.setSelected(false);
            }
        }
        rdbGrande.setSelected(true);
    }//GEN-LAST:event_btnCalcularPrecoActionPerformed

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
            java.util.logging.Logger.getLogger(FormPizzariaDoJoao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPizzariaDoJoao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPizzariaDoJoao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPizzariaDoJoao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPizzariaDoJoao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularPreco;
    private javax.swing.JCheckBox chkAzeitona;
    private javax.swing.JCheckBox chkBacon;
    private javax.swing.JCheckBox chkCalabresa;
    private javax.swing.JCheckBox chkCebola;
    private javax.swing.JCheckBox chkFrango;
    private javax.swing.JCheckBox chkMolho;
    private javax.swing.JCheckBox chkPalmito;
    private javax.swing.JCheckBox chkPresunto;
    private javax.swing.JCheckBox chkQueijo;
    private javax.swing.JLabel imgPizzaBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDelivery;
    private javax.swing.JLabel lblIngredientes;
    private javax.swing.JLabel lblPizzariaDoJoao;
    private javax.swing.JRadioButton rdbExtraGrande;
    private javax.swing.JRadioButton rdbGrande;
    private javax.swing.JRadioButton rdbMedia;
    private javax.swing.JRadioButton rdbPequena;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Pizzaria do João");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        //Definir SELEÇÃO EXCLUSIVA nos RadioButtons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbPequena);
        bg.add(rdbMedia);
        bg.add(rdbGrande);
        bg.add(rdbExtraGrande);
        rdbGrande.setSelected(true);
    }
}
