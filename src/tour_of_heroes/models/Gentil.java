package tour_of_heroes.models;

public class Gentil extends Personnage {

	public Gentil() {
		// TODO Auto-generated constructor stub
	}

	public Gentil(String nom, int age) {
		super(nom, age);
		// TODO Auto-generated constructor stub
	}

	public Gentil(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String ditBonjour() {
		if (this.age == 0) {
			return "Bonjour, je m'appelle " + this.nom;
		}
		
		return "Bonjour, je m'appelle " + this.nom + " et j'ai " + this.age + " ans";
	}

}
