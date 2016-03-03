/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Connexion.Connection;
import buttonProg.INSERT;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Enregistrer");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Annuler");

        jLabel1.setText("Nom:");

        jLabel2.setText("Prenom");

        jLabel3.setText("CIN");

        jLabel4.setText("Lieu de naissance");

        jLabel5.setText("Date de naissance");

        jLabel6.setText("Situation Famillial ");

        jLabel7.setText("Specialitee");

        jLabel8.setText("Date recrutement");

        jLabel9.setText("Grade");

        jLabel10.setText("Numero_Some");

        jLabel11.setText("cadre");

        jLabel12.setText("Echellon");

        jLabel13.setText("Situation administrative");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)
                        .addGap(77, 77, 77)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(situation_famillial)
                                    .addComponent(date_de_naissance, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lieu_naissance, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nom, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prenom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(specialite)
                                    .addComponent(date_recrutement)
                                    .addComponent(grade)
                                    .addComponent(somme)
                                    .addComponent(cadre)
                                    .addComponent(echellon, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Situation_admin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lieu_naissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(date_de_naissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(situation_famillial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_recrutement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(somme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(echellon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Situation_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

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

 String infoPresonnes[]={nom.getText(),prenom.getText(), somme.getText(), cin.getText(), grade.getText(),cadre.getText()};
 String infoPersonnels[]={lieu_naissance.getText(),date_de_naissance.getText(),situation_famillial.getText(), date_recrutement.getText(), echellon.getText(), specialite.getText(), Situation_admin.getText()};
String AJoutePersonne[]={"NOM","PRENOM","SOM","CIN","GRADE","CADRE"};
String AJoutePersonnels[]={"LIEU_DE_NAISSANCE","DATE_NAISSANCE","SITUATION_FAMILIALE","DATE_RECRUTMENT","ECHELON","SEPCIALITE","SITUATION_ADMINISTRATIVE"};

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
    private javax.swing.JLabel jLabel2;
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
