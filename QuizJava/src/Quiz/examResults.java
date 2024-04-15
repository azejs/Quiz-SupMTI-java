 
package Quiz;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 
import javax.swing.JOptionPane;
 
import javax.swing.table.DefaultTableModel;
 

 
public class examResults extends javax.swing.JFrame {


      Connection con = null;
    /**
     Constructeur qui initialise les composants de
     * l'interface graphique et récupère les données 
     * de la base de données pour remplir la table.
     */
    public examResults() {
        initComponents();
        setResizable(false);
        try {
            con = myConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user");
            ResultSet rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel) Table1.getModel();
            tm.setRowCount(0);

            while (rs.next()) {

                Object o[] = {rs.getString("COMPTE"), rs.getString("NOM"), rs.getString("PRENOM"), rs.getString("NOTE")};
                tm.addRow(o);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    /*
    Cette méthode est appelée depuis le constructeur pour initialiser le formulaire.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exam Result");
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Resulats");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 70, 260, 60);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(140, 130, 280, 10);

        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Compte", "Nom", "Prénom", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);
        if (Table1.getColumnModel().getColumnCount() > 0) {
            Table1.getColumnModel().getColumn(0).setResizable(false);
            Table1.getColumnModel().getColumn(1).setResizable(false);
            Table1.getColumnModel().getColumn(2).setResizable(false);
            Table1.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 452, 210);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 380, 130, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, -40, 260, 160);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/result.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-70, 0, 760, 470);

        setSize(new java.awt.Dimension(696, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
    backMouseClicked(): gestionnaire d'événements qui ouvre 
    le panneau d'administration lorsque l'utilisateur clique sur le bouton "retour".
    */
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        admin s = new admin();
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
            java.util.logging.Logger.getLogger(examResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
        creation et l'afichage de l'interface 
        */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
