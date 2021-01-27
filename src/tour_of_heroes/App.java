/**
 * 
 */
package tour_of_heroes;

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
		
		// Créer un premier personnage
		Personnage batman = new Gentil("Batman", 45);
		personnages.addPersonnage(batman);
		
		// Créer un autre personnage
		Personnage superman = new Gentil("Superman", 25);
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
		
		Combat combat = new Combat()
				.hero(batman)
				.mechant(lexluthor);
		


		try {
			combat.run();
		} catch (NoFighterException e) {
			combat.hero(superman);
			combat.mechant(joker);
		} catch (NoMechantException e) {
			combat.mechant(lexluthor);
		} catch (NoHeroException e) {
			combat.hero(superman);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(
				combat.hero().getNom() + 
				" combat " + 
				combat.mechant().getNom()
				+ " Le " +
				combat.getDate()
		);
		/**
		 * Old school :
		 * Combat combat = new Combat();
		 * combat.hero(batman);
		 * combat.mechant(lexluthor);
		 */
		CustomDate uneDateDefinie = new CustomDate("yyyy-MM-dd", "dd-MM-Y");
		uneDateDefinie.setDate("1968-04-30");
		System.out.println("I was born at " + uneDateDefinie.asString() + " [" + uneDateDefinie.getDate() + "]");
	}

}
