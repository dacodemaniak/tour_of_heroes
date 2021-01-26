/**
 * 
 */
package tour_of_heroes.models;

/**
 * @author Aelion
 *
 */
public final class Mechant extends Personnage {

	/**
	 * 
	 */
	public Mechant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param age
	 */
	public Mechant(String nom, int age) {
		super(nom, age);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 */
	public Mechant(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	public String ditBonjour() {
		if (this.age == 0) {
			return "Salut moi, c'est " + this.nom;
		}
		
		return "Salut moi, c'est " + this.nom + " et j'ai " + this.age + " ans";
	}

}
