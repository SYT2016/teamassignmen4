/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagerAirliners;

/**
 *
 * @author admin
 */
public class CreateNewAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerJPanel
     */
    public CreateNewAirlinerJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblAirlinerName = new javax.swing.JLabel();
        lblAirlinerCountry = new javax.swing.JLabel();
        lblAirlinerName2 = new javax.swing.JLabel();
        txtAirlinerName = new javax.swing.JTextField();
        txtAirlinerCountry = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblAirlinerCity = new javax.swing.JLabel();
        txtAirlinerCity = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("Create AirLiner");

        lblAirlinerName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblAirlinerName.setText("Airliner Name:");

        lblAirlinerCountry.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblAirlinerCountry.setText("Airliner Country:");

        lblAirlinerName2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        txtAirlinerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerNameActionPerformed(evt);
            }
        });

        txtAirlinerCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerCountryActionPerformed(evt);
            }
        });

        btnCreate.setText("Create!");

        lblAirlinerCity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblAirlinerCity.setText("Airliner City:");

        txtAirlinerCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAirlinerCityActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAirlinerName)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(lblAirlinerName2))
                            .addComponent(lblAirlinerCountry)
                            .addComponent(lblAirlinerCity))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAirlinerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAirlinerCity, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack)
                        .addGap(51, 51, 51)
                        .addComponent(lblTitle)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirlinerName)
                    .addComponent(txtAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAirlinerCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAirlinerCountry))
                .addGap(17, 17, 17)
                .addComponent(lblAirlinerName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAirlinerCity)
                    .addComponent(txtAirlinerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCreate)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAirlinerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerNameActionPerformed

    private void txtAirlinerCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerCountryActionPerformed

    private void txtAirlinerCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAirlinerCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAirlinerCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAirlinerCity;
    private javax.swing.JLabel lblAirlinerCountry;
    private javax.swing.JLabel lblAirlinerName;
    private javax.swing.JLabel lblAirlinerName2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAirlinerCity;
    private javax.swing.JTextField txtAirlinerCountry;
    private javax.swing.JTextField txtAirlinerName;
    // End of variables declaration//GEN-END:variables
}
