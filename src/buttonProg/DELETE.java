package buttonProg;

public class DELETE {
       String SQL;
    //vider la table
     public String queryDelete(String nomtable) {
        SQL = "DELETE FROM " + nomtable;
        return SQL;
    }
     //supprimer un chemps avec etat
         public String queryDelete(String nomTable, String etat) {
             
        SQL = "DELETE FROM " + nomTable + " WHERE " + etat;
        
        return SQL;

    }
}
