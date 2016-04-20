package projet;
/***********************************************************************
 * Module:  OrdreDeMission.java
 * Author:  Y.T
 * Purpose: Defines the Class OrdreDeMission
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

public class OrdreDeMission extends Attestations {
   private int id[];
   
   protected String missiona[];
   protected String objetdelamission[];
   protected String moyendetransport[];
   protected String du[];
   protected String au[];
   private String text4;
   public  OrdreDeMission(){
       super();
       text4="Les autorités  sont priées de prêter aide et assistance au porteur du présent ordre de mission. ";
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
           JOptionPane.showConfirmDialog(null,"Ereur a la base de donnee","Erreur",JOptionPane.CLOSED_OPTION);
        }
        
   }
           public void imagee(Document document)throws Exception{
            Image image=Image.getInstance("logo.png");
            image.scaleAbsolute(224,70);
            image.setAlignment(Image.MIDDLE);
            document.add(image);
            
    }
   public void ordre_mission(String Nom,String Prenom,String Grade,String mission_a,String Objet,String Moyen_tr,String du,String au,String autre,String url){
   Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Ordre de Mission de "+Nom+".pdf"));
//              System.out.println("lol");
//             
//                  Image img = Image.getInstance("atte.png");
//           img.scaleAbsolute(100,300);
//          img.setAlignment(Image.ALIGN_RIGHT);
//          document.add(img);
          
            document.open();
           imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("Ordre de Mission", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(pa);
          
                document.add(new Paragraph(" "));
            
            Paragraph param = new Paragraph("Le Doyen de la Faculté Polydisciplinaire de Ouarzazate\n\n", FontFactory.getFont(FontFactory.TIMES, 18, Font.NORMAL, BaseColor.DARK_GRAY));
                                   param.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(param);
            
      PdfPTable table = new PdfPTable(5);
       PdfPCell cell=new PdfPCell();
      //contenu du tableau.
        table.addCell("\nOrdonne à M.\n\n");
         cell = new PdfPCell(new Phrase("\n "+Nom+" "+Prenom+"\n\n"));
         cell.setColspan(4);
      table.addCell(cell);
      
          table.addCell("\nGrade\n\n");
         cell = new PdfPCell(new Phrase("\n"+Grade+" \n\n"));
         cell.setColspan(4);
      table.addCell(cell);
      
      table.addCell("\nDe se rendre en mission à\n\n");
         cell = new PdfPCell(new Phrase("\n"+mission_a+" \n\n"));
         cell.setColspan(4);
      table.addCell(cell);
      
       table.addCell("\nObjet de la mission \n\n");
         cell = new PdfPCell(new Phrase("\n"+Objet+" \n\n"));
         cell.setColspan(4);
      table.addCell(cell);
      
      
                  cell = new PdfPCell(new Phrase("\n\nMoyen de transport\n"));
      cell.setRowspan(2);
      table.addCell(cell);
        table.addCell("\n Train\n\n");
        table.addCell("\nAvion\n\n");
        table.addCell("\nVéhicule de service\n\n");
        table.addCell("\nAutres\n\n");
       switch (Moyen_tr) {
           case "Train":
               table.addCell("\n****\n\n");
               table.addCell("\n\n\n");
               table.addCell("\n\n\n");
               table.addCell("\n\n\n");
               System.out.println("train");
               break;
           case "Avion":
               table.addCell("\n\n\n");
               table.addCell("\n***\n");
               table.addCell("\n\n\n");
               table.addCell("\n\n\n");
               System.out.println("Avion");
               break;
           case "Véhicule de service":
               table.addCell("\n\n\n");
               table.addCell("\n\n\n");
               table.addCell("\n***\n");
               table.addCell("\n\n\n");
               System.out.println("Véhicule de service");
               break;
           case "Autre":
               table.addCell("\n\n\n");
               table.addCell("\n\n\n");
               table.addCell("\n\n\n");
               table.addCell("\n"+autre+"\n");
               System.out.println("Autre");
               break;
           
               
       }
  
         // cell = new PdfPCell(new Phrase("\nFait à Ouarzazate le :"+tdnow+"\n\n"));
     // cell.setColspan(2);
      
    //  table.addCell(cell);
       // table.addCell("Signature du  demandeur\n\n\n\n\n\n\n\n\n");
       // table.addCell("Cachet  et  signature\n\n\n\n\n\n\n\n");
       
        table.addCell("\nDate de départ\n\n");
         cell = new PdfPCell(new Phrase("\n "+du+"\n\n"));
         cell.setColspan(4);
            table.addCell(cell);
          table.addCell("\nDate de retour\n\n");
         cell = new PdfPCell(new Phrase("\n"+au+" \n\n"));
         cell.setColspan(4);
      table.addCell(cell);
        document.add(table);
       Paragraph para = new Paragraph(text4+"\n", FontFactory.getFont(FontFactory.TIMES, 15, Font.NORMAL, BaseColor.DARK_GRAY));
document.add(para);
 Paragraph time = new Paragraph("                Fait à Ouarzazate le : "+tdnow,FontFactory.getFont(FontFactory.TIMES, 14, Font.BOLD, BaseColor.DARK_GRAY));
                       time.setAlignment(Paragraph.ALIGN_CENTER);
 document.add(time);

                document.add(new Paragraph(" "));
            
             PdfPTable table3 = new PdfPTable(2);
       PdfPCell cell3=new PdfPCell();
      //contenu du tableau.
      cell3 = new PdfPCell(new Phrase("                                                    Signature :"));
      cell3.setColspan(2);
      table3.addCell(cell3);
        table3.addCell("\nChef de departement / Secrétaire général :\n\n");
        table3.addCell("\nDoyen\n");
        table3.addCell("\n\n\n\n\n\n");
        table3.addCell("\n\n\n\n\n\n");
            document.add(table3);
     /* Open Pdf */
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("Ordre de Mission de "+Nom+".pdf"));
            } else {
                System.out.println("Open is not supported");
            }
        document.close();

            
         
        }catch(Exception ex){
           JOptionPane.showConfirmDialog(null,"Veuillez fermer l'ancien PDF pour generer un autre ","Enregistrer",JOptionPane.CLOSED_OPTION);

 }
 }
  
}