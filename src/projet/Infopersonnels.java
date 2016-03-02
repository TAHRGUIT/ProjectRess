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
      
        String tab []={"SEX","NOMAR","PRENOMAR","DATE_NAISSANCE","LIEU_DE_NAiSSANCE","SITUATION_FAMILIALE","SITUATION_ADMINISTRATIVE","DATE_RECRUTMENT","ECHELLE","ECHELON","SEPCIALITE"};
        String SQL = s.querySelect(tab, "infopersonnels");
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
  
               while(results.next()) {
          
               
               t= results.getString("SEX");
               sex[i]=t;       
             
              t = results.getString("NOMAR");
              nomar[i]=t;
              
               t= results.getString("PRENOMAR");
              prenomar[i]=t;       
                
                t=results.getString("DATE_NAISSANCE");
               datedenaissance[i]=t;
                
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
                  
                
        i++;   
                
            //jLabel1.setText(results.getString("NOM"));
           
        }
        } catch (Exception ex) {
            Logger.getLogger(InfoPersonnes.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    public static void main(String[] args) {
        Infopersonnels s = new Infopersonnels();
   
    }
      
}