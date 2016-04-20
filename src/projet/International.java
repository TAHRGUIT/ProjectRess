package projet;
/***********************************************************************
 * Module:  International.java
 * Author:  Y.T
 * Purpose: Defines the Class International
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
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

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
           JOptionPane.showConfirmDialog(null,"Ereur a la base de donnee","Erreur",JOptionPane.CLOSED_OPTION);
        }
        
   }
        public void imagee(Document document)throws Exception{
            Image image=Image.getInstance("logo.png");
            image.scaleAbsolute(224,70);
            image.setAlignment(Image.MIDDLE);
            document.add(image);
            
    }
    public void quitter_territoire(String Nom,String Prenom,String Grade,String Adress_perso,String Affectation,String Du,String Au,String Motif,String Avis_de_chef,String url){
     

       Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(url+"/quitter territoire de "+Nom+".pdf"));
              
                document.open();
            imagee(document);
           
            document.open();
            imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("Autorisation de quitter le territoire", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
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
        table.addCell("\nNom:\n\n");
        table.addCell("\n"+Nom+"\n");
        table.addCell("\nPrenom:\n\n");
        table.addCell("\n"+Prenom+"\n");
        table.addCell("\nGRADE :\n\n");
        table.addCell("\n"+Grade+"\n");
        table.addCell("\nADRESSE PERSONNELLE :\n\n");
        table.addCell("\n"+Adress_perso+"\n");
        table.addCell("\nAFFECTATION :\n\n");
        table.addCell("\n"+Affectation+"\n");
         
        
         cell = new PdfPCell(new Phrase("\nJ’ai  l’honneur de solliciter une autorisation  d’absence.\n\n"));
         cell.setColspan(2);
      table.addCell(cell);
         
        table.addCell("\nDU:\n\n");
        table.addCell("\n"+Du+"\n");
        table.addCell("\nAU:\n\n");
        table.addCell("\n"+Au+"\n");
        table.addCell("\nMOTIF :\n\n");
        table.addCell("\n"+Motif+"\n");
        table.addCell("\nAVIS DU  CHEF \nD’ETABLISSEMENT:\n\n");
        table.addCell("\n\n"+Avis_de_chef+"\n\n");
          cell = new PdfPCell(new Phrase("\nFait à Ouarzazate le :"+tdnow+"\n\n"));
      cell.setColspan(2);
      
      table.addCell(cell);
        table.addCell("Signature du  demandeur\n\n\n\n\n\n\n\n\n");
        table.addCell("Cachet  et  signature\n\n\n\n\n\n\n\n");
        document.add(table);
        document.close();

            
         }catch(Exception ex){
           JOptionPane.showConfirmDialog(null,"Veuillez fermer l'ancien PDF pour generer un autre ","Enregistrer",JOptionPane.CLOSED_OPTION);
         }
 }
}