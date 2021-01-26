/**
 * 
 */
package tour_of_heroes;

import tour_of_heroes.collection.PersonnageRepository;
import tour_of_heroes.models.Gentil;
import tour_of_heroes.models.GentilAvecCostume;
import tour_of_heroes.models.Hybride;
import tour_of_heroes.models.Mechant;
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
		Personnage batman = new GentilAvecCostume("Batman", 45, "Anthracite");
		personnages.addPersonnage(batman);
		
		// Créer un autre personnage
		Personnage superman = new GentilAvecCostume("Superman", 25, "Bleu et Rouge");
		personnages.addPersonnage(superman);
		
		// Création de Joker
		Personnage joker = new Mechant("Joker", 99);
		personnages.addPersonnage(joker);
		
		// Créer IronMan
		Personnage lexluthor = new Mechant("Lex Luthor", 75);
		
		personnages.addPersonnage(lexluthor);
		personnages.addPersonnage(lexluthor);
		
		System.out.println(personnages);
		
		personnages.addPersonnage(new Gentil("ironman", 45));
		
		
		// Tous les personnages vont dire bonjour
		for (Personnage personnage : personnages.getCollection()) {
			System.out.println(personnage.ditBonjour());
		}
		

	}

}
