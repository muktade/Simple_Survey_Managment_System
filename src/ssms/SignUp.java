/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ssms;

import employeepayrollsystem.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.Timer;

/**
 *
 * @author Elite-Gadget
 */
public class SignUp extends javax.swing.JFrame {

    Connection con = null;

    /**
     * Creates new form NewJFrame
     */
    public SignUp(Connection con) {
        initComponents();
        this.con = con;
        dateCreate();
        openCenter();

    }

    void openCenter() {
        
//        setDefaultCloseOperation(0);
        setLocationRelativeTo(null);
    }

    void dateCreate() {
        Calendar cld = new GregorianCalendar();
        int date = cld.get(Calendar.DAY_OF_MONTH);
        int month = cld.get(Calendar.MONTH);
        int year = cld.get(Calendar.YEAR);

        ////time 
        int sc = cld.get(Calendar.SECOND);
        int mnt = cld.get(Calendar.MINUTE);
        int hr = cld.get(Calendar.HOUR);
        txtDate.setText(date + "/" + (month + 1) + "/" + year + "  |  " + hr + ":" + mnt + ":" + sc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        jPanelErrorMass = new javax.swing.JPanel();
        jLabelUp = new javax.swing.JLabel();
        txt_msg = new javax.swing.JLabel();
        txt_userName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_pass1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 73, 73));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/X.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("employeepayrollsystem/Bundle"); // NOI18N
        jLabel4.setText(bundle.getString("Login.jLabel4.text")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        txtDate.setText(bundle.getString("Login.txtDate.text")); // NOI18N

        jPanel2.setBackground(new java.awt.Color(68, 108, 178));

        jLabel1.setBackground(new java.awt.Color(65, 131, 215));
        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(138, 2, 11));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(bundle.getString("Login.jLabel1.text")); // NOI18N
        jLabel1.setOpaque(true);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user.png"))); // NOI18N
        jLabel2.setText(bundle.getString("Login.jLabel2.text")); // NOI18N

        txt_userName.setBackground(new java.awt.Color(153, 153, 153));
        txt_userName.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_userName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_userName.setText(bundle.getString("Login.txt_userName.text")); // NOI18N
        txt_userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_userNameKeyReleased(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jLabel3.setText(bundle.getString("Login.jLabel3.text")); // NOI18N

        btnLogin.setBackground(new java.awt.Color(1, 152, 115));
        btnLogin.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText(bundle.getString("Login.btnLogin.text")); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(1, 152, 115));
        btnSignUp.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText(bundle.getString("Login.btnSignUp.text")); // NOI18N
        btnSignUp.setActionCommand(bundle.getString("Login.btnSignUp.actionCommand")); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txt_pass.setBackground(new java.awt.Color(153, 153, 153));
        txt_pass.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setText(bundle.getString("Login.txt_pass.text")); // NOI18N
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passKeyReleased(evt);
            }
        });

        jPanelErrorMass.setBackground(new java.awt.Color(204, 0, 0));
        jPanelErrorMass.setPreferredSize(new java.awt.Dimension(69, 100));

        jLabelUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/up.png"))); // NOI18N
        jLabelUp.setText(bundle.getString("Login.jLabelUp.text")); // NOI18N
        jLabelUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUpMouseClicked(evt);
            }
        });

        txt_msg.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txt_msg.setForeground(new java.awt.Color(255, 255, 255));
        txt_msg.setText(bundle.getString("Login.txt_msg.text")); // NOI18N

        javax.swing.GroupLayout jPanelErrorMassLayout = new javax.swing.GroupLayout(jPanelErrorMass);
        jPanelErrorMass.setLayout(jPanelErrorMassLayout);
        jPanelErrorMassLayout.setHorizontalGroup(
            jPanelErrorMassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelErrorMassLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelUp)
                .addContainerGap())
            .addGroup(jPanelErrorMassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_msg)
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanelErrorMassLayout.setVerticalGroup(
            jPanelErrorMassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelErrorMassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_msg)
                .addContainerGap())
        );

        txt_userName1.setBackground(new java.awt.Color(153, 153, 153));
        txt_userName1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_userName1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_userName1.setText(bundle.getString("Login.txt_userName.text")); // NOI18N
        txt_userName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_userName1KeyReleased(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/paper-clip-2-16.png"))); // NOI18N
        jLabel5.setText(bundle.getString("Login.jLabel2.text")); // NOI18N

        txt_pass1.setBackground(new java.awt.Color(153, 153, 153));
        txt_pass1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txt_pass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass1.setText(bundle.getString("Login.txt_pass.text")); // NOI18N
        txt_pass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_pass1KeyReleased(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lock.png"))); // NOI18N
        jLabel6.setText(bundle.getString("Login.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelErrorMass, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_userName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelErrorMass, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_pass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_pass1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pass1KeyReleased

    private void txt_userName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userName1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userName1KeyReleased

    private void jLabelUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpMouseClicked
        // TODO add your handling code here:
        timerUp.start();
    }//GEN-LAST:event_jLabelUpMouseClicked

    private void txt_passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyReleased
        // TODO add your handling code here:
        //        valid();
    }//GEN-LAST:event_txt_passKeyReleased

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Sign up");
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txt_userNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userNameKeyReleased
        // TODO add your handling code here:
        //        valid();
    }//GEN-LAST:event_txt_userNameKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    ///mathod for show error message
    Timer timerUp = new Timer(30, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (jPanelErrorMass.getHeight() > 0) {
                jPanelErrorMass.setBounds(jPanelErrorMass.getX(), jPanelErrorMass.getY(), jPanelErrorMass.getWidth(), jPanelErrorMass.getHeight() - 5);
            } else {
                timerUp.stop();
            }
        }
    });
    ///for show Error message

    Timer timerDown = new Timer(30, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (jPanelErrorMass.getHeight() != 100) {
                jPanelErrorMass.setBounds(jPanelErrorMass.getX(), jPanelErrorMass.getY(), jPanelErrorMass.getWidth(), jPanelErrorMass.getHeight() + 5);
            } else {
                timerDown.stop();
            }
        }
    });

    public static void main(String[] args) {
        new SignUp(null).setVisible(true);
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelErrorMass;
    private javax.swing.JLabel txtDate;
    private javax.swing.JLabel txt_msg;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_pass1;
    private javax.swing.JTextField txt_userName;
    private javax.swing.JTextField txt_userName1;
    // End of variables declaration//GEN-END:variables
}
