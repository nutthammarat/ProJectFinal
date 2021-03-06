
public class ChangeAddressForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangeAddress
     */
    public ChangeAddressForm() {
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

        lbl_ChangeAddress = new javax.swing.JLabel();
        lbl_address = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        txt_nameaddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(546, 293));
        setResizable(false);
        setSize(new java.awt.Dimension(546, 293));
        getContentPane().setLayout(null);

        lbl_ChangeAddress.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbl_ChangeAddress.setText("Change Address");
        getContentPane().add(lbl_ChangeAddress);
        lbl_ChangeAddress.setBounds(170, 60, 190, 29);

        lbl_address.setText("New Address :");
        getContentPane().add(lbl_address);
        lbl_address.setBounds(130, 130, 70, 14);

        btn_ok.setBackground(new java.awt.Color(34, 167, 240));
        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_ok.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ok);
        btn_ok.setBounds(290, 170, 60, 25);

        btn_cancel.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel);
        btn_cancel.setBounds(360, 170, 80, 25);

        txt_nameaddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nameaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameaddressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nameaddress);
        txt_nameaddress.setBounds(220, 120, 220, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        ProfileService.showProfileForm();
        this.hide();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_nameaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameaddressActionPerformed

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        User user = ProfileService.getUser("user2");
        String address = txt_nameaddress.getText();
        if(ProfileService.checkNull(address)){
            ProfileService.changeAddress(user,address);
            ProfileService.showProfileForm();
            this.hide();
        }
    }//GEN-LAST:event_btn_okActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeAddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeAddressForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeAddressForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel lbl_ChangeAddress;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JTextField txt_nameaddress;
    // End of variables declaration//GEN-END:variables
}
