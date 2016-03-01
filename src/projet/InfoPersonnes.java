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
  
   protected String nom[]={""};
   
   protected String prenom[]={""};
   
   protected String som[]={""};
   
   protected String cin[]={""};
   
   protected String grade[]={""};
   
   protected String cadre[]={""};
   
   
   //constructeurs

    public InfoPersonnes() {
       int i=0;
       String t ;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
     
        String tab []={"NOM","PRENOM","SOM","CIN","GRADE","CADRE"};
        String SQL = s.querySelect(tab, "infopersonnes");
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
           for(i=0;i<nom.length;i++){
               t= results.getString("NOM");
               nom[i]=t;       
                System.out.print(nom[i]+"  ");
               t = results.getString("PRENOM");
               prenom[i]=t;
                System.out.print(prenom[i]+"  ");
                t= results.getString("SOM");
               som[i]=t;       
                System.out.print(som[i]+"  ");
               t = results.getString("CIN");
               cin[i]=t;
                System.out.print(cin[i]+"  ");
                t= results.getString("GRADE");
               grade[i]=t;       
                System.out.print(grade[i]+"  ");
               t = results.getString("CADRE");
               cadre[i]=t;
                System.out.print(cadre[i]+"  \n");
                
            //jLabel1.setText(results.getString("NOM"));
        }    
        }
        } catch (Exception ex) {
            Logger.getLogger(InfoPersonnes.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}