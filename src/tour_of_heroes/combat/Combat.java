/**
 * 
 */
package tour_of_heroes.combat;

import tour_of_heroes.exceptions.NoFighterException;
import tour_of_heroes.exceptions.NoHeroException;
import tour_of_heroes.exceptions.NoMechantException;
import tour_of_heroes.helpers.Randomize;
import tour_of_heroes.models.Personnage;

/**
 * @author Aelion
 *
 */
public final class Combat {
	private Personnage hero;
	private Personnage mechant;
	
	public Combat hero(Personnage personnage) {
		this.hero = personnage;
		return this;
	}
	
	public void setHero(Personnage personnage) {
		this.hero = personnage;
	}
	
	public Personnage hero() {
		return this.hero;
	}
	
	public Combat mechant(Personnage personnage) {
		this.mechant = personnage;
		return this;
	}
	
	public Personnage mechant() {
		return this.mechant;
	}
	
	public void run() throws Exception  {
		if (this.mechant != null && this.hero != null) {
			int result = Randomize.getRandom(0, 3);
			System.out.println("Résultat : " + result);
		} else {
			if (this.mechant == null && this.hero == null) {
				throw new NoFighterException();
			} else if (this.mechant == null) {
				throw new NoMechantException();
			} else {
				throw new NoHeroException();
			}
		}
	}
}
