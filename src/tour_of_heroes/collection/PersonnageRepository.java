/**
 * 
 */
package tour_of_heroes.collection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import tour_of_heroes.database.MySQLConnector;
import tour_of_heroes.models.Gentil;
import tour_of_heroes.models.Mechant;
import tour_of_heroes.models.Personnage;

/**
 * @author Aelion
 *
 */
public class PersonnageRepository {
	/**
	 * Collection d'objets de type Personnage et rien d'autre
	 * ArrayList<Personnage>
	 */
	private ArrayList<Personnage> collection;
	
	public PersonnageRepository() {
		this.collection = new ArrayList<Personnage>();
		
		this.hydrateCollection();
		
	}
	
	/**
	 * Retourne la collection des Personnages
	 * @return ArrayList<Personnage>
	 */
	public ArrayList<Personnage> getCollection() {
		return this.collection;
	}
	
	/**
	 * Ajoute un personnage à la collection si le personnage
	 * 	n'existe pas dans cette liste.
	 * @param Personnage personnage Personnage à ajouter
	 * @return void
	 */
	public void addPersonnage(Personnage personnage) {
		if (!this.collection.contains(personnage)) {
			this.collection.add(personnage);
		}
	}
	
	/**
	 * toString() est une méthode de la super classe Java
	 * Elle est appelée automatiquement lorsque on voudra
	 * afficher l'objet concerné. (System.out.println(this))
	 */
	@Override
	public String toString() {
		return "La collection contient : " + this.collection.size() + " éléments";
	}
	
	private void hydrateCollection() {
		Connection connection = MySQLConnector.getInstance();
		
		// Créer une requête SQL pour récupérer les personnages
		String sqlQuery = "SELECT id, nom, age, life_points, is_gentil FROM personnages;";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sqlQuery);
			
			// Parcourir le jeu de résultat pour récupérer les informations
			while (rs.next()) {
				Personnage personnage;
				
				if (rs.getInt("is_gentil") == 1) {
					personnage = new Gentil(
							rs.getString("nom"),
							rs.getInt("age")
					);
				} else {
					personnage = new Mechant(
							rs.getString("nom"),
							rs.getInt("age")
					);
				}
				this.collection.add(personnage);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
