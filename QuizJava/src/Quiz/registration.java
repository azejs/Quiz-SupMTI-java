
package Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

 
public class registration extends javax.swing.JFrame {

    
 /*
    le constrcuteur initialise cette fonction "initComponents()" est générée automatiquement par l'IDE NetBeans
    et contient le code qui crée les éléments de l'interface graphique
    */

    public registration() {
        initComponents();
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        password1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        username1 = new javax.swing.JTextField();
        fname1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        submit1 = new javax.swing.JLabel();
        course1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        yearLevel1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        reset1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel1.setText("Mot de passe:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 100, 100, 30);

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        getContentPane().add(password1);
        password1.setBounds(260, 130, 170, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("Utilisateur:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 90, 30);

        username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username1ActionPerformed(evt);
            }
        });
        getContentPane().add(username1);
        username1.setBounds(30, 130, 170, 30);

        fname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname1ActionPerformed(evt);
            }
        });
        getContentPane().add(fname1);
        fname1.setBounds(260, 200, 170, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("Nom:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(260, 170, 80, 30);

        lname1.setName(""); // NOI18N
        lname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lname1ActionPerformed(evt);
            }
        });
        getContentPane().add(lname1);
        lname1.setBounds(30, 200, 170, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("Sujet:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 240, 70, 30);

        submit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/ajouter.png"))); // NOI18N
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });
        getContentPane().add(submit1);
        submit1.setBounds(250, 340, 130, 40);

        course1.setName(""); // NOI18N
        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });
        getContentPane().add(course1);
        course1.setBounds(30, 270, 170, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel11.setText("Niveau d'etude:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 240, 130, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 400, 140, 50);

        yearLevel1.setName(""); // NOI18N
        yearLevel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearLevel1ActionPerformed(evt);
            }
        });
        getContentPane().add(yearLevel1);
        yearLevel1.setBounds(260, 270, 170, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jLabel12.setText("Prénom:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 170, 90, 30);

        reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/vid.png"))); // NOI18N
        reset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset1MouseClicked(evt);
            }
        });
        getContentPane().add(reset1);
        reset1.setBounds(120, 340, 120, 40);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Inscription");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 60, 210, 40);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(200, 100, 230, 70);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 0, 180, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/admin.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 490);

        setSize(new java.awt.Dimension(663, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
    ces fonctions sont appelées lorsqu'un événement
    "action" se produit sur le champ de saisie  .
    */
    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username1ActionPerformed

    private void fname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname1ActionPerformed

    private void lname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lname1ActionPerformed

    private void yearLevel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearLevel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearLevel1ActionPerformed

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course1ActionPerformed
/*
    tte fonction est appelée lorsqu'un clic de souris est détecté sur le bouton d'inscription. 
    Elle récupère les informations saisies dans les champs et les stocke dans une base de données.
    */
    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
                 String username = username1.getText().trim();
    String password = new String(password1.getPassword());
    String lname = lname1.getText().trim();
    String fname = fname1.getText().trim();
    String course = course1.getText().trim();
    String yearLevel = yearLevel1.getText().trim();
    try (
          Connection con = myConnection.getConnection();
         PreparedStatement ps = con.prepareStatement("INSERT INTO `test`(`COMPTE`, `MOTPASSE`, `NOM`, `PRENOM`, `NIVEAU`, `SUJET`) VALUES (?, ?, ?, ?, ?, ?)");
         PreparedStatement ps2 = con.prepareStatement("INSERT INTO `user`(`COMPTE`, `NOM`, `PRENOM`) VALUES (?, ?, ?)")
    ) {
        ps.setString(1, username);
        ps.setString(2, password);
        ps.setString(3, lname);
        ps.setString(4, fname);
        ps.setString(5, yearLevel);
        ps.setString(6, course);
        ps.executeUpdate();

        ps2.setString(1, username);
        ps2.setString(2, lname);
        ps2.setString(3, fname);
        ps2.executeUpdate();

        JOptionPane.showMessageDialog(null, "Vous vous êtes bien inscrit.");
        studentLogin s = new studentLogin();
        s.setVisible(true);
        this.dispose();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Le nom d'utilisateur existe déjà.");
        JOptionPane.showMessageDialog(null, "Erreur est survenue" + ex.getMessage());
    }

    }//GEN-LAST:event_submit1MouseClicked
/*
    cette fonction est appelée pour vider les champs 
    */
    private void reset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset1MouseClicked
        // TODO add your handling code here:
        username1.setText("");
        password1.setText("");
        lname1.setText("");
        fname1.setText("");
        yearLevel1.setText("");
        course1.setText("");
        //blockNo1.setText("");

    }//GEN-LAST:event_reset1MouseClicked
/*
     cette fonction est appelée lorsqu'un clic de souris est détecté sur le bouton de retour. 
    Elle ferme la fenêtre d'inscription et retourne à la fenêtre précédente.
    */
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        studentLogin s = new studentLogin();
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
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField course1;
    private javax.swing.JTextField fname1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField lname1;
    private javax.swing.JPasswordField password1;
    private javax.swing.JLabel reset1;
    private javax.swing.JLabel submit1;
    public static javax.swing.JTextField username1;
    private javax.swing.JTextField yearLevel1;
    // End of variables declaration//GEN-END:variables

}
