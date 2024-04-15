package Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class verification extends javax.swing.JFrame {

    /**
     *  Ceci est le constructeur de la classe verification et il 
     * initialise les composants de l'interface graphique de l'application, appelle les fonctions 
     */
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public verification() {
        initComponents();
        setResizable(false);
        comboBox();
        showTableData();
    }
    
    /*
     Cette fonction récupère toutes les données à partir de la table "test" dans la base de données, 
    puis crée un modèle de table par défaut pour afficher ces données dans le tableau jTable1.
    */
    public void showTableData(){
        try {
           con = myConnection.getConnection();
           PreparedStatement ps = con.prepareStatement("SELECT * FROM test");
           ResultSet rs = ps.executeQuery();
           //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           DefaultTableModel tm = (DefaultTableModel)jTable1.getModel();
           tm.setRowCount(0);
           
           while(rs.next())
           {
               Object o[] = {rs.getString("COMPTE"),rs.getString("MOTPASSE"),rs.getString("NOM"),
                       rs.getString("PRENOM"),rs.getString("NIVEAU"),rs.getString("SUJET")};
               tm.addRow(o);   
           }
        }catch (Exception e) {
           JOptionPane.showMessageDialog(this, e);
        }
    }
    /*
    Cette fonction récupère toutes les données à partir de la table "test" dans la base de 
    données, puis ajoute tous les noms de la colonne "NOM" à la liste déroulante 
    */
    private void comboBox(){
        try{
            con = myConnection.getConnection();
            String sql = "SELECT * FROM test";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String name = rs.getString("NOM");
                veri.addItem(name);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        veri = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        delete1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        veri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veriActionPerformed(evt);
            }
        });
        getContentPane().add(veri);
        veri.setBounds(20, 130, 170, 30);

        jTable1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Compte", "mot de passe", "Nom", "Prénom", "Niveau ", "Sujet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 730, 250);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("Selectionner:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 90, 110, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(290, 80, 220, 80);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Utilisateurs");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 10, 250, 80);

        delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/sup.png"))); // NOI18N
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });
        getContentPane().add(delete1);
        delete1.setBounds(110, 420, 120, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(0, 420, 120, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/result.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 870, 490);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 0, 180, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 820, 60);

        setSize(new java.awt.Dimension(770, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void veriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veriActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_veriActionPerformed

    
    /*
    Cette fonction est appelée lorsque l'utilisateur clique
    sur l'icône "Supprimer" sur l'interface graphique de l'application. 
    Elle récupère le nom sélectionné dans la liste déroulante veri et exécute
    une requête pour supprimer toutes les données 
    correspondantes à ce nom à partir de la table "test" dans la base de données.
    */
    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        // TODO add your handling code here:
        try{
            con = myConnection.getConnection();
            String sql = "DELETE FROM `test` WHERE `NOM` = ?";
       
            ps = con.prepareStatement(sql);
            ps.setString(1, veri.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Deleted successfully");
            int index=veri.getSelectedIndex();
            veri.removeItemAt(index);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
           showTableData();
    }//GEN-LAST:event_delete1MouseClicked
/*
    Cette fonction est appelée lorsque l'utilisateur clique sur l'icône 
    "precedent" sur l'interface graphique de l'application.
    Elle ferme la fenêtre de vérification et retourne à la fenêtre précédente.
    */
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        
        admin a = new admin();
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verification.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verification().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel delete1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JComboBox<String> veri;
    // End of variables declaration//GEN-END:variables

  
}
