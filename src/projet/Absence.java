package projet;

/***********************************************************************
 * Module:  Absence.java
 * Author:  Y.T
 * Purpose: Defines the Class Absence
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Absence extends Attestations {
   private int id[]={1};
   private String piecesjustificatives[];
   
   private String terme[];
   
   private String service[];
   
   private String raisonabsence[];
   
   private String du[];
   
   private String au[];

   public Absence(){
        super();
     int i=0;
       String t ;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
     
        String tab []={"id","PIECE_JUSTIFICATIVES","TERME","SERVICE","RAISON_ABSENCE","DU","AU"};
        String SQL = s.querySelect(tab, "absence");
        
          int m=0;
        SELECT sn = new SELECT();
         Statement stmt2 = connect.con.createStatement();
        String SQL2 =sn.nbselect("absence");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
        }
                    piecesjustificatives = new String[m];
                    terme = new String[m];
                    service = new String[m];
                    raisonabsence = new String[m];
                    du = new String[m];
                    au = new String[m];
        
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
         
               
               t= results.getString("PIECE_JUSTIFICATIVES");
               piecesjustificatives[i]=t;       
                
                t= results.getString("TERME");
               terme[i]=t;       
                
                t= results.getString("SERVICE");
              service[i]=t;       
                
                t=results.getString("RAISON_ABSENCE");
                raisonabsence[i]=t;
                
                t= results.getString("DU");
               du[i]=t;       
                
                t= results.getString("AU");
               au[i]=t;       
           i++;
               }
    }
        catch(Exception e){
            System.out.println("Veuillez verifier les donnee insert");
        }
   }
 
}