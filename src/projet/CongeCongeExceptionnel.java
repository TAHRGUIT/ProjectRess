package projet;
/***********************************************************************
 * Module:  CongeCongeExceptionnel.java
 * Author:  Y.T
 * Purpose: Defines the Class CongeCongeExceptionnel
 ***********************************************************************/

import Connexion.Connection;
import buttonProg.SELECT;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
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
     public void imagee(Document document)throws Exception{
          URL imageUrl = getClass().getProtectionDomain().getCodeSource().getLocation();
            Image image=Image.getInstance(imageUrl+"logo.png");
            image.scaleAbsolute(224,70);
            image.setAlignment(Image.MIDDLE);
            document.add(image);
            
    }
public void conje(String duree,String Nom,String Prenom,String Cin,String Grade,String Peride) {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("conjee de "+Nom+".pdf"));
            
            document.open();
            imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("Décision de congé", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(pa);
            for(int i=0;i<4;i++){
                document.add(new Paragraph(" "));
            }
            
            Paragraph p = new Paragraph("Le Doyen de la Faculté  Polydisciplinaire Ouarzazate :\n" +
            "- Vu le Dahir  n°1.58.008 du 04 chaâbane 1377 (24 février 1958) portant statut général de la fonction publique tel qu’il a été modifié et complété.\n" +
            "- Vu la demande présentée par l’intéressée.  ", FontFactory.getFont(FontFactory.TIMES, 14, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p);
             Paragraph p3 = new Paragraph("DECIDE :", FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
                         p3.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(p3);
             Paragraph p4 = new Paragraph("ARTICLE I Un congé d’un "+duree+" Jours.", FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            document.add(p4);
            Paragraph p5 = new Paragraph(
"           Est accordé à   :"+Nom+" "+Prenom+"    \n" +
"           C.I.N           :"+Cin+"    \n" +
"           GRADE           :"+Grade+"    \n" +
"           Pour la période :"+Peride+"   ", FontFactory.getFont(FontFactory.TIMES, 15, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p5);
            Paragraph p6 = new Paragraph("ARTICLE II", FontFactory.getFont(FontFactory.TIMES, 16, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            document.add(p6);
            Paragraph p7 = new Paragraph("L’intéressé(e) est autorisé à quitter le territoire national durant la période indiquée ci-dessus", FontFactory.getFont(FontFactory.TIMES, 18, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p7);
            Paragraph p8 = new Paragraph("ARTICLE III", FontFactory.getFont(FontFactory.TIMES, 16, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            document.add(p8);
            Paragraph p9 = new Paragraph("L’intéressé(e) est tenu d’aviser le service du personnel de sa reprise de travail après expiration du  congé sus-visé.", FontFactory.getFont(FontFactory.TIMES, 18, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p9);
            for(int i=0;i<4;i++){
                document.add(new Paragraph(" "));
            }
            
            Paragraph time = new Paragraph("             Cachet et signature                                        Fait à Ouarzazate le :"+tdnow+"\n"+"\n",FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
        
            
            Paragraph si = new Paragraph("Signature du demandeur",FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
            time.setAlignment(Paragraph.ALIGN_LEFT);
            si.setAlignment(Paragraph.ALIGN_RIGHT);
            document.add(time);
            document.add(si);
            document.close();
            
             System.out.println("date2");
            /* Open Pdf */
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("conjee de "+Nom+".pdf"));
            } else {
                System.out.println("Open is not supported");
            }
             
             System.out.println("date");
        } catch (Exception ex) {
            
        System.out.println("qsdqs");
        }
    }
 public void conje_exp(String duree,String Nom,String Prenom,String Cin,String Grade,String Peride) {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("conge Exceptionnel "+Nom+".pdf"));
            document.open();
            imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("Décision de congé", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(pa);
            for(int i=0;i<4;i++){
                document.add(new Paragraph(" "));
            }
           
            Paragraph p = new Paragraph("Le Doyen de la Faculté  Polydisciplinaire Ouarzazate :\n" +
            "- Vu le Dahir  n°1.58.008 du 04 chaâbane 1377 (24 février 1958) portant statut général de la fonction publique tel qu’il a été modifié et complété.\n" +
            "- Vu la demande présentée par l’intéressée.  ", FontFactory.getFont(FontFactory.TIMES, 14, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p);
             Paragraph p3 = new Paragraph("DECIDE :", FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
                         p3.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(p3);
             Paragraph p4 = new Paragraph("ARTICLE I", FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            document.add(p4);
            Paragraph p5 = new Paragraph(
"           Un congé Exceptionnel d’une durée de "+duree+"jours\n"+
"           Est accordé à   :"+Nom+" "+Prenom+"    \n" +
"           C.I.N           :"+Cin+"    \n" +
"           GRADE           :"+Grade+"    \n" +
"           Pour la période :"+Peride+"   ", FontFactory.getFont(FontFactory.TIMES, 15, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p5);
            Paragraph p6 = new Paragraph("ARTICLE II", FontFactory.getFont(FontFactory.TIMES, 16, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            document.add(p6);
            Paragraph p7 = new Paragraph("L’intéressé(e) est autorisé à quitter le territoire national durant la période indiquée ci-dessus", FontFactory.getFont(FontFactory.TIMES, 18, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p7);
            Paragraph p8 = new Paragraph("ARTICLE III", FontFactory.getFont(FontFactory.TIMES, 16, Font.BOLDITALIC, BaseColor.DARK_GRAY));
            document.add(p8);
            Paragraph p9 = new Paragraph("L’intéressé(e) est tenu d’aviser le service du personnel de sa reprise de travail après expiration du  congé sus-visé.", FontFactory.getFont(FontFactory.TIMES, 18, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p9);
            for(int i=0;i<4;i++){
                document.add(new Paragraph(" "));
            }
            
            Paragraph time = new Paragraph("             Cachet et signature                                        Fait à Ouarzazate le :"+tdnow+"\n"+"\n",FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
        
            
            Paragraph si = new Paragraph("Signature du demandeur",FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
            time.setAlignment(Paragraph.ALIGN_LEFT);
            si.setAlignment(Paragraph.ALIGN_RIGHT);
            
            document.add(time);
            document.add(si);
             
            document.close();
            /* Open Pdf */
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("conge Exceptionnel "+Nom+".pdf"));
            } else {
                System.out.println("Open is not supported");
            }
             
        } catch (Exception ex) {
            
        System.out.println("Veuillez fermer votre Precedent pdf Pour Generer une Autre Fois");
        }
    }  
   }

