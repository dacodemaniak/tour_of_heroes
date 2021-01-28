/**
 * 
 */
package tour_of_heroes.database;

/**
 * @author Aelion
 *
 */
public class MySQLConnector {
	private static String instance;
	
	private MySQLConnector() {
		MySQLConnector.instance = "Salut, je suis l'instance de MySQLConnector";
		System.out.println("Je suis le constructeur de MySQLConnector");
	}
	
	public static String getInstance() {
		if (MySQLConnector.instance != null) {
			return MySQLConnector.instance;
		}
		
		MySQLConnector mySQLConnector = new MySQLConnector();
		return MySQLConnector.instance;
	}
}
