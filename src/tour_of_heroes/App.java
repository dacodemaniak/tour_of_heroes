/**
 * 
 */
package tour_of_heroes;

import tour_of_heroes.collection.PersonnageRepository;
import tour_of_heroes.models.Personnage;

/**
 * @author Aelion
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java !");
		
		// Créer une instance de la classe App
		App monApplication = new App();
	}

	/**
	 * Constructeur de la classe App
	 * Exécuté automatiquement lors de la création
	 * d'un objet de type App
	 */
	public App() {
		PersonnageRepository personnages = new PersonnageRepository();
		
		// Créer un premier personnage
		Personnage batman = new Personnage("Batman", 45);
		personnages.addPersonnage(batman);
		
		// Créer un autre personnage
		Personnage superman = new Personnage("Superman", 25);
		personnages.addPersonnage(superman);
		
		// Création de Joker
		Personnage joker = new Personnage("Joker", 99);
		personnages.addPersonnage(joker);
		
		// Créer IronMan
		Personnage ironman = new Personnage("Ironman", 35);
		
		personnages.addPersonnage(ironman);
		personnages.addPersonnage(ironman);
		
		System.out.println(personnages);
		
		// Tous les personnages vont dire bonjour
		for (Personnage personnage : personnages.getCollection()) {
			System.out.println(personnage.ditBonjour());
		}
	}

}
