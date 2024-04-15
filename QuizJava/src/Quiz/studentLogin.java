
package Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Students
 */
public class studentLogin extends javax.swing.JFrame {

     Connection con = null;
    /**
      // constructeur de l'interface utilisateur studentLogin
     */
    public studentLogin() {
        initComponents();
        setResizable(false);
       // this.setLocationRelativeTo(null);
        
        
    }

    /**
    / cette méthode est appelée à partir du constructeur 
    * pour initialiser l'interface utilisateur
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        usernameS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clickHere = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordS = new javax.swing.JPasswordField();
        Submit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setText("Utilisateur");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(370, 60, 170, 40);

        usernameS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usernameS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameSActionPerformed(evt);
            }
        });
        getContentPane().add(usernameS);
        usernameS.setBounds(340, 150, 190, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel1.setText("Compte :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 120, 80, 30);

        clickHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/suivant.png"))); // NOI18N
        clickHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickHereMouseClicked(evt);
            }
        });
        getContentPane().add(clickHere);
        clickHere.setBounds(320, 320, 220, 40);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText("Mot de  passe :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 180, 80, 30);

        passwordS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordSActionPerformed(evt);
            }
        });
        getContentPane().add(passwordS);
        passwordS.setBounds(340, 210, 190, 30);

        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/inscr.jpg"))); // NOI18N
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(340, 240, 190, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(350, 100, 180, 20);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel2.setText("Cliquez sur Créer un compte.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 280, 200, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 330, 124, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, -20, 180, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/entrer.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 30, 590, 394);

        setSize(new java.awt.Dimension(607, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameSActionPerformed

    private void passwordSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordSActionPerformed

    /*
    est appelée lorsqu'un utilisateur clique sur 
    le bouton "Soumettre" dans l'interface utilisateur. 
    Les variables uname et pass contiennent respectivement 
    le nom d'utilisateur et le mot de passe entrés par l'utilisateur.
    */
    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        // TODO add your handling code here:
        PreparedStatement ps;
        ResultSet rs;
        String uname = usernameS.getText();
        String pass = String.valueOf(passwordS.getPassword());
        
       
        
        try {
            /*
            La fonction tente ensuite de se 
            connecter à la base de données en
            appelant myConnection.getConnection(). 
            Si la connexion est réussie, elle exécute
            une requête SQL pour sélectionner les données 
            de la table test correspondant au nom d'utilisateur 
            et au mot de passe entrés.
            */
            con = myConnection.getConnection();
             String query = "SELECT * FROM `test` WHERE `COMPTE`=? AND `MOTPASSE` =?";
            ps = con.prepareStatement(query);
            
            ps.setString(1, uname);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                student s = new student();
                s.setVisible(true);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null,"Erreur de connexion Nom d'utilisateur et mot de passe invalide");
            }
        } catch (SQLException ex) {
            Logger.getLogger(studentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitMouseClicked

    private void clickHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickHereMouseClicked
        // TODO add your handling code here:
        registration r = new registration();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clickHereMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        signIn s = new signIn();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Submit;
    private javax.swing.JLabel back;
    public javax.swing.JLabel clickHere;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField passwordS;
    private javax.swing.JTextField usernameS;
    // End of variables declaration//GEN-END:variables
}
