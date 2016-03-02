package projet;
import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
/***********************************************************************
 * Module:  InfoPersonnes.java
 * Author:  Y.T
 * Purpose: Defines the Class InfoPersonnes
 ***********************************************************************/

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InfoPersonnes {
   
   private int id[]={2};
  
   protected String nom[];
   
   protected String prenom[];
   
   protected String som[];
   
   protected String cin[];
   
   protected String grade[];
   
   protected String cadre[];
   
   
   //constructeurs

    public InfoPersonnes() {
       int i=0;
       String t ;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
        
        int m=0;
        SELECT sn = new SELECT();
         Statement stmt2 = connect.con.createStatement();
        String SQL2 =sn.nbselect("infopersonnes");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
        }
                    nom = new String[m];
                    prenom = new String[m];
                    som = new String[m];
                    cin = new String[m];
                    grade = new String[m];
                    cadre = new String[m];
             
                      
        String tab []={"NOM","PRENOM","SOM","CIN","GRADE","CADRE"};
        String SQL = s.querySelect(tab, "infopersonnes");
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
       
               t= results.getString("NOM");
               nom[i]=t;       
               
               t = results.getString("PRENOM");
               prenom[i]=t;
                
                t= results.getString("SOM");
               som[i]=t;       
               
               t = results.getString("CIN");
               cin[i]=t;
             
                t= results.getString("GRADE");
               grade[i]=t;       
              
               t = results.getString("CADRE");
               cadre[i]=t;
        i++;   
        }
        } catch (Exception ex) {
            Logger.getLogger(InfoPersonnes.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
     public String[] getNom(){
     return nom;
     }
     public String[] getPrenom (){
     return prenom;
     }
         public String[] getSom (){
     return som;
     }       
      public String[] getCin (){
     return cin;
     }
      public String[] getGrade (){
     return grade;
     }
   public String[] getcadre (){
     return cadre;
     }
     
    
}