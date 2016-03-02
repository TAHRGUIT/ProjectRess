package projet;
/***********************************************************************
 * Module:  OrdreDeMission.java
 * Author:  Y.T
 * Purpose: Defines the Class OrdreDeMission
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class OrdreDeMission extends Attestations {
   private int id[];
   
   protected String missiona[];
   protected String objetdelamission[];
   protected String moyendetransport[];
   protected String du[];
   protected String au[];

   public  OrdreDeMission(){
       super();
     int i=0;
       String t ;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
     
        String tab []={"MISSION_A","OBJET_MISSION","TRANSPORT","DU","AU"};
        String SQL = s.querySelect(tab, "ordre_de_mission");
        
        int m=0;
        SELECT sn = new SELECT();
         Statement stmt2 = connect.con.createStatement();
        String SQL2 =sn.nbselect("ordre_de_mission");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
        }
        missiona = new String[m];
        objetdelamission = new String[m];
        moyendetransport = new String[m];
        du = new String[m];
        au = new String[m];
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {

               t= results.getString("MISSION_A");
               missiona[i]=t;       
                
                t= results.getString("OBJET_MISSION");
               objetdelamission[i]=t;       
                
                t= results.getString("TRANSPORT");
              moyendetransport[i]=t;       
                
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