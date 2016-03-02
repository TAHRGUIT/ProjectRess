package buttonProg;
/**
 *
 * @author Y.T
 */
public class INSERT {
    String SQL;
             //insertion avec les contenuTableau
         public String queryInsert(String nomTable, String[] contenuTableau) {
        int i;
             SQL = "INSERT INTO " + nomTable + " VALUES(";

        for (i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")";
        return SQL;
    }
                  //insertion au chemps specific
             public String queryInsert(String nomTable, String[] nomColonne, String[] contenuTableau) {
        int i;
        SQL = "INSERT INTO " + nomTable + "(";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i];
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += ")VALUES(";
        for (i = 0; i <= contenuTableau.length - 1; i++) {
            SQL += "'" + contenuTableau[i] + "'";
            if (i < contenuTableau.length - 1) {
                SQL += ",";
            }
        }

        SQL += ")";
        return SQL;

    }
}
