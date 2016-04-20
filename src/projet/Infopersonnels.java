package projet;
/***********************************************************************
 * Module:  Infopersonnels.java
 * Author:  Y.T
 * Purpose: Defines the Class Infopersonnels
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import com.sun.javafx.binding.StringFormatter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Infopersonnels extends InfoPersonnes {
    
    
   public int id[]={2};
   
   public String lieudenaissance[];
   
  public String datedenaissance[];
   
   public String situationfamiliale[];
   
   public String daterecrutement[];
   
   public String echelon[];
   
   public String echelle[];
   
   public String nomar[];
   
   public String prenomar[];
   
   public String situationAdministrative[];
   
   public String sex[];
   
   public String SEPCIALITE[];
   
   public String type[]; 
   
   public String Date_affectation[];
   
   public String universsitee[];
   
   public String departement[];
   
   public String diplome[];
   
   public String specialitee[];
   
   public String fonct_exrc[];
    public Infopersonnels(){
        super();
          int i=0;
          int m=0;
       String t ;
         Connection connect;
        try {
            
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        
        SELECT s = new SELECT();
      
       // String tab []={"SEX","NOMAR","PRENOMAR","DATE_NAISSANCE","LIEU_DE_NAiSSANCE","SITUATION_FAMILIALE","SITUATION_ADMINISTRATIVE","DATE_RECRUTMENT","ECHELLE","ECHELON","SEPCIALITE"};
        String SQL = s.querySelectOrderd("infopersonnels","ID");
     
        ResultSet results = stmt.executeQuery(SQL);
        
        SELECT sn = new SELECT();
         Statement stmt2 = connect.con.createStatement();
        String SQL2 =sn.nbselect("infopersonnels");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
               
        }
                sex = new String[m];
                 lieudenaissance = new String[m];
                  datedenaissance = new String[m];
                  situationfamiliale = new String[m];
                   daterecrutement = new String[m];
                     echelon = new String[m];
                     echelle = new String[m];
                      nomar = new String[m];
                      prenomar=new String[m];
                      situationAdministrative=new String[m];
                      SEPCIALITE=new String[m];
                        type =new String[m];
                        Date_affectation =new String[m];
                        
                          universsitee=new String[m];
                         departement=new String[m];
                            diplome=new String[m];
                            specialitee=new String[m];
                            fonct_exrc=new String[m];
                                String str;

               while(results.next()) {
          
               
               t= results.getString("SEX");
               sex[i]=t;      
               
           t=results.getString("NOMAR");
               //t = new String(.getBytes(), "UTF-8");
                nomar[i]=t;
              
              //  new String(.getBytes(), "UTF-8");
                 t= results.getString("PRENOMAR");
              prenomar[i]=t;       
                
                t=results.getString("DATE_NAISSANCE");
               datedenaissance[i]=t;
               
               t=results.getString("type");
               type[i]=t;
                
                t= results.getString("LIEU_DE_NAiSSANCE");
               lieudenaissance[i]=t;       
                
               t = results.getString("SITUATION_FAMILIALE");
               situationfamiliale[i]=t;
                
                  t = results.getString("SITUATION_ADMINISTRATIVE");
               situationAdministrative[i]=t;
              
                 t=results.getString("DATE_RECRUTMENT");
               daterecrutement[i]=t;
                
                  t = results.getString("ECHELON");
               echelon[i]=t;
                
                  t = results.getString("ECHELLE");
               echelle[i]=t;
               
                t = results.getString("SEPCIALITE");
               SEPCIALITE[i]=t;
                  
               t = results.getString("Date_affectation");
               Date_affectation[i]=t;
               
               t = results.getString("UNIVRESITEE");
               universsitee[i]=t;
               
                t = results.getString("DEPARTEMENT");
               departement[i]=t;
               
                t = results.getString("DIPLOME");
               diplome[i]=t;
               
                t = results.getString("SPECIALITEE");
               specialitee[i]=t;
               
               t = results.getString("FONCT_EXERC");
               fonct_exrc[i]=t;
                
        i++;   
                
            //jLabel1.setText(results.getString("NOM"));
           
        }
        } catch (Exception ex) {
           JOptionPane.showConfirmDialog(null,"Ereur a la base de donnee","Erreur",JOptionPane.CLOSED_OPTION);
        }
       
    }


}