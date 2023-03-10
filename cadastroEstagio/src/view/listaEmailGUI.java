/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import code.EmailComboBoxModel;
import code.Cadastrados;
import java.lang.String;
import javax.swing.JOptionPane;

public class listaEmailGUI extends javax.swing.JDialog {

    private Cadastrados cadastrados;
    private EmailComboBoxModel emailComboBoxModel;

    public listaEmailGUI(java.awt.Frame parent, boolean modal, Cadastrados c) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        cadastrados = c;
        emailComboBoxModel = new EmailComboBoxModel();

        for (int i = 0; i < cadastrados.listaEmail().size(); i++) {

            emailComboBoxModel.addEmail(cadastrados.listaEmail().get(i));
        }
        this.jCBBairros.setModel(emailComboBoxModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCBBairros = new javax.swing.JComboBox<>();
        jBSelecionarBairro = new javax.swing.JButton();
        jBOKFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Bairros");

        jBSelecionarBairro.setText("Selecionar");
        jBSelecionarBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarBairroActionPerformed(evt);
            }
        });

        jBOKFechar.setText("OK");
        jBOKFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOKFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jCBBairros, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSelecionarBairro)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jBOKFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBBairros, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSelecionarBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBOKFechar)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSelecionarBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarBairroActionPerformed
        StringBuilder sc = new StringBuilder();
        for (int i = 0; i < cadastrados.emailCadastrado((String) emailComboBoxModel.getSelectedItem()).size(); i++) {
            sc.append(cadastrados.emailCadastrado((String) emailComboBoxModel.getSelectedItem()).get(i)).append("\n");
        }

        JOptionPane.showMessageDialog(this, "As informa????es do cadastrado s??o: \n\n" + sc.toString(), "Informa????es cadastrado )", 0);
    }//GEN-LAST:event_jBSelecionarBairroActionPerformed

    private void jBOKFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOKFecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBOKFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOKFechar;
    private javax.swing.JButton jBSelecionarBairro;
    private javax.swing.JComboBox<String> jCBBairros;
    // End of variables declaration//GEN-END:variables
}
