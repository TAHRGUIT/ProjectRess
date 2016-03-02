package projet;
/***********************************************************************
 * Module:  Travail.java
 * Author:  Y.T
 * Purpose: Defines the Class Travail
 ***********************************************************************/
import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Travail extends Attestations {
   private int id[]={1};
   private String drpp[];

    public Travail(){
    super();
     int i=0;
       String t ;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
     
        String tab []={"DRPP"};
        String SQL = s.querySelect(tab, "travail");
             int m=0;
        SELECT sn = new SELECT();
         Statement stmt2 = connect.con.createStatement();
        String SQL2 =sn.nbselect("travail");
         ResultSet results2 = stmt2.executeQuery(SQL2);
        while(results2.next()) {
         m= results2.getInt("count(*)");
        }
                    drpp = new String[m];
        
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
         
               t= results.getString("DRPP");
               drpp[i]=t;       
   i++;
               }
    }
        catch(Exception e){
            System.out.println("ghjk");
        }
    }

}