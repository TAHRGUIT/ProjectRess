package projet;
/***********************************************************************
 * Module:  International.java
 * Author:  Y.T
 * Purpose: Defines the Class International
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class International extends OrdreDeMission {
   private int id[] = {1};
   private String affectation[];
   private String avisdechef[];
   private String motif[];
   private String adress[];

   public  International(){
        super();
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
        String SQL2 =sn.nbselect("international");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
        }
                    affectation = new String[m];
                    avisdechef = new String[m];
                    motif = new String[m];
                    adress = new String[m];
                 
                    
        String tab []={"AFFECTATION","AVIS_CHEF","MOTIF","ADRESSE"};
        String SQL = s.querySelect(tab, "international");
        
        
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
         
               
               t= results.getString("AFFECTATION");
               affectation[i]=t;       
                
                  t= results.getString("AVIS_CHEF");
               avisdechef[i]=t;       
                
                t= results.getString("MOTIF");
              motif[i]=t;       
               
                t= results.getString("ADRESSE");
               adress[i]=t;       
       i++;
               }
 
    }
        catch(Exception e){
            System.out.println("ghjk");
        }
        
   }
}