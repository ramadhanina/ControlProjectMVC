/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public static String user ;
    public static String StatusAktif;
    public login() {
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

        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        Btn_Exit = new javax.swing.JButton();
        Btn_SignIn1 = new javax.swing.JButton();
        Btn_SignUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(0, 0, 51));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack/view/admin.png"))); // NOI18N
        jPanel9.add(jLabel7);
        jLabel7.setBounds(10, 332, 103, 103);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel8.setText("Password");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(230, 150, 140, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel10.setText("Username");
        jPanel9.add(jLabel10);
        jLabel10.setBounds(230, 50, 140, 40);

        txtpassword.setBackground(new java.awt.Color(0, 0, 51));
        txtpassword.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel9.add(txtpassword);
        txtpassword.setBounds(160, 190, 260, 40);

        txtusername.setBackground(new java.awt.Color(0, 0, 51));
        txtusername.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel9.add(txtusername);
        txtusername.setBounds(160, 100, 260, 40);

        Btn_Exit.setBackground(new java.awt.Color(0, 0, 51));
        Btn_Exit.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Exit.setText("Exit");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });
        jPanel9.add(Btn_Exit);
        Btn_Exit.setBounds(300, 340, 120, 40);

        Btn_SignIn1.setBackground(new java.awt.Color(0, 0, 51));
        Btn_SignIn1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Btn_SignIn1.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SignIn1.setText("Sign In");
        Btn_SignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignIn1ActionPerformed(evt);
            }
        });
        jPanel9.add(Btn_SignIn1);
        Btn_SignIn1.setBounds(160, 290, 260, 40);

        Btn_SignUp.setBackground(new java.awt.Color(0, 0, 51));
        Btn_SignUp.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Btn_SignUp.setForeground(new java.awt.Color(255, 255, 255));
        Btn_SignUp.setText("Sign Up");
        Btn_SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SignUpActionPerformed(evt);
            }
        });
        jPanel9.add(Btn_SignUp);
        Btn_SignUp.setBounds(160, 340, 120, 40);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 0, 590, 490);

        setSize(new java.awt.Dimension(605, 527));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void Btn_SignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignIn1ActionPerformed

Connection connection;
PreparedStatement ps;
try {
connection = DriverManager.getConnection("jdbc:mysql://localhost/toko?zeroDateTimeBehavior=convertToNull", "root", "");
ps = connection.prepareStatement("SELECT * FROM `tb_akun` WHERE `username` = ? AND `password` = ?");
ps.setString(1, txtusername.getText());
ps.setString(2, txtpassword.getText());
ResultSet result =ps.executeQuery();
if(result.next()){
new home().show(); 
user = txtusername.getText();//perlu deklarasi user diclass utama.
this.dispose();
}
else{
JOptionPane.showMessageDialog(rootPane, "Salah!");
txtpass.setText("");

txtusername.requestFocus();
}
}catch (SQLException ex){
JOptionPane.showMessageDialog(rootPane,"Gagal!");
}
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SignIn1ActionPerformed

    private void Btn_SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SignUpActionPerformed
        String username = txtusername.getText();
        String password = txtpassword.getText();

        try {
            try (Statement statement = (Statement) file_koneksi.GetConnection().createStatement()) {
                statement.executeUpdate("insert into tb_akun(username, password) VALUES ('"+username+"','"+password+"');");
            }
            JOptionPane.showMessageDialog(null, "Selamat! Anda berhasil Sign Up!");
        } catch (Exception t) {
            JOptionPane.showMessageDialog(null, "Mohon maaf, ulangi lagi prosedur");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_SignUpActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JButton Btn_SignIn1;
    private javax.swing.JButton Btn_SignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtpass;
    private javax.swing.JTextField txtpass1;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
