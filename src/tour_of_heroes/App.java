/**
 * 
 */
package tour_of_heroes;

import java.util.ArrayList;
import java.util.Optional;

import tour_of_heroes.collection.PersonnageRepository;
import tour_of_heroes.combat.Combat;
import tour_of_heroes.exceptions.NoFighterException;
import tour_of_heroes.exceptions.NoHeroException;
import tour_of_heroes.exceptions.NoMechantException;
import tour_of_heroes.models.Gentil;
import tour_of_heroes.models.Hybride;
import tour_of_heroes.models.Mechant;
import tour_of_heroes.models.Personnage;
import tour_of_heroes.utils.CustomDate;

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
	 * @throws Exception 
	 */
	public App() {
		PersonnageRepository personnages = new PersonnageRepository();
		
		// Tous les personnages vont dire bonjour
		for (Personnage personnage : personnages.getCollection()) {
			System.out.println(personnage.ditBonjour());
		}
	}

}
