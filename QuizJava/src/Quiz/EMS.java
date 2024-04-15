/*
Cette ligne déclare le nom du package.
*/
package Quiz;

//Cette ligne déclare le nom de classe "EMS" qui étend la classe JFrame fournie par Java Swing
public class EMS extends javax.swing.JFrame {

   /*
    C'est le constructeur de la classe. Il initialise les composants de l'interface graphique à l'aide de la méthode 
    initComponents() et définit la fenêtre pour qu'elle ne soit pas redimensionnable
    */
    public EMS() {
        initComponents();
        setResizable(false);


    }

  
    @SuppressWarnings("unchecked")
   /*
    Cette méthode initialise tous les composants de l'interface graphique,
    y compris les étiquettes, les boutons et les séparateurs. Il est généré
    par l'IDE NetBeans et n'est pas destiné à être modifié manuellement.
    */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("en Ligne");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 110, 200, 70);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setText("Quiz");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(370, 110, 130, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/entrer.png"))); // NOI18N
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 250, 130, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(400, 190, 270, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenue");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(430, 210, 220, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 0, 170, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/mm.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 690, 450);

        setSize(new java.awt.Dimension(704, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded
        

    }//GEN-LAST:event_jLabel7AncestorAdded

    /*
    Ces méthodes sont des gestionnaires d'événements pour le bouton "entrer".
    Ils sont appelés lorsque l'utilisateur clique sur le bouton ou lorsque le 
    bouton est ajouté à l'interface graphique. La méthode mouseClicked() crée 
    un nouvel objet signIn, le définit comme visible et supprime la fenêtre actuelle.
    */
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
         signIn s = new signIn();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    /*
    C'est la méthode principale du programme. Il définit l'apparence de l'application 
    sur Nimbus, qui est une apparence Java Swing qui fournit une interface moderne et propre.
    Il crée ensuite une nouvelle instance de la classe EMS et la définit sur visible.
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
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EMS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EMS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
