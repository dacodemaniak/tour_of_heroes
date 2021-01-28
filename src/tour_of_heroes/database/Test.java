package tour_of_heroes.database;

import java.sql.Connection;
import java.util.Optional;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseCredentials databaseCredentials = new DatabaseCredentials();
		Optional<Properties> oProperties = databaseCredentials.readCredentials();
		Properties properties = oProperties.get();
		System.out.println(properties.getProperty("type"));
		
		// Essayer d'instancier la classe MySQLConnector
		Connection instance = MySQLConnector.getInstance();
		System.out.println(instance); // Attendu 2 messages dans la console
		
		System.out.println("On réessaye");
		Connection autreInstance = MySQLConnector.getInstance();
		System.out.println(autreInstance); // Attendu 1 message dans la console
	}

}
