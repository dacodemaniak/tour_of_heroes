/**
 * 
 */
package tour_of_heroes.jl.models;

/**
 * @author Aelion
 *
 */
public class Personnage {
	public String nom;
	public int age;
	
	public Personnage(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String ditBonjour() {
		return "Hola, soy " + this.nom + " (" + this.age + ")";
	}
}
