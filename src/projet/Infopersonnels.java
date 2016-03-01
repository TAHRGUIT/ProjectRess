package projet;
/***********************************************************************
 * Module:  Infopersonnels.java
 * Author:  Y.T
 * Purpose: Defines the Class Infopersonnels
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Infopersonnels extends InfoPersonnes {
    
    
   private int id[]={2};
   
   private String lieudenaissance[]={""};
   
  private Date datedenaissance[];
   
   private String situationfamiliale[]={""};
   
   
  // private String daterecrutement[];
   
   private String echelon[]={""};
   
   private String echelle[]={""};
   
   private String nomar[]={""};
   
   private String prenomar[]={""};
   
   private String situationAdministrative[]={""};
   
   private String sex[]={""};
   
    public Infopersonnels(){
        super();
          int i=0;
       String t ;
         Connection connect;
        try {
        connect = new Connection();
        Statement stmt = connect.con.createStatement();
        SELECT s = new SELECT();
     
        String tab []={"SEX","NOMAR","PRENOMAR","DATE_NAISSANCE","LIEU_DE_NAiSSANCE","SITUATION_FAMILIALE","SITUATION_ADMINISTRATIVE","DATE_RECRUTMENT","ECHELLE","ECHELON"};
        String SQL = s.querySelect(tab, "infopersonnels");
        ResultSet results = stmt.executeQuery(SQL);
               while(results.next()) {
           for(i=0;i<sex.length;i++){
               t= results.getString("SEX");
               sex[i]=t;       
                System.out.print(sex[i]+"  ");
                
               t = results.getString("NOMAR");
               nomar[i]=t;
                System.out.print(nomar[i]+"  ");
                
                t= results.getString("PRENOMAR");
               prenomar[i]=t;       
                System.out.print(prenomar[i]+"  ");
                
               datedenaissance[i]=results.getDate("DATE_NAISSANCE");
                System.out.print(datedenaissance[i]+"  ");
                
                t= results.getString("LIEU_DE_NAiSSANCE");
               lieudenaissance[i]=t;       
                System.out.print(lieudenaissance[i]+"  ");
                
               t = results.getString("SITUATION_FAMILIALE");
               situationfamiliale[i]=t;
                System.out.print(situationfamiliale[i]+"  \n");
                
                  t = results.getString("SITUATION_ADMINISTRATIVE");
               situationAdministrative[i]=t;
                System.out.print(situationAdministrative[i]+"  \n");
                
                 
//               daterecrutement[i]=results.getString("DATE_RECRUTMENT");
//                System.out.print(daterecrutement[i]+"  \n");
                
                  t = results.getString("ECHELON");
               echelon[i]=t;
                System.out.print(echelon[i]+"  \n");
                
                  t = results.getString("ECHELLE");
               echelle[i]=t;
                System.out.print(echelle[i]+"  \n");
                
           
                
            //jLabel1.setText(results.getString("NOM"));
        }    
        }
        } catch (Exception ex) {
            Logger.getLogger(InfoPersonnes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public static void main(String[] args) {
        Infopersonnels a = new Infopersonnels();
    }
}