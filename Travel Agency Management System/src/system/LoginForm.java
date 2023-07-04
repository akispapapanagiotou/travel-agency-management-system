package system;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
    
    public LoginForm() {
        initComponents();
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                handleAppClosing();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginFormPanel2 = new javax.swing.JPanel();
        loginFormPanel1 = new javax.swing.JPanel();
        loginFormLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        resetButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form | Travel Agency Management System");
        setResizable(false);

        loginFormPanel2.setBackground(new java.awt.Color(45, 62, 80));

        loginFormPanel1.setBackground(new java.awt.Color(255, 106, 53));

        loginFormLabel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        loginFormLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginFormLabel.setText("Login Form");

        javax.swing.GroupLayout loginFormPanel1Layout = new javax.swing.GroupLayout(loginFormPanel1);
        loginFormPanel1.setLayout(loginFormPanel1Layout);
        loginFormPanel1Layout.setHorizontalGroup(
            loginFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanel1Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(loginFormLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginFormPanel1Layout.setVerticalGroup(
            loginFormPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(loginFormLabel)
                .addGap(18, 18, 18))
        );

        usernameLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Password:");

        usernameField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(0, 0, 0));

        resetButton.setBackground(new java.awt.Color(254, 57, 40));
        resetButton.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(56, 187, 254));
        loginButton.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout loginFormPanel2Layout = new javax.swing.GroupLayout(loginFormPanel2);
        loginFormPanel2.setLayout(loginFormPanel2Layout);
        loginFormPanel2Layout.setHorizontalGroup(
            loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginFormPanel2Layout.createSequentialGroup()
                .addGroup(loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFormPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginFormPanel2Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        loginFormPanel2Layout.setVerticalGroup(
            loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormPanel2Layout.createSequentialGroup()
                .addComponent(loginFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameLabel)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(47, 47, 47)
                .addGroup(loginFormPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(loginButton))
                .addGap(0, 105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        usernameField.setText("");
        passwordField.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if (username.isEmpty() || password.isEmpty())
            JOptionPane.showMessageDialog(this, "Username / Password field must not be empty!", "Error", JOptionPane.ERROR_MESSAGE);
        else {
            if (username.length() > 20 || password.length() > 10) {
                JOptionPane.showMessageDialog(this, "The Username / Password you entered is wrong!", "Error", JOptionPane.ERROR_MESSAGE);
                usernameField.setText("");
                passwordField.setText("");
            }
            else
                userLogin(username, password);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginFormLabel;
    private javax.swing.JPanel loginFormPanel1;
    private javax.swing.JPanel loginFormPanel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    public void userLogin(String username, String password) {
        String sql = "{CALL get_IT_manager(?, ?)}";
        
        try {
            CallableStatement getITManager = DBConnection.getInstance().getConnection().prepareCall(sql);
            getITManager.setString(1, username);
            getITManager.setString(2, password);
            ResultSet result = getITManager.executeQuery();
            
            if (result.next()){ 
                setITManagerActive(username);
                dispose();
                Dashboard dashboard = new Dashboard();
                dashboard.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "The Username / Password you entered is wrong!", "Error", JOptionPane.ERROR_MESSAGE);
                usernameField.setText("");
                passwordField.setText("");
            }
             if (result!=null) {
                result.close();
            }   
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void setITManagerActive(String username){
        String sql = "{CALL set_IT_manager_active(?)}";
        
         try {
            CallableStatement setITManagerActive = DBConnection.getInstance().getConnection().prepareCall(sql);
            setITManagerActive.setString(1, username);
            setITManagerActive.execute();
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void handleAppClosing() {
        String sql = "{CALL set_IT_managers_inactive()}";
        
         try {
            CallableStatement setITManagersInactive = DBConnection.getInstance().getConnection().prepareCall(sql);
            setITManagersInactive.execute();
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
         
        DBConnection.getInstance().closeConnection();
    }
}
