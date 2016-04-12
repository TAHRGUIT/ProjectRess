/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Connexion.Connection;
import buttonProg.INSERT;
import java.awt.Toolkit;
import java.sql.Statement;
/**
 *
 * @author Y.T
 */
public class Update_prof extends javax.swing.JFrame {
interProf prof =new interProf();
    public Update_prof() {
         initComponents();
        
      
        System.err.println(interProf.temtab[0]);
        nom.setText(interProf.temtab[0]);
       prenom.setText(interProf.temtab[1]);
       cin.setText(interProf.temtab[2]);
       lieu_naissance.setText(interProf.temtab[3]);
       date_de_naissance.setText(interProf.temtab[4]);
       situation_famillial.setText(interProf.temtab[5]);
       specialite.setText(interProf.temtab[6]);
       date_recrutement.setText(interProf.temtab[7]);
       grade.setText(interProf.temtab[8]);
       somme.setText(interProf.temtab[9]);
       cadre.setText(interProf.temtab[10]);
       echellon.setText(interProf.temtab[11]);
       Situation_admin.setText(interProf.temtab[12]);
         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nom = new javax.swing.JTextField();
        prenom = new javax.swing.JTextField();
        cin = new javax.swing.JTextField();
        lieu_naissance = new javax.swing.JTextField();
        date_de_naissance = new javax.swing.JTextField();
        situation_famillial = new javax.swing.JTextField();
        specialite = new javax.swing.JTextField();
        date_recrutement = new javax.swing.JTextField();
        grade = new javax.swing.JTextField();
        somme = new javax.swing.JTextField();
        cadre = new javax.swing.JTextField();
        echellon = new javax.swing.JTextField();
        Situation_admin = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Enregistrer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Annuler");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prenom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lieu de naissance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date de naissance");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Situation Famillial ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Specialitee");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date recrutement");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grade");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numero_Some");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("cadre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Echellon");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Situation administrative");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        nom.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 160, 129, -1));

        prenom.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 198, 129, -1));

        cin.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 236, 129, -1));

        lieu_naissance.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(lieu_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 274, 129, -1));

        date_de_naissance.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(date_de_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 312, 129, -1));

        situation_famillial.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(situation_famillial, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 350, 129, -1));

        specialite.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(specialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 153, 120, -1));

        date_recrutement.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(date_recrutement, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 198, 120, -1));

        grade.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 236, 120, -1));

        somme.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(somme, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 274, 120, -1));

        cadre.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(cadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 312, 120, -1));

        echellon.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(echellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 350, 120, -1));

        Situation_admin.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(Situation_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 388, 236, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/FPO logo1_2.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 410, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/min.png"))); // NOI18N
        jLabel14.setToolTipText("Minimize");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 12, 20, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/exi1.png"))); // NOI18N
        jLabel15.setToolTipText("Close");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel15MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 20, 20));

        jLabel16.setBackground(new java.awt.Color(102, 102, 102));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Login1.png"))); // NOI18N
        jLabel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel16MouseDragged(evt);
            }
        });
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         Connection connect;
      try{  
       
             connect = new Connection();
       Statement stmt = connect.con.createStatement();
      
  if(!nom.getText().isEmpty() && !nom.getText().isEmpty() && !prenom.getText().isEmpty() && !somme.getText().isEmpty()&& !cin.getText().isEmpty() && !grade.getText().isEmpty() && !cadre.getText().isEmpty() && !lieu_naissance.getText().isEmpty() && !date_de_naissance.getText().isEmpty() && !situation_famillial.getText().isEmpty() && !date_recrutement.getText().isEmpty() && !echellon.getText().isEmpty() && !specialite.getText().isEmpty() && !Situation_admin.getText().isEmpty()){
String sql4="DELETE FROM `infopersonnes` WHERE NOM='"+interProf.temtab[0]+"'and PRENOM='"+interProf.temtab[1]+"'and GRADE='"+interProf.temtab[8]+"'and SOM='"+interProf.temtab[9]+"'and CADRE='"+interProf.temtab[10]+"'";
//          System.out.println(temtab[10]);
          stmt.executeUpdate(sql4);
String sql3="DELETE FROM `infopersonnels` WHERE LIEU_DE_NAISSANCE='"+interProf.temtab[3]+"'and DATE_NAISSANCE='"+interProf.temtab[4]+"'and SITUATION_FAMILIALE='"+interProf.temtab[5]+"'and SEPCIALITE='"+interProf.temtab[6]+"'and DATE_RECRUTMENT='"+interProf.temtab[7]+"' and ECHELON='"+interProf.temtab[11]+"' and SITUATION_ADMINISTRATIVE='"+interProf.temtab[12]+"'";
//            System.out.println(temtab[10]);
  stmt.executeUpdate(sql3);
 System.out.println("c fais");

 String infoPresonnes[]={nom.getText(),prenom.getText(), somme.getText(), cin.getText(), grade.getText(),cadre.getText(),"prof"};
 String infoPersonnels[]={lieu_naissance.getText(),date_de_naissance.getText(),situation_famillial.getText(), date_recrutement.getText(), echellon.getText(), specialite.getText(), Situation_admin.getText(),"prof"};
String AJoutePersonne[]={"NOM","PRENOM","SOM","CIN","GRADE","CADRE","type"};
String AJoutePersonnels[]={"LIEU_DE_NAISSANCE","DATE_NAISSANCE","SITUATION_FAMILIALE","DATE_RECRUTMENT","ECHELON","SEPCIALITE","SITUATION_ADMINISTRATIVE","type"};

INSERT in=new INSERT();
 String SQL=in.queryInsert("infopersonnes", AJoutePersonne, infoPresonnes);
stmt.executeUpdate(SQL);
 String SQL2=in.queryInsert("infopersonnels", AJoutePersonnels, infoPersonnels);
stmt.executeUpdate(SQL2);
System.out.print("c fais");
this.dispose();
interProf i =new interProf();
i.setVisible(true);}
  else{
   System.out.print("veuillez entrer tous les informations pour contunier");
  }
      }catch(Exception ex){
          System.out.print("\nEreur");
      }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseEntered

    }//GEN-LAST:event_jLabel15MouseEntered

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MousePressed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        interProf ip = new interProf();
        ip.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 260, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
    }//GEN-LAST:event_formWindowOpened
int x,y;
    private void jLabel16MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseDragged
      
         this.setLocation((int) evt.getXOnScreen() - x, (int) evt.getYOnScreen() - y);
    }//GEN-LAST:event_jLabel16MouseDragged

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel16MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_prof.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_prof().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Situation_admin;
    private javax.swing.JTextField cadre;
    private javax.swing.JTextField cin;
    private javax.swing.JTextField date_de_naissance;
    private javax.swing.JTextField date_recrutement;
    private javax.swing.JTextField echellon;
    private javax.swing.JTextField grade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lieu_naissance;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField situation_famillial;
    private javax.swing.JTextField somme;
    private javax.swing.JTextField specialite;
    // End of variables declaration//GEN-END:variables
}
