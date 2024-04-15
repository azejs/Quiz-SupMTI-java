/*
classe  "admin" qui étend JFrame et qui est responsable 
de l'affichage de la page d'accueil de l'administrateur.
L'interface graphique comprend quatre boutons : "Utilisateurs", 
"Résultats", "Gestion" et "Déconnexion". Lorsque l'un de ces 
boutons est cliqué, une méthode associée est appelée pour effectuer une action.
 */
package Quiz;

import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class admin extends javax.swing.JFrame {

    /**
  le constructeur a initialise la methode initComponents() tous les composants 
  * de l'interface graphique 
     */
    public admin() {
        initComponents();
        setResizable(false);
    }

    /**
        le constructeur a initialisé le formulaire.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        ER = new javax.swing.JLabel();
        Users = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ME = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(200, 160, 170, 20);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Administrateur");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 110, 270, 60);

        ER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/resultat.png"))); // NOI18N
        ER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ERMouseClicked(evt);
            }
        });
        getContentPane().add(ER);
        ER.setBounds(220, 220, 210, 60);

        Users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/uers.png"))); // NOI18N
        Users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersMouseClicked(evt);
            }
        });
        getContentPane().add(Users);
        Users.setBounds(220, 180, 190, 60);

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/decon.png"))); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout);
        Logout.setBounds(510, 0, 124, 50);

        ME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/mangement.png"))); // NOI18N
        ME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEMouseClicked(evt);
            }
        });
        getContentPane().add(ME);
        ME.setBounds(220, 260, 200, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -40, 250, 160);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/admin.jpg"))); // NOI18N
        jLabel4.setText(" ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, 0, 640, 480);

        setSize(new java.awt.Dimension(645, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
    cette méthode est appelée lorsque le bouton "Utilisateurs" est cliqué. 
    Elle crée une instance de la classe "verification" et ouvre la fenêtre associée.
    Cette méthode est appelée lorsque le bouton "Utilisateurs" est cliqué.
    */
    private void UsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersMouseClicked
        // TODO add your handling code here:
        verification s = new verification();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsersMouseClicked
/*
    cette méthode est appelée lorsque le bouton "Résultats" est cliqué.
    Elle crée une instance de la classe "examResults" et ouvre la fenêtre associée.
    */
    private void ERMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ERMouseClicked
        // TODO add your handling code here:
        examResults er = new examResults();
        er.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ERMouseClicked
/*
    cette méthode est appelée lorsque le bouton "Gestion" est cliqué. 
    Elle crée une instance de la classe "manage" et ouvre la fenêtre associée.
    */
    private void MEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEMouseClicked
        // TODO add your handling code here:
        manage m = new manage();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MEMouseClicked
/*
    cette méthode est appelée lorsque le bouton "Déconnexion" est cliqué. 
    Elle crée une instance de la classe "administratorLogin" et ouvre
    la fenêtre associée. Cette méthode affiche également un message de confirmation 
    */
    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        administratorLogin s = new administratorLogin();
        s.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Déconnexion réussie");
    }//GEN-LAST:event_LogoutMouseClicked

    /**
     * @param args the command line arguments
     */
    /*
    cette méthode est la méthode principale de la classe. 
    Elle initialise l'interface graphique en appelant la méthode initComponents().
    */
    public static void main(String args[]) {
      /*
          http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
        */
    
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Créer et afficher le formulaire */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ER;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel ME;
    private javax.swing.JLabel Users;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
