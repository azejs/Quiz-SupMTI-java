
package Quiz;

import javax.swing.JOptionPane;

public class administratorLogin extends javax.swing.JFrame {

    /**
     * st le constructeur qui initialise 
     * l'interface graphique et la rend non redimensionnable.
     */

    public administratorLogin() {
        /*
        La fonction initComponents() est une fonction autogénérée
        par l'interface utilisateur graphique (GUI) et est utilisée
        pour initialiser tous les composants de l'interface
        */
        initComponents();
        setResizable(false);
    }

    /**
     
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel1.setText("Administrateur:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 100, 90, 30);

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        getContentPane().add(userName);
        userName.setBounds(240, 130, 190, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("Mot de passe :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 160, 90, 30);
        getContentPane().add(password);
        password.setBounds(240, 190, 190, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/sconnecter.jpg"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(250, 220, 180, 60);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(30, 360, 120, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(230, 280, 220, 50);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 0, 180, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/entrer.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-20, 0, 660, 440);
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(655, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /*
    *La fonction userNameActionPerformed() est appelée lorsque l'utilisateur appuie 
    *sur la touche Entrée après avoir entré son nom d'utilisateur.
    */
    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameActionPerformed
/*
    La fonction backMouseClicked() est appelée lorsque 
    l'utilisateur clique sur l'icône "Précédent"
    pour revenir à la page de connexion principale.
    */
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        signIn s = new signIn();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked
/*
    est appelée lorsque l'utilisateur clique sur le bouton "Se connecter" 
    pour se connecter à l'interface d'administration.
    */
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        String uname = userName.getText();
        String pass = password.getText();

        if (uname.equals("admin")&pass.equals("admin123")){

            admin ad = new admin();
            ad.setVisible(true);
            dispose();
        }else {
            admin ad = new admin();
            JOptionPane.showMessageDialog(ad,"Invalid Email or Password");
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    /**
     * @param args the command line arguments
     */
    /*
    La fonction main() est la fonction principale 
    du programme qui est appelée en premier. 
    Il définit l'apparence de l'interface utilisateur et appelle la fonction 
    administratorLogin() pour créer l'interface utilisateur.
    */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(administratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administratorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administratorLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
