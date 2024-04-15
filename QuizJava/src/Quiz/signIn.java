 
package Quiz;

 // class signIn
public class signIn extends javax.swing.JFrame {

  /*
    Le constructeur "signIn" initialise la GUI en appelant la méthode "initComponents" qui 
    est générée automatiquement. Il désactive également la possibilité de redimensionner la fenêtre
    */
    public signIn() {
        initComponents();
        setResizable(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        student = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        back = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, -40, 260, 160);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 580, 60);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 60, 60);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 20)); // NOI18N
        jLabel3.setText("qui êtes-vous ?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 90, 170, 40);

        student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/etudiant.png"))); // NOI18N
        student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentMouseClicked(evt);
            }
        });
        getContentPane().add(student);
        student.setBounds(160, 170, 170, 50);

        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/pro.png"))); // NOI18N
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        getContentPane().add(admin);
        admin.setBounds(160, 230, 170, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(90, 140, 200, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(10, 320, 140, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/vvv.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-70, 60, 710, 410);

        setSize(new java.awt.Dimension(589, 471));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
    Les méthodes initComponents(), backMouseClicked(), studentMouseClicked() et adminMouseClicked() sont 
    toutes des méthodes générées automatiquement lors de la conception de l'interface graphique.
    */
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // on a instacié un objet de la class EMS pour retourner l'interface prérécedent
        EMS s = new EMS();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentMouseClicked
        // on a instacié un objet de la class student  pour connecter à l'utilisateur simple
        studentLogin s = new studentLogin();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentMouseClicked

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        /*
        on a instacié un objet de la class admin ou professeur   pour connecter avec un compte
        admin pour le gestion de l'application de controle total
        */
        
        administratorLogin s = new administratorLogin();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adminMouseClicked
/*
    La méthode "main" est la méthode principale de l'application. 
    Elle instancie la classe "signIn" et affiche la fenêtre à l'aide de la méthode "setVisible".
    */
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
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel student;
    // End of variables declaration//GEN-END:variables

    void Visible(boolean b) {
        throw new UnsupportedOperationException(" Pas encore pris en charge."); //To change body of generated methods, choose Tools | Templates.
    }
}
