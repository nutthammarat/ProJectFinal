/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 59161088
 */
public class ProductDetailFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProductDetailFrame
     */
        
    public ProductDetailFrame() {
        initComponents();
        pIdtxt.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic1 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameproduct = new javax.swing.JLabel();
        sizetxt = new javax.swing.JLabel();
        bandtxt = new javax.swing.JLabel();
        colortxt = new javax.swing.JLabel();
        addtocart = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pricetxt = new javax.swing.JLabel();
        plusbtn = new javax.swing.JButton();
        minusbtn = new javax.swing.JButton();
        numtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pIdtxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Detail");
        setMinimumSize(new java.awt.Dimension(622, 479));
        getContentPane().setLayout(null);
        getContentPane().add(pic1);
        pic1.setBounds(60, 90, 180, 150);

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(40, 370, 70, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("รายละเอียดสินค้า");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 30, 130, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ขนาด");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(290, 270, 60, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ยี่ห่อ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 130, 60, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("สี");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(290, 200, 70, 40);

        nameproduct.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameproduct.setText("Name");
        getContentPane().add(nameproduct);
        nameproduct.setBounds(50, 270, 210, 30);

        sizetxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sizetxt.setText("...");
        getContentPane().add(sizetxt);
        sizetxt.setBounds(370, 260, 130, 40);

        bandtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bandtxt.setText("...");
        getContentPane().add(bandtxt);
        bandtxt.setBounds(370, 120, 130, 40);

        colortxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        colortxt.setText("...");
        getContentPane().add(colortxt);
        colortxt.setBounds(370, 200, 130, 40);

        addtocart.setText("Add to Cart");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });
        getContentPane().add(addtocart);
        addtocart.setBounds(410, 370, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("ราคา");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 330, 60, 30);

        pricetxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pricetxt.setText("...");
        getContentPane().add(pricetxt);
        pricetxt.setBounds(370, 320, 130, 40);

        plusbtn.setText("+");
        plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusbtnActionPerformed(evt);
            }
        });
        getContentPane().add(plusbtn);
        plusbtn.setBounds(360, 370, 50, 30);

        minusbtn.setText("-");
        minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusbtnActionPerformed(evt);
            }
        });
        getContentPane().add(minusbtn);
        minusbtn.setBounds(290, 370, 40, 30);

        numtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numtxt.setText("1");
        numtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numtxtActionPerformed(evt);
            }
        });
        getContentPane().add(numtxt);
        numtxt.setBounds(330, 370, 30, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("เพิมจำนวนสินค้า");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 370, 90, 30);

        pIdtxt.setEditable(false);
        pIdtxt.setEnabled(false);
        getContentPane().add(pIdtxt);
        pIdtxt.setBounds(40, 20, 80, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
       dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void numtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numtxtActionPerformed

    private void plusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusbtnActionPerformed
        ProductDetailService.increaseNumofProduct();
    }//GEN-LAST:event_plusbtnActionPerformed

    private void minusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusbtnActionPerformed
        ProductDetailService.decreaseNumofProduct();
    }//GEN-LAST:event_minusbtnActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        ProductDetailService.addProductToCart();
        ProductDetailService.showComfirmProductToCart();
//        ProductDetailService.addCartToDB();
        setVisible(false);
        
    }//GEN-LAST:event_addtocartActionPerformed

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
            java.util.logging.Logger.getLogger(ProductDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductDetailFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductDetailFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtocart;
    private javax.swing.JButton backbtn;
    public static javax.swing.JLabel bandtxt;
    public static javax.swing.JLabel colortxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JButton minusbtn;
    public static javax.swing.JLabel nameproduct;
    public static javax.swing.JTextField numtxt;
    public static javax.swing.JTextField pIdtxt;
    public static javax.swing.JLabel pic1;
    public static javax.swing.JButton plusbtn;
    public static javax.swing.JLabel pricetxt;
    public static javax.swing.JLabel sizetxt;
    // End of variables declaration//GEN-END:variables
}
