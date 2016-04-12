package projet;
/***********************************************************************
 * Module:  Travail.java
 * Author:  Y.T
 * Purpose: Defines the Class Travail
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

public class Travail extends Attestations {
   private int id[]={1};
   private String drpp[];
    private String text;
   private String text2;
    private String text3;
    private String text4;
    public Travail(){
    super();
     int i=0;
       String t ;
         Connection connect;
        try {
            //pour le etats de sorti
         text="   Je soussigné, Belahsen Youness, Doyen de la Faculté Polydisciplinaire de Ouarzazate  atteste que Monsieur:  \n" +
"           - NOM         :     	\n" +
"           - PRENOM :     \n" +
"           - CIN           :    \n" +
"           - D.R.P.P     :   \n" +
"           \n" +
"Exerce la fonction d’administrateur 3 éme grade  au sein de notre établissement depuis le.\n" +"\n"

                    + "      Cette attestation est délivrée à l’intéressé(e) pour servir et valoir ce que de droit.\n\n";
        text2="Le Doyen de la Faculté  Polydisciplinaire Ouarzazate :\n" +
"- Vu le Dahir  n°1.58.008 du 04 chaâbane 1377 (24 février 1958) portant statut général de la fonction publique tel qu’il a été modifié et complété.\n" +
"- Vu la demande présentée par l’intéressée.  ";
        
           text3="   Je soussigné, Belahsen Youness, Doyen de la Faculté Polydisciplinaire de Ouarzazate  atteste que Monsieur:  \n" +
"           - NOM       :     	\n" +
"           - PRENOM    :     \n" +
"           - CIN       :    \n" +
"           - D.R.P.P   :   \n" +
"           - GRADE     :   \n" +
"           \n" +
"Exerce la fonction d’enseignant chercheur au sein de notre établissement depuis le.\n" +"\n"

                    + "      Cette attestation est délivrée à l’intéressé(e) pour servir et valoir ce que de droit.\n\n";
           text4="Les autorités  sont priées de prêter aide et assistance au porteur du présent ordre de mission. ";
  
            
            
            
            
            //*******************************
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
        public void imagee(Document document)throws Exception{
          URL imageUrl = getClass().getProtectionDomain().getCodeSource().getLocation();
          System.out.println(imageUrl);
            Image image=Image.getInstance(imageUrl+"logo.png");
            image.scaleAbsolute(224,70);
            image.setAlignment(Image.MIDDLE);
            document.add(image);
            
    }
public void attestation_travail_prof(String Nom,String Prenom,String Cin,String Drpp,String Grade,String date_rec) {
          
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream("Attestation de travail Professeur "+Nom+".pdf"));
            
            document.open();
            imagee(document);
            SimpleDateFormat td = new SimpleDateFormat("dd-MM-yyyy");
            java.util.Date now = new java.util.Date();
            String tdnow = td.format(now);  
            Paragraph pa = new Paragraph("Attestation de travail", FontFactory.getFont(FontFactory.TIMES, 30, Font.UNDERLINE, BaseColor.DARK_GRAY));
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(pa);
            for(int i=0;i<3;i++){
                document.add(new Paragraph(" "));
            }
            
            Paragraph p = new Paragraph("   Je soussigné, Belahsen Youness, Doyen de la Faculté Polydisciplinaire de Ouarzazate  atteste que Monsieur:  \n" +
"           - NOM       :"+Nom+"     	\n" +
"           - PRENOM    :"+Prenom+"     \n" +
"           - CIN       :"+Cin+"    \n" +
"           - D.R.P.P   :"+Drpp+"   \n" +
"           - GRADE     :"+Grade+"   \n" +
"           \n" +
"Exerce la fonction d’enseignant chercheur au sein de notre établissement depuis le"+date_rec+".\n" +"\n"

                    + "      Cette attestation est délivrée à l’intéressé(e) pour servir et valoir ce que de droit.\n\n", FontFactory.getFont(FontFactory.TIMES, 16, Font.NORMAL, BaseColor.DARK_GRAY));
            document.add(p);
            
            Paragraph time = new Paragraph("                Fait à Ouarzazate le : "+tdnow,FontFactory.getFont(FontFactory.TIMES, 17, Font.BOLD, BaseColor.DARK_GRAY));
            Paragraph a = new Paragraph("");
            Paragraph si = new Paragraph("                 Signature:",FontFactory.getFont(FontFactory.TIMES, 17, Font.BOLD, BaseColor.DARK_GRAY));

            time.setAlignment(Paragraph.ALIGN_CENTER);
            si.setAlignment(Paragraph.ALIGN_CENTER);
            document.add(time);
            document.add(si);
            document.add(a);
            document.close();
            
             System.out.println("date2");
            /* Open Pdf */
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(new File("Attestation de travail Professeur "+Nom+".pdf"));
            } else {
                System.out.println("Open is not supported");
            }
             
             System.out.println("date");
        } catch (Exception ex) {
            
       System.out.print("Veuillez fermer votre Precedent pdf Pour Generer une Autre Fois");
        }
    }
}