/**
 * 
 */
package tour_of_heroes.models;

/**
 * @author Aelion
 *
 */
public abstract class Personnage {
	/**
	 * Nom du personnage
	 */
	protected String nom;
	
	/**
	 * Age du personnage
	 */
	protected int age;
	
	
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
	
	public abstract String ditBonjour();
}
