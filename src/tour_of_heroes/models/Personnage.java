/**
 * 
 */
package tour_of_heroes.models;

/**
 * @author Aelion
 *
 */
public class Personnage {
	/**
	 * Nom du personnage
	 */
	private String nom;
	
	/**
	 * Age du personnage
	 */
	private int age;
	
	
	public Personnage() {}
	
	/**
	 * Constructeur de Personnage
	 * @param nom
	 * @param age
	 */
	public Personnage(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public Personnage(String nom) {
		this.nom = nom;
	}
	
	/**
	 * Setter Méthode qui permet de définir la valeur
	 * 	d'un attribut
	 * @param nomDuPersonnage
	 */
	public void setNom(String nom) {
		if (this.nom == "" || this.nom == null) {
			this.nom = nom;
		}
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// your logic here !
		this.age = age;
	}

	/**
	 * Getter Méthode qui permet de retourner la valeur
	 * d'un attribut à l'extérieur de la classe
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}
	
	public String ditBonjour() {
		if (this.age == 0) {
			return "Bonjour, je m'appelle " + this.nom;
		}
		
		return "Bonjour, je m'appelle " + this.nom + " et j'ai " + this.age + " ans";
	}
}
