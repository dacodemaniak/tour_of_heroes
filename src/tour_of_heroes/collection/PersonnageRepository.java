/**
 * 
 */
package tour_of_heroes.collection;

import java.util.ArrayList;
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
}
