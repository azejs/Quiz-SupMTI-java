
package Quiz;
 
/*
La classe student semble être utilisée pour 
l'affichage d'une interface utilisateur pour un quiz
*/
public class student extends javax.swing.JFrame {

  
    public student() {
        initComponents();
        setResizable(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        startTest = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUIZ");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSTRUCTIONS  ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 80, 270, 30);

        jLabel8.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setText(" vous pouvez donc cocher la seule réponse correcte .");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 160, 510, 30);

        subject.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        subject.setForeground(new java.awt.Color(0, 153, 0));
        subject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subject.setText("bonne chance  !");
        subject.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                subjectAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(subject);
        subject.setBounds(300, 230, 240, 30);

        startTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoButton/exam.png"))); // NOI18N
        startTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startTestMouseClicked(evt);
            }
        });
        getContentPane().add(startTest);
        startTest.setBounds(360, 330, 160, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(230, 120, 250, 10);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/exm.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 710, 450);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Quiz/logoImage/Q2.jpg"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, -20, 180, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 60);

        setSize(new java.awt.Dimension(726, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subjectAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_subjectAncestorAdded
        // TODO add your handling code here:
        //courseM.getText();
    }//GEN-LAST:event_subjectAncestorAdded

    private void startTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startTestMouseClicked
        // TODO add your handling code here:
        /*
        Lorsque l'utilisateur clique sur le bouton "startTest", 
        l'interface utilisateur de l'examen est affichée en appelant la classe "startExam".
        */
        startExam s = new startExam();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_startTestMouseClicked

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel startTest;
    private javax.swing.JLabel subject;
    // End of variables declaration//GEN-END:variables
}
