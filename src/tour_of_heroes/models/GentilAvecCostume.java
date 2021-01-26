/**
 * 
 */
package tour_of_heroes.models;

/**
 * @author Aelion
 *
 */
public class GentilAvecCostume extends Gentil {
	private String couleur;
	
	/**
	 * 
	 */
	public GentilAvecCostume(String nom, int age, String couleur) {
		// TODO Auto-generated constructor stub
		super(nom, age);
		
		this.couleur = couleur;
	}

	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String ditBonjour() {
		String bonjourFromParent = super.ditBonjour();
		return bonjourFromParent + "\n" + " Mon costume est : " + this.couleur;
	}
}
