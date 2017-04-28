package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesBDD {

	protected static Connection getConnection() {
		Connection cnx = null;
		String url = "jdbc:mysql://localhost/dynAffichage";
		String login = "root";
		String password = "formation";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url, login, password);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return cnx;
	}

	public boolean identification(String login, String motDePasse) {
		Connection cnx;
		cnx = getConnection();
		ResultSet rs = null;
		PreparedStatement statement;
		String password;
		boolean validation = false;
		try {
			statement = cnx.prepareStatement("select * from user where identifiant=? ");
			statement.setString(1, login);
			rs = statement.executeQuery();
			rs.next();
			password = rs.getString("motDePasse");
			if (password.equals(motDePasse)) {
				validation = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return validation;
	}

}
