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

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


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
           JOptionPane.showConfirmDialog(null,"Ereur a la base de donnee","Erreur",JOptionPane.CLOSED_OPTION);
        }
   }
             public void imagee(Document document)throws Exception{
            Image image=Image.getInstance("logo.png");
            image.scaleAbsolute(224,70);
            image.setAlignment(Image.MIDDLE);
            document.add(image);
            
    }
   public void autorisation_absence(String Nom,String Prenom,String Som,String NGrade,String service,String Raison_assence,String Adu,String Aau,String Apeice,String url){
 
       Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("AUTORISATION ABSENCE de "+Nom+"1.pdf"));
                document.open();
          
                imagee(document);
           
            document.open();
            imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("AUTORISATION D’ABSENCE", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(pa);
            for(int i=0;i<4;i++){
                document.add(new Paragraph(" "));
            }
//      cell = new PdfPCell(new Phrase("Fusion de 2 cellules de la première colonne"));
//      cell.setRowspan(2);
//      table.addCell(cell);
      PdfPTable table = new PdfPTable(2);
       PdfPCell cell=new PdfPCell();
      //contenu du tableau.
        table.addCell("\nNOM et Prénom :\n\n");
        table.addCell("\n"+Nom+" "+Prenom+"\n");
        table.addCell("\nSOM:\n\n");
        table.addCell("\n"+Som+"\n");
        table.addCell("\nGRADE :\n\n");
        table.addCell("\n"+NGrade+"\n");
        table.addCell("\nService:\n\n");
        table.addCell("\n"+service+"\n");
        table.addCell("\nARaison d’absence\n\n");
        table.addCell("\n"+Raison_assence+"\n");
     
        table.addCell("\nPériode d’absence:\n\n");
        table.addCell("DU:"+Adu+"\nAU:"+Aau+"\n");
        table.addCell("\nPièces justificatives\n\n");
        table.addCell("\n"+Apeice+"\n"); 
         document.add(table);
         Paragraph p = new Paragraph("\nSignature du demandeur", FontFactory.getFont(FontFactory.TIMES, 18, Font.NORMAL, BaseColor.DARK_GRAY));
            p.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(p);
          for(int i=0;i<3;i++){
                document.add(new Paragraph(" "));
            }
        
         PdfPTable table2 = new PdfPTable(2);
 
        table2.addCell("\nChef de departement / Secrétaire général :\n\n");
                table2.addCell("\nLe doyen\n\n");
         table2.addCell("\n\n\n\n\n\n");
         table2.addCell("\n\n\n\n\n\n");
         document.add(table2);
        Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("AUTORISATION ABSENCE de "+Nom+"1.pdf"));
            } else {
                System.out.println("Open is not supported");
            }
            document.close();
     
    
         }catch(Exception ex){
           JOptionPane.showConfirmDialog(null,"Veuillez fermer l'ancien PDF pour generer un autre ","Enregistrer",JOptionPane.CLOSED_OPTION);
         }
 }
    public void autorisation_absence2(String Nom,String Prenom,String Som,String NGrade,String service,String Raison_assence,String Adu,String Aau,String Apeice,String url){

 
       Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(url+"/AUTORISATION ABSENCE de "+Nom+"2.pdf"));
                document.open();
           
            imagee(document);
           
            document.open();
            imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("AUTORISATION D’ABSENCE", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(pa);
            for(int i=0;i<4;i++){
                document.add(new Paragraph(" "));
            }
//      cell = new PdfPCell(new Phrase("Fusion de 2 cellules de la première colonne"));
//      cell.setRowspan(2);
//      table.addCell(cell);
      PdfPTable table = new PdfPTable(2);
       PdfPCell cell=new PdfPCell();
      //contenu du tableau.
        table.addCell("\nNOM et Prénom :\n\n");
        table.addCell("\n"+Nom+" "+Prenom+"\n");
        table.addCell("\nSOM:\n\n");
        table.addCell("\n"+Som+"\n");
        table.addCell("\nGRADE :\n\n");
        table.addCell("\n"+NGrade+"\n");
        table.addCell("\nService:\n\n");
        table.addCell("\n"+service+"\n");
        table.addCell("\nARaison d’absence\n\n");
        table.addCell("\n"+Raison_assence+"\n");
     
        table.addCell("\nPériode d’absence:\n\n");
        table.addCell("DU:"+Adu+"\nAU:"+Aau+"\n");
        table.addCell("\nPièces justificatives\n\n");
        table.addCell("\n"+Apeice+"\n"); 
 
        document.add(table);
        
                document.add(new Paragraph(" "));
          
         PdfPTable table2 = new PdfPTable(1);
       table2.addCell("\n               •L’intéressé (é) est tenu d’aviser le service du personnel\n        de sa  reprise de travail après expiration d’autorisation d’absence.\n\n");
       document.add(table2);
                       document.add(new Paragraph(" "));

          PdfPTable table3 = new PdfPTable(2);
       PdfPCell cell3=new PdfPCell();
      //contenu du tableau.
      cell3 = new PdfPCell(new Phrase("                                                    Signature :"));
      cell3.setColspan(2);
      table3.addCell(cell3);
        table3.addCell("\nChef de departement/Secrétaire général:\n\n");
        table3.addCell("\nDoyen\n");
        table3.addCell("\n\n\n\n\n\n\n\n\n");
        table3.addCell("\n\n\n\n\n\n\n\n\n");
            document.add(table3);
       
       
       
  Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("AUTORISATION ABSENCE de "+Nom+"2.pdf"));
            } else {
                System.out.println("Open is not supported");
            }
            document.close();    
         }catch(Exception ex){
           JOptionPane.showConfirmDialog(null,"Veuillez fermer l'ancien PDF pour generer un autre ","Enregistrer",JOptionPane.CLOSED_OPTION);

         }
 
 }
   
}