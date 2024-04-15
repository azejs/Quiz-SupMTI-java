
package Quiz;

 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

// class manage
public class manage extends javax.swing.JFrame {

    
    ImageIcon icon;

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
// Constructeur de la classe "manage"
    public manage() {
        /*
        un constructeur qui appelle la méthode initComponents()
        qui initialise les composants graphiques de l'interface utilisateur
        */
        initComponents();

        setResizable(false);
        /*
        comboBox() qui remplit la liste déroulante (JComboBox)
        avec les numéros de questions de la base de données. 
        */
        comboBox();
        String ques = mQuestion.getText();
        String Am = mA.getText();
        String Bm = mB.getText();
        String Cm = mC.getText();
        String Dm = mD.getText();
        String ans = answer.getText();
        String sub1 = subject.getText();
    }

    private void comboBox() {
        try {
            /*
             La connexion à la base de données est établie
            dans cette méthode en utilisant la classe myConnection
            */
            con = myConnection.getConnection();
            /*
             Cette requette utilise une instruction SQL pour 
            récupérer les numéros de questions triés par ordre croissant 
            à partir de la table questions et les ajoute à la liste déroulante.
            */
            String sql = "SELECT * FROM questions ORDER BY `question_id` ASC";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("question_id");
                num1.addItem(name);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    /*
    Cette méthode est appelée depuis 
    le constructeur pour initialiser le formulaire.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        mQuestion1 = new javax.swing.JScrollPane();
        mQuestion = new javax.swing.JTextArea();
        mD = new javax.swing.JTextField();
        mA = new javax.swing.JTextField();
        mB = new javax.swing.JTextField();
        createNew = new javax.swing.JLabel();
        mC = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        num1 = new javax.swing.JComboBox<>();
        reset1 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        delete1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        mQuestion1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        mQuestion.setColumns(20);
        mQuestion.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        mQuestion.setRows(5);
        mQuestion1.setViewportView(mQuestion);

        getContentPane().add(mQuestion1);
        mQuestion1.setBounds(200, 60, 470, 110);

        mD.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mD);
        mD.setBounds(380, 270, 260, 30);

        mA.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mA);
        mA.setBounds(70, 230, 260, 30);

        mB.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mBActionPerformed(evt);
            }
        });
        getContentPane().add(mB);
        mB.setBounds(70, 280, 260, 30);

        createNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/ajouter.png"))); // NOI18N
        createNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createNewMouseClicked(evt);
            }
        });
        getContentPane().add(createNew);
        createNew.setBounds(680, 60, 130, 50);

        mC.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        mC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(mC);
        mC.setBounds(380, 230, 260, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel1.setText("D.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 270, 30, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel3.setText("B.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 280, 30, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel6.setText("C.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 230, 30, 30);

        jLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jLabel.setText("Réponse:");
        getContentPane().add(jLabel);
        jLabel.setBounds(190, 340, 80, 40);

        answer.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(answer);
        answer.setBounds(260, 350, 230, 30);

        num.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        num.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        getContentPane().add(num);
        num.setBounds(70, 180, 70, 30);

        num1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        num1.setToolTipText("");
        num1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                num1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(80, 80, 90, 30);

        reset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/vid.png"))); // NOI18N
        reset1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reset1MouseClicked(evt);
            }
        });
        getContentPane().add(reset1);
        reset1.setBounds(680, 140, 130, 50);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/md.png"))); // NOI18N
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(680, 100, 130, 50);

        delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/sup.png"))); // NOI18N
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
        });
        getContentPane().add(delete1);
        delete1.setBounds(680, 180, 130, 50);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/prec.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(20, 420, 120, 40);

        subject.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        subject.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });
        getContentPane().add(subject);
        subject.setBounds(70, 130, 110, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel10.setText("N° Q");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 180, 30, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel11.setText("A.");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 230, 30, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel12.setText("Recherche");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 80, 80, 30);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(30, 170, 43, 16);

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 12)); // NOI18N
        jLabel18.setText("Sujet");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 130, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/create.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-70, 60, 920, 450);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 0, 180, 80);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 820, 60);

        setSize(new java.awt.Dimension(833, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mBActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_subjectActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_num1ActionPerformed
/*
    cette methode est déclenchée lorsque l'utilisateur sélectionne 
    une option dans un menu déroulant  . 
    Cette fonction récupère les données de la question sélectionnée dans la
    base de données et les affiche dans les champs de texte correspondants.
    */
    private void num1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_num1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try {
            
            con = myConnection.getConnection();
            String tmp = (String) num1.getSelectedItem();
          
            String sql = "SELECT * FROM `questions` WHERE `question_id` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, tmp);
            rs = ps.executeQuery();
            if (rs.next()) {
                String add1 = rs.getString("question_id");
                num.setText(add1);
                String add2 = rs.getString("QUESTION");
                mQuestion.setText(add2);
                String add3 = rs.getString("A");
                mA.setText(add3);
                String add4 = rs.getString("B");
                mB.setText(add4);
                String add5 = rs.getString("C");
                mC.setText(add5);
                String add6 = rs.getString("D");
                mD.setText(add6);
                String add7 = rs.getString("ANSWER");
                answer.setText(add7);
                String add8 = rs.getString("SUBJECT");
                subject.setText(add8);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_num1PopupMenuWillBecomeInvisible
/*
    Cette fonction supprime la question sélectionnée dans la base de données 
    et dans le menu déroulant.
    */
    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        // TODO add your handling code here:
        try {
            
             con = myConnection.getConnection();
             
            String sql = "DELETE FROM `questions` WHERE `question_id`= ?";
          
            ps = con.prepareStatement(sql);
            ps.setString(1, num1.getSelectedItem().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "la question a supprimé avec succès");
            int index = num1.getSelectedIndex();
            num1.removeItemAt(index);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        num.setText("");
        mQuestion.setText("");
        mA.setText("");
        mB.setText("");
        mC.setText("");
        mD.setText("");
        answer.setText("");
    }//GEN-LAST:event_delete1MouseClicked
/*
    . Cette fonction réinitialise tous les champs de texte à une chaîne vide.
    */
    private void reset1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reset1MouseClicked
        // TODO add your handling code here:
        mQuestion.setText("");
        mA.setText("");
        mB.setText("");
        mC.setText("");
        mD.setText("");
        answer.setText("");
    }//GEN-LAST:event_reset1MouseClicked
/*
    Cette fonction met à jour les données de la question 
    sélectionnée dans la base de données avec 
    les nouvelles valeurs saisies dans les champs de texte.
    */
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
                                    
    String id = num.getText(); // retrieve the question ID
    String ques = mQuestion.getText();
    String Am = mA.getText();
    String Bm = mB.getText();
    String Cm = mC.getText();
    String Dm = mD.getText();
    String ans = answer.getText();
    String sub = subject.getText();
   
    try {
        con = myConnection.getConnection();
        String query = "UPDATE questions SET QUESTION=?, A=?, B=?, C=?, D=?, ANSWER=?, SUBJECT=? WHERE question_id=?";
        PreparedStatement statement = con.prepareStatement(query);
        
        statement.setString(1, ques);
        statement.setString(2, Am);
        statement.setString(3, Bm);
        statement.setString(4, Cm);
        statement.setString(5, Dm);
        statement.setString(6, ans);
        statement.setString(7, sub);
        statement.setString(8, id);
        
        int lignesModifiees = statement.executeUpdate();
        System.out.println(lignesModifiees + " ligne(s) modifiée(s) dans la table 'questions'.");
        con.close();
        
    } catch (SQLException e) {
        System.err.println("Erreur lors de la modification de la question : " + e.getMessage());
   
}

    }//GEN-LAST:event_updateMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        admin a = new admin();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked
/*
    La méthode createNewMouseClicked est appelée lorsqu'on 
    clique sur le bouton "Create New" et elle permet de récupérer 
    les valeurs des différents champs de la fenêtre (numéro de la question,
    la question elle-même, les choix de réponse, la réponse correcte, 
    et la matière associée à la question)
    et de les insérer dans la base de donnée
    */
    private void createNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createNewMouseClicked
       String Nu = num.getText();
        String ques = mQuestion.getText();
        String Am = mA.getText();
        String Bm = mB.getText();
        String Cm = mC.getText();
        String Dm = mD.getText();
        String ans = answer.getText();
        String sub = subject.getText();
        // Connexion à la base de données
     
       
        try {
           con = myConnection.getConnection();
        
            // Création de la requête d'insertion
            String query = "INSERT INTO questions (question_id, QUESTION, A, B, C, D, ANSWER, SUBJECT) "
                            + "VALUES (?,?,?,?,?,?,?,?)";
            // Préparation de la requête
            PreparedStatement statement = con.prepareStatement(query);
            
            // Définition des valeurs à insérer
            statement.setString(1, Nu);
            statement.setString(2, ques);
            statement.setString(3, Am);
            statement.setString(4, Bm);
            statement.setString(5, Cm);
            statement.setString(6, Dm);
            statement.setString(7, ans);
            statement.setString(8, sub);
            // Méthode pour générer un identifiant unique pour la question
          
            // Exécution de la requête
            int lignesAjoutees = statement.executeUpdate();
            System.out.println(lignesAjoutees + " ligne(s) ajoutée(s) à la table 'questions'.");
            con.close();

        } catch (SQLException e) {
            System.err.println("Erreur lors de l'insertion de la question : " + e.getMessage());
        }
    
    }//GEN-LAST:event_createNewMouseClicked
/*
    La méthode main est la méthode principale de la classe manage.
    Elle est appelée lorsqu'on exécute le programme.
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
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         

         
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField answer;
    private javax.swing.JLabel back;
    private javax.swing.JLabel createNew;
    private javax.swing.JLabel delete1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField mA;
    public javax.swing.JTextField mB;
    public javax.swing.JTextField mC;
    private javax.swing.JTextField mD;
    public javax.swing.JTextArea mQuestion;
    private javax.swing.JScrollPane mQuestion1;
    private javax.swing.JTextField num;
    public static javax.swing.JComboBox<String> num1;
    private javax.swing.JLabel reset1;
    public static javax.swing.JTextField subject;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
