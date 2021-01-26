/**
 * 
 */
package tour_of_heroes;

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
		// Créer un premier personnage
		Personnage batman = new Personnage("Batman", 45);
		batman.isMechant(false);
		
		// Créer un autre personnage
		Personnage superman = new Personnage("Superman", 25);
		superman.isMechant(false);
		
		// Création de Joker
		Personnage joker = new Personnage("Joker", 99);
		joker.isMechant(true);
		
		// Créer IronMan
		Personnage ironman = new Personnage("Ironman", 35);
		ironman.isMechant(false);
		
		// Les personnages vont dire bonjour
		System.out.println(batman.ditBonjour());
		System.out.println(superman.ditBonjour());
		System.out.println(joker.ditBonjour());
	}

}
