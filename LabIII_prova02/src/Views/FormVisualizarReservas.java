package Views;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 828507
 */
public class FormVisualizarReservas extends javax.swing.JInternalFrame {

    public FormVisualizarReservas() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPassageiros = new javax.swing.JTable();

        tblPassageiros.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPassageiros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPassageirosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPassageiros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPassageirosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPassageirosMouseClicked
        int lin = tblPassageiros.getSelectedRow();
        String nome = tblPassageiros.getValueAt(lin, 2).toString();
        
        if (lin >= 0) {
            tblPassageiros.getValueAt(lin, 0);

            for(Classes.Passageiro p : FormPrincipal.passageiros) {
                if (p.getCheckin() == "N" && p.getNome() == nome)  {
                    p.setCheckin("S");
                } else if ((p.getCheckin() == "S" && p.getNome() == nome)) {
                    p.setCheckin("N");
                }
            }
        }
        configurarTabela();
    }//GEN-LAST:event_tblPassageirosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPassageiros;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Visualizar Passagens");
        this.setResizable(false);
        
        this.setMaximizable(false);
        this.setClosable(true);
        this.setIconifiable(false);
        
        configurarTabela();
    }
    
    private void configurarTabela() {
        DefaultTableModel m = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };
        m.addColumn("Check-in");
        m.addColumn("Tipo");
        m.addColumn("Nome");
        m.addColumn("Data");
        m.addColumn("Origem");
        m.addColumn("Destino");
        
        for(Classes.Passageiro p : FormPrincipal.passageiros) {
            m.addRow(new Object[] {
                    p.getCheckin(),
                    p.getTipo(),
                    p.getNome(),
                    p.getData(),
                    p.getOrigem(),
                    p.getDestino()
                }
            );
        }
        tblPassageiros.setModel(m);
    }
}
