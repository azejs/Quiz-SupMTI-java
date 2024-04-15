 
package Quiz;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class resultTest extends javax.swing.JFrame {

   
    Connection con = null;
    PreparedStatement PST= null;
    int sc = 0;
  
    public resultTest() {
        initComponents();
        setResizable(false);
        try {
            /*
           il doit instancier un objet de la class myConnection 
            en utlisant  pour se connecter à la base de données

            */
           con = myConnection.getConnection();
           /*
           pour exécuter une requête SELECT pour obtenir les résultats de l'utilisateur et les afficher dans un JTable.
           */
           PreparedStatement ps = con.prepareStatement("SELECT * FROM compare");
           ResultSet rs = ps.executeQuery();
           DefaultTableModel tm = (DefaultTableModel)Table1.getModel();
           tm.setRowCount(0);
           
           while(rs.next())
           {
               Object o[] = {rs.getString("Nu"),rs.getString("Valeur")};
               tm.addRow(o);   
           }
        }catch (Exception e) {
           JOptionPane.showMessageDialog(this, e);
        }
        /*
        Ensuite, le code calcule le score total en parcourant 
        le JTable et en comptant le nombre de réponses correctes. Le score est stocké
        dans une variable 'sc'. Le score est affiché sur l'interface utilisateur dans un JLabel.
        */
        int count = Table1.getRowCount();
        
        for(int i = 0; i< count; i++){
            String cor = String.valueOf(Table1.getValueAt(i, 1));
            if("CORRECT".equals(cor)){
            sc++;  
        }    
        }note.setText(String.valueOf(sc));
    /*
        La méthode try-catch est utilisée pour se connecter à la base
        de données, mettre à jour la colonne 'NOTE' dans la table 
        'user' avec la note de l'utilisateur et afficher un message 
        d'erreur si une exception est levée.
        */
        try{
            con = myConnection.getConnection();
            String submitQuery = "UPDATE `user` SET `NOTE` = ? WHERE NOTE IS NULL";
            String scr = note.getText();
            System.out.println("scr "+scr);
            PST = con.prepareStatement(submitQuery);
            PST.setString(1, scr);
            PST.executeUpdate();
        }catch (Exception ex){
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        note = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Result");
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(160, 140, 190, 20);

        Table1.setBackground(new java.awt.Color(204, 204, 255));
        Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Questions", "Réponses"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 160, 220, 170);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Résultat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 90, 190, 48);

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/decon.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(180, 410, 132, 43);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel1.setText("La note finale:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 330, 130, 50);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(20, 0, 180, 80);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 610, 60);

        note.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        note.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        note.setText("00");
        note.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        note.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                noteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(note);
        note.setBounds(180, 330, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/quiz.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-70, -10, 700, 540);

        setSize(new java.awt.Dimension(591, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void noteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_noteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_noteAncestorAdded

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        signIn s = new signIn();
        s.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_logoutMouseClicked
/*
    Le reste du code est l'interface utilisateur 
    graphique, qui affiche les résultats du quiz dans 
    un JTable et le score final dans un JLabel.
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
            java.util.logging.Logger.getLogger(resultTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resultTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resultTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resultTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resultTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel note;
    // End of variables declaration//GEN-END:variables
}
