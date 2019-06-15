package Views;

import Classes.Passageiro;
import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 828507
 */
public class FormReservarPassagem extends javax.swing.JInternalFrame {

    public FormReservarPassagem() {
        initComponents();
        configurarFormulario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipo = new javax.swing.JLabel();
        rdbIda = new javax.swing.JRadioButton();
        rdbIdaeVolta = new javax.swing.JRadioButton();
        lblOrigem = new javax.swing.JLabel();
        cbxOrigem = new javax.swing.JComboBox<>();
        lblDestino = new javax.swing.JLabel();
        scpDestino = new javax.swing.JScrollPane();
        lstDestino = new javax.swing.JList<>();
        lblDatadePartida = new javax.swing.JLabel();
        txtDatadePartida = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnReservar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblTipo.setText("Tipo");

        rdbIda.setText("Ida");

        rdbIdaeVolta.setText("Ida e Volta");

        lblOrigem.setText("Origem");

        cbxOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Aeroporto", "Bahia - Paulo Afonso (PAV)", "Belo Horizonte - Tancredo Neves (CNF)", "Brasília - Juscelino Kubitschek (BSB/SBBR)", "Rio de Janeiro - Santos Dumont (SDU)", "São Paulo - Congonhas (CGH)", "São Paulo - Guarulhos (GRU/SBGR)" }));

        lblDestino.setText("Destino");

        lstDestino.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bahia - Paulo Afonso (PAV)", "Belo Horizonte - Tancredo Neves (CNF)", "Brasília - Juscelino Kubitschek (BSB/SBBR)", "Rio de Janeiro - Santos Dumont (SDU)", "São Paulo - Congonhas (CGH)", "São Paulo - Guarulhos (GRU/SBGR)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstDestino.setMaximumSize(new java.awt.Dimension(300, 100));
        lstDestino.setMinimumSize(new java.awt.Dimension(300, 100));
        lstDestino.setPreferredSize(new java.awt.Dimension(300, 100));
        scpDestino.setViewportView(lstDestino);

        lblDatadePartida.setText("Data de Partida");

        lblNome.setText("Nome");

        btnReservar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbIda)
                                .addGap(18, 18, 18)
                                .addComponent(rdbIdaeVolta))
                            .addComponent(lblOrigem)
                            .addComponent(lblDestino)
                            .addComponent(scpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblDatadePartida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDatadePartida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbIda)
                    .addComponent(rdbIdaeVolta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOrigem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDestino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDatadePartida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDatadePartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        
        String tipo = "";
        String checkin = "N";
        
        if (rdbIda.isSelected()) {
            tipo  = "Ida";
        } else if (rdbIdaeVolta.isSelected()) {
            tipo  = "Ida/Volta";
        }
        
        FormPrincipal.passageiros.add(
            new Passageiro(
                    checkin,
                    txtNome.getText(),
                    tipo,
                    txtDatadePartida.getText(),
                    (String) cbxOrigem.getSelectedItem(),
                    lstDestino.getSelectedValue()
            )
        );
        
        txtNome.setText("");
        rdbIda.setSelected(false);
        rdbIdaeVolta.setSelected(false);
        txtDatadePartida.setText("");
        cbxOrigem.setSelectedIndex(0);
        lstDestino.setSelectedIndex(0);
        txtNome.requestFocus();
        
//        saveFilePassageiros();
        
        JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JComboBox<String> cbxOrigem;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDatadePartida;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JList<String> lstDestino;
    private javax.swing.JRadioButton rdbIda;
    private javax.swing.JRadioButton rdbIdaeVolta;
    private javax.swing.JScrollPane scpDestino;
    private javax.swing.JTextField txtDatadePartida;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void configurarFormulario() {
        this.setTitle("Reservar Passagem");
        this.setResizable(false);
        
        this.setMaximizable(true);
        this.setClosable(true);
        this.setIconifiable(true);
        
        //Definir SELEÇÃO EXCLUSIVA nos RadioButtons
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbIda);
        bg.add(rdbIdaeVolta);
    }
    
    private void preencherOrigem() {
        String origems[] = new String[] {
            "Bahia - Paulo Afonso (PAV)",
            "Belo Horizonte - Tancredo Neves (CNF)",
            "Brasília - Juscelino Kubitschek (BSB/SBBR)",
            "Rio de Janeiro - Santos Dumont (SDU)",
            "São Paulo - Congonhas (CGH)",
            "São Paulo - Guarulhos (GRU/SBGR)"
        };
        
        DefaultComboBoxModel m = new DefaultComboBoxModel(origems);
        cbxOrigem.setModel(m);
        
        cbxOrigem.setSelectedIndex(0);
    }
    
    private void preencherListaDestino() {
        String destinos[] = new String[] {
            "Bahia - Paulo Afonso (PAV)",
            "Belo Horizonte - Tancredo Neves (CNF)",
            "Brasília - Juscelino Kubitschek (BSB/SBBR)",
            "Rio de Janeiro - Santos Dumont (SDU)",
            "São Paulo - Congonhas (CGH)",
            "São Paulo - Guarulhos (GRU/SBGR)"
        };
        
        //ORDENAÇÃO
        List<String> lista = new ArrayList<>();
        for (String s : destinos) {
            lista.add(s);
        }
        Collections.sort(lista);
        
        DefaultListModel m = new DefaultListModel();
        for (String u : lista) {
            m.addElement(u);
        }
        lstDestino.setModel(m);
    }

    private void saveFilePassageiros() {
        try{;
            JsonWriter writer = new JsonWriter(new FileWriter(
                    "D:\\OneDrive\\ESCOLA\\FACULDADE\\UNAERP\\Stage_04-2019-1\\Laboratório de Programação III\\Aulas\\Programming-Lab-III\\LabIII_prova02\\src\\files\\passageiros.json"
                )
            );
            writer.beginArray();
            for (Passageiro cli: FormPrincipal.passageiros) {
                new Gson().toJson(cli, Passageiro.class, writer);
            }
            writer.endArray();
            writer.close();
            
        }catch(Exception e){
            System.out.println("ERRO: "+ e.getMessage());
        }
    }
}
