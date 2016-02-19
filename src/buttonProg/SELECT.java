/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonProg;

import java.sql.ResultSet;

/**
 *
 * @author Y.T
 */
public class SELECT {
    private String SQL;
      public String querySelectAll(String nomTable) {
        SQL = "SELECT * FROM " + nomTable;
        System.out.println(SQL);
        return SQL;
    }
      public String querySelectAll(String nomTable, String etat) {

        SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
        return SQL;

    }
      
         //selection plusieur champs
       public String querySelect(String[] nomColonne, String nomTable) {

            int i;
        SQL = "SELECT ";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += " FROM " + nomTable;
        return SQL;

    }
              // selection avec condition et nom des table
         public String fcSelectCommand(String[] nomColonne, String nomTable, String etat) {

        int i;
        SQL = "SELECT ";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }

        SQL += " FROM " + nomTable + " WHERE " + etat;
        return SQL;

    }

}
