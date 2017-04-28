package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DonneeAffichage {
	
	java.sql.Connection cnx;
	
	public DonneeAffichage() {
		this.cnx= AccesBDD.getConnection();
	}
	
	public boolean AjouterAffichage(String nomAffichage, String cheminFichier, String nomFichier, String commentaire){
		PreparedStatement statement;
		Boolean verif = false;
		

		try {
			statement = cnx.prepareStatement("INSERT INTO content (nomAffichage,cheminFichier,nomFichier,commentaire,active) values (?,?,?,?,?)");
			statement.setString(1,nomAffichage);
			statement.setString(2,cheminFichier);
			statement.setString(3,nomFichier);
			statement.setString(4,commentaire);
			statement.setInt(5,0);
			
			statement.executeUpdate();
			verif= true;

			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return verif;
	}
}
