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
import javax.swing.JOptionPane;
/**
 *
 * @author Y.T
 */
public class Update_prof extends javax.swing.JFrame {
interProf prof =new interProf();
    public Update_prof() {
         initComponents();
        
        nom.setText(interProf.temtab[0]);
       prenom.setText(interProf.temtab[1]);
       nomar.setText(interProf.temtab[2]);
       prenomar.setText(interProf.temtab[3]);
       cin.setText(interProf.temtab[4]);
       sex.setText(interProf.temtab[5]);
       lieu_naissance.setText(interProf.temtab[6]);
       date_de_naissance.setText(interProf.temtab[7]);
       situation_famillial.setText(interProf.temtab[8]);
       specialite.setText(interProf.temtab[9]);
       date_recrutement.setText(interProf.temtab[10]);
       dateaffect.setText(interProf.temtab[11]);
       grade.setText(interProf.temtab[12]);
       somme.setText(interProf.temtab[13]);
       cadre.setText(interProf.temtab[14]);
       echellon.setText(interProf.temtab[15]);
       Situation_admin.setText(interProf.temtab[16]);
       univers.setText(interProf.temtab[17]);
       depart.setText(interProf.temtab[18]);
       diplome.setText(interProf.temtab[19]);
       spesial_dip.setText(interProf.temtab[20]);
         
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
        nomar = new javax.swing.JTextField();
        prenomar = new javax.swing.JTextField();
        dateaffect = new javax.swing.JTextField();
        univers = new javax.swing.JTextField();
        depart = new javax.swing.JTextField();
        diplome = new javax.swing.JTextField();
        spesial_dip = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sex = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Annuler");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nom");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prenom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lieu de naissance");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date de naissance");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Situation Famillial ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Specialitee");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Date recrutement");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grade");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numero_Some");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("cadre");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Echellon");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Situation administrative");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, -1));

        nom.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 200, 30));

        prenom.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(prenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, 30));

        cin.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(cin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 200, 30));

        lieu_naissance.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(lieu_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 200, 30));

        date_de_naissance.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(date_de_naissance, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 200, 30));

        situation_famillial.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(situation_famillial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 200, 30));

        specialite.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(specialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 200, 30));

        date_recrutement.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(date_recrutement, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 200, 30));

        grade.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(grade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 200, 30));

        somme.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(somme, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 200, 30));

        cadre.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(cadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 200, 30));

        echellon.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(echellon, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 200, 30));

        Situation_admin.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(Situation_admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, 200, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/FPO logo1_2.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 410, 90));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/min.png"))); // NOI18N
        jLabel14.setToolTipText("Minimize");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 12, 20, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/exi1.png"))); // NOI18N
        jLabel15.setToolTipText("Close");
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 20, 20));

        nomar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(nomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, 30));

        prenomar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(prenomar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 200, 30));
        prenomar.getAccessibleContext().setAccessibleName("");

        dateaffect.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(dateaffect, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 200, 30));

        univers.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(univers, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 200, 30));

        depart.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 200, 30));

        diplome.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(diplome, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 200, 30));

        spesial_dip.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        spesial_dip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spesial_dipActionPerformed(evt);
            }
        });
        getContentPane().add(spesial_dip, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 200, 30));

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("UNIVERSITE ETABLISSMENT");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, -1, -1));

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DEPARTEMENT");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("الاسم الشخصي");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Date Affectation");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("DIPLOME");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("SPECIALITEE DE DIPLOME");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, -1));

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("الاسم العائلي");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("SEXE");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        sex.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 14)); // NOI18N
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 200, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Login_ajou.png"))); // NOI18N
        jLabel26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel26MouseDragged(evt);
            }
        });
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel26MousePressed(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         Connection connect;
      try{  
       
             connect = new Connection();
       Statement stmt = connect.con.createStatement();
      
  if(!nom.getText().isEmpty() && !prenom.getText().isEmpty() && !nomar.getText().isEmpty()&& !prenomar.getText().isEmpty() && !sex.getText().isEmpty() && !dateaffect.getText().isEmpty() && !univers.getText().isEmpty() && !depart.getText().isEmpty() && !diplome.getText().isEmpty() && !spesial_dip.getText().isEmpty() && !somme.getText().isEmpty()&& !cin.getText().isEmpty() && !grade.getText().isEmpty() && !cadre.getText().isEmpty() && !lieu_naissance.getText().isEmpty() && !date_de_naissance.getText().isEmpty() && !situation_famillial.getText().isEmpty() && !date_recrutement.getText().isEmpty() && !echellon.getText().isEmpty() && !specialite.getText().isEmpty() && !Situation_admin.getText().isEmpty()){
String sql4="DELETE FROM `infopersonnes` WHERE NOM='"+interProf.temtab[0]+"'and PRENOM='"+interProf.temtab[1]+"'and GRADE='"+interProf.temtab[12]+"'and SOM='"+interProf.temtab[13]+"'and CADRE='"+interProf.temtab[14]+"'";
          stmt.executeUpdate(sql4);
String sql3="DELETE FROM `infopersonnels` WHERE LIEU_DE_NAISSANCE='"+interProf.temtab[6]+"'and DATE_NAISSANCE='"+interProf.temtab[7]+"'and SITUATION_FAMILIALE='"+interProf.temtab[8]+"'and SEPCIALITE='"+interProf.temtab[9]+"'and DATE_RECRUTMENT='"+interProf.temtab[10]+"' and ECHELON='"+interProf.temtab[15]+"' and SITUATION_ADMINISTRATIVE='"+interProf.temtab[16]+"'";
  stmt.executeUpdate(sql3);

  String infoPresonnes[]={nom.getText(),prenom.getText(), somme.getText(), cin.getText(), grade.getText(),cadre.getText(),"prof"};
      String infoPersonnels[]={lieu_naissance.getText(),date_de_naissance.getText(),situation_famillial.getText(), date_recrutement.getText(), echellon.getText(), specialite.getText(), Situation_admin.getText(),nomar.getText(),prenomar.getText(),sex.getText(),dateaffect.getText(),univers.getText(),depart.getText(),diplome.getText(),spesial_dip.getText(),"prof"};
      String AJoutePersonne[]={"NOM","PRENOM","SOM","CIN","GRADE","CADRE","type"};
     String AJoutePersonnels[]={"LIEU_DE_NAISSANCE","DATE_NAISSANCE","SITUATION_FAMILIALE","DATE_RECRUTMENT","ECHELON","SEPCIALITE","SITUATION_ADMINISTRATIVE","NOMAR","PRENOMAR","SEX","Date_affectation","UNIVRESITEE","DEPARTEMENT","DIPLOME","SPECIALITEE","type"};
                 
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
            JOptionPane.showConfirmDialog(null," Vérifier que tous les champs sont bien remplis","Erreur",JOptionPane.CLOSED_OPTION);
  }
      }catch(Exception ex){
       JOptionPane.showConfirmDialog(null," vérifier Votre Base de Donnee","Erreur",JOptionPane.CLOSED_OPTION);
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
        this.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 440, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
    }//GEN-LAST:event_formWindowOpened

    private void spesial_dipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spesial_dipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spesial_dipActionPerformed

    private void jLabel26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MousePressed
          x = evt.getX();
       y = evt.getY();
    }//GEN-LAST:event_jLabel26MousePressed

    private void jLabel26MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseDragged
this.setLocation((int) evt.getXOnScreen() - x, (int) evt.getYOnScreen() - y);          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseDragged
int x,y;
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
    private javax.swing.JTextField dateaffect;
    private javax.swing.JTextField depart;
    private javax.swing.JTextField diplome;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lieu_naissance;
    private javax.swing.JTextField nom;
    private javax.swing.JTextField nomar;
    private javax.swing.JTextField prenom;
    private javax.swing.JTextField prenomar;
    private javax.swing.JTextField sex;
    private javax.swing.JTextField situation_famillial;
    private javax.swing.JTextField somme;
    private javax.swing.JTextField specialite;
    private javax.swing.JTextField spesial_dip;
    private javax.swing.JTextField univers;
    // End of variables declaration//GEN-END:variables
}
