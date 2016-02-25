package buttonProg;
/**
 *
 * @author mounir
 */
public class Update {
    String SQL;
      //update avec etat
     public String queryUpdate(String nomTable, String[] nomColonne, String[] contenuTableau, String etat) {
        int i;
        SQL = "UPDATE " + nomTable + " SET ";
        for (i = 0; i <= nomColonne.length - 1; i++) {
            SQL += nomColonne[i] + "='" + contenuTableau[i] + "'";
            if (i < nomColonne.length - 1) {
                SQL += ",";
            }
        }
        SQL += " WHERE " + etat;
        return SQL;
    }
}
