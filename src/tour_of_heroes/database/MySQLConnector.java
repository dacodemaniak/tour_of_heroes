/**
 * 
 */
package tour_of_heroes.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

/**
 * @author Aelion
 *
 */
public class MySQLConnector {
	private static Connection instance;
	
	private MySQLConnector() {
		DatabaseCredentials databaseCredentials = new DatabaseCredentials();
		Optional<Properties> oProperties = databaseCredentials.readCredentials();
		
		String dsn = "jdbc:" + oProperties.get().getProperty("type") + "://" +
				oProperties.get().getProperty("server_ip") + ":" +
				oProperties.get().getProperty("server_port") + "/" +
				oProperties.get().getProperty("database");
		// jdbc:mysql://127.0.0.1:3306/fighter_repo
		
		// Charger le driver spécifique
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Récupérer la connexion
		try {
			MySQLConnector.instance = DriverManager.getConnection(
					dsn,
					oProperties.get().getProperty("user"),
					oProperties.get().getProperty("user_password")
			);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getInstance() {
		if (MySQLConnector.instance != null) {
			return MySQLConnector.instance;
		}
		
		MySQLConnector mySQLConnector = new MySQLConnector();
		return MySQLConnector.instance;
	}
}
