/**
 * 
 */
package tour_of_heroes.models;

import tour_of_heroes.helpers.GameConfig;

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
	
	protected int lifePoints = 150;
	
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
	 * Setter M�thode qui permet de d�finir la valeur
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
	 * Getter M�thode qui permet de retourner la valeur
	 * d'un attribut � l'ext�rieur de la classe
	 * @return
	 */
	public String getNom() {
		return this.nom;
	}
	
	public int getLifePoints() {
		return this.lifePoints;
	}
	
	public void iLoose() {
		this.lifePoints = this.lifePoints - GameConfig.GAIN_POINT;
	}
	
	public void iWin() {
		this.lifePoints = this.lifePoints + GameConfig.GAIN_POINT;
	}
	
	public abstract String ditBonjour();
}
