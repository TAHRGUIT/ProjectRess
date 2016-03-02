package projet;
/***********************************************************************
 * Module:  CongeCongeExceptionnel.java
 * Author:  Y.T
 * Purpose: Defines the Class CongeCongeExceptionnel
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class CongeCongeExceptionnel extends Attestations {
   
   private int id[]={1};
   
   private int duree[];
   
   private String du[];
   
   private String au[];
   
   public  CongeCongeExceptionnel(){
       
               super();
     int i=0;
       String t ;
       int l;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
        
              int m=0;
        SELECT sn = new SELECT();
         Statement stmt2 = connect.con.createStatement();
        String SQL2 =sn.nbselect("conge_congeexceptionnel");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
        }
                    duree = new int[m];

                    du = new String[m];
                    au = new String[m];
        String tab []={"DUREE","DU","AU"};
        String SQL = s.querySelect(tab, "conge_congeexceptionnel");
        
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
   
           
                     l= results.getInt("DUREE");
               duree[i]=l;       
     
                t= results.getString("DU");
               du[i]=t;       
          
                t= results.getString("AU");
               au[i]=t;       
i++;               
               }
    }
        catch(Exception e){
            System.out.println("ghjk");
        }
   }

   }

