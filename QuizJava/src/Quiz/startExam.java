
package Quiz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class startExam extends javax.swing.JFrame {

    
    Connection con = null;
    PreparedStatement PST = null;
    ResultSet RS = null;
    String no;
    String value;
    int hr, min, sec;
    Timer timer;
/*
     le constructeur qui initialise la fenêtre de quiz, 
    récupère la connexion à la base de données
    */
    public startExam() {
        initComponents();
        setResizable(false);
        showItem(pos);

        hour.setText("00");
        minute.setText("59");
        seconds.setText("59");
        hr = Integer.parseInt(hour.getText());
        min = Integer.parseInt(minute.getText());
        sec = Integer.parseInt(seconds.getText());

        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (sec == 0) {
                    sec = 60;
                    min--;
                }
                if (min == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Times Up", "Stopped", 0);
                    min = 0;
                    sec = 0;
                    timer.stop();
                    resultTest rt = new resultTest();
                    rt.setVisible(true);
                    // this.dispose();
                } else {

                    sec--;
                    seconds.setText("" + sec);
                    minute.setText("" + min);
                }
            }
        });
        timer.start();
    }

    int pos = 0;
/*
    récupère toutes les questions et options de la base de données 
    et les stocke dans une liste d'objets Item.
    */
    public List<Item> getItemsList() {
        try {
              con = myConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `questions` ORDER BY `question_id` ASC");
            List<Item> list = new ArrayList<Item>();
            Item item;
            while (rs.next()) {
                item = new Item(rs.getString("question_id"), rs.getString("QUESTION"),
                        rs.getString("A"), rs.getString("B"), rs.getString("C"), rs.getString("D"));
                list.add(item);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
/*
    affiche la question et les options actuelles à l'utilisateur.
    */
    public void showItem(int index) {
        Qnumber.setText(getItemsList().get(index).getNum());
        Qquestion.setText(getItemsList().get(index).getQues());
        Qa.setText(getItemsList().get(index).getA());
        Qb.setText(getItemsList().get(index).getB());
        Qc.setText(getItemsList().get(index).getC());
        Qd.setText(getItemsList().get(index).getD());

    }

    
    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        Qquestion = new javax.swing.JLabel();
        Qnumber = new javax.swing.JLabel();
        Qa = new javax.swing.JRadioButton();
        Qd = new javax.swing.JRadioButton();
        Qb = new javax.swing.JRadioButton();
        Qc = new javax.swing.JRadioButton();
        next1 = new javax.swing.JLabel();
        previous1 = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();
        hour = new javax.swing.JLabel();
        timer2 = new javax.swing.JLabel();
        timer3 = new javax.swing.JLabel();
        submit1 = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        Qquestion.setBackground(new java.awt.Color(255, 255, 255));
        Qquestion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        Qquestion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane2.setViewportView(Qquestion);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(70, 90, 500, 90);

        Qnumber.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        Qnumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Qnumber);
        Qnumber.setBounds(10, 90, 40, 40);

        btn.add(Qa);
        Qa.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Qa.setText("jRadioButton1");
        Qa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QaActionPerformed(evt);
            }
        });
        getContentPane().add(Qa);
        Qa.setBounds(30, 240, 240, 40);

        btn.add(Qd);
        Qd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Qd.setText("jRadioButton1");
        Qd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QdActionPerformed(evt);
            }
        });
        getContentPane().add(Qd);
        Qd.setBounds(320, 320, 240, 40);

        btn.add(Qb);
        Qb.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Qb.setText("jRadioButton1");
        Qb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QbActionPerformed(evt);
            }
        });
        getContentPane().add(Qb);
        Qb.setBounds(30, 320, 240, 40);

        btn.add(Qc);
        Qc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Qc.setText("jRadioButton1");
        Qc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QcActionPerformed(evt);
            }
        });
        getContentPane().add(Qc);
        Qc.setBounds(320, 240, 240, 40);

        next1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/suivant.png"))); // NOI18N
        next1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                next1MouseClicked(evt);
            }
        });
        getContentPane().add(next1);
        next1.setBounds(230, 410, 120, 50);

        previous1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        previous1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previous1MouseClicked(evt);
            }
        });
        getContentPane().add(previous1);
        previous1.setBounds(60, 410, 110, 50);

        seconds.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        seconds.setText("00");
        seconds.setToolTipText("");
        getContentPane().add(seconds);
        seconds.setBounds(710, 70, 40, 60);

        hour.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        hour.setText("01");
        hour.setToolTipText("");
        getContentPane().add(hour);
        hour.setBounds(590, 70, 50, 60);

        timer2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        timer2.setText(":");
        timer2.setToolTipText("");
        getContentPane().add(timer2);
        timer2.setBounds(690, 70, 20, 60);

        timer3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        timer3.setText(":");
        timer3.setToolTipText("");
        getContentPane().add(timer3);
        timer3.setBounds(630, 70, 20, 60);

        submit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/ezee.png"))); // NOI18N
        submit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit1MouseClicked(evt);
            }
        });
        getContentPane().add(submit1);
        submit1.setBounds(600, 150, 110, 40);

        minute.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 30)); // NOI18N
        minute.setText("00");
        minute.setToolTipText("");
        getContentPane().add(minute);
        minute.setBounds(650, 70, 40, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/start.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-250, 60, 1010, 450);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, -10, 180, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 790, 60);

        setSize(new java.awt.Dimension(770, 523));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*
     Les méthodes appelées lorsque l'utilisateur sélectionne une option de réponse.
    */
    private void QaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QaActionPerformed
        // TODO add your handling code here:
        value = Qa.getText();
    }//GEN-LAST:event_QaActionPerformed

    private void QbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QbActionPerformed
        // TODO add your handling code here:
        value = Qb.getText();
    }//GEN-LAST:event_QbActionPerformed

    private void QcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QcActionPerformed
        // TODO add your handling code here:
        value = Qc.getText();
    }//GEN-LAST:event_QcActionPerformed

    private void QdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QdActionPerformed
        // TODO add your handling code here:
        value = Qd.getText();
    }//GEN-LAST:event_QdActionPerformed

    private void previous1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previous1MouseClicked
       
        
        pos--;
        if (pos < 0) {
            pos = 0;

        }
        showItem(pos);
    }//GEN-LAST:event_previous1MouseClicked
/*
    méthode est appelée lorsque l'utilisateur clique sur le bouton
    "Suivant" pour passer à la question suivante. Il efface d'abord 
    la sélection du bouton radio, obtient le numéro de la question 
    actuelle à partir d'une étiquette, incrémente la position pour 
    passer à la question suivante, puis affiche la question suivante 
    en appelant showItem(pos).
    */
    private void next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_next1MouseClicked
        // TODO add your handling code here:
        btn.clearSelection();
        no = Qnumber.getText().toString();
        pos++;
        if (pos >= getItemsList().size()) {
            pos = getItemsList().size() - 1;
        }
        showItem(pos);

        try {
             con = myConnection.getConnection();
            String submitQuery = "INSERT INTO `reponse`(`Noo`, `SA`) VALUES (?,?)";
          
            PST = con.prepareStatement(submitQuery);
            PST.setString(1, no);
            PST.setString(2, value);
            PST.executeUpdate();

            String extractQuery = "select reponse.SA, questions.ANSWER from questions inner join (select SA from reponse order by Noo desc limit 1) as reponse on reponse.SA = questions.ANSWER";
            PST = con.prepareStatement(extractQuery);
            RS = PST.executeQuery();

            if (RS.next()) {
                String valueQuery = "INSERT INTO `compare`(`Nu`, `Valeur`) VALUES (?,?)"; 
                
                PST = con.prepareStatement(valueQuery);
                PST.setString(1, no);
                PST.setString(2, "CORRECT");
                PST.executeUpdate();
            } else {
                String valueQuery = "INSERT INTO `compare`(`Nu`, `Valeur`) VALUES (?,?)"; 
                PST = con.prepareStatement(valueQuery);
                PST.setString(1, no);
                PST.setString(2, "INCORRECT");
                PST.executeUpdate();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());            
        }

    }//GEN-LAST:event_next1MouseClicked
/*
    méthode est appelée lorsque l'utilisateur clique sur le 
    bouton "Soumettre" pour terminer le test et afficher le résultat.
    */
    private void submit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit1MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Êtes-vous sûr de vouloir soumettre ? Appuyez sur OK");
        resultTest rt = new resultTest();
        rt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_submit1MouseClicked

    /**
     * @param args the command line arguments
     */
    /*
    La mainméthode initialise les composants de l'interface graphique
    et définit l'aspect et la convivialité de Nimbus.
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
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(startExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new startExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Qa;
    private javax.swing.JRadioButton Qb;
    private javax.swing.JRadioButton Qc;
    private javax.swing.JRadioButton Qd;
    private javax.swing.JLabel Qnumber;
    private javax.swing.JLabel Qquestion;
    private javax.swing.ButtonGroup btn;
    private javax.swing.JLabel hour;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel next1;
    private javax.swing.JLabel previous1;
    private javax.swing.JLabel seconds;
    private javax.swing.JLabel submit1;
    private javax.swing.JLabel timer2;
    private javax.swing.JLabel timer3;
    // End of variables declaration//GEN-END:variables

}
