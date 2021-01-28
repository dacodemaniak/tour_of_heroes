/**
 * 
 */
package tour_of_heroes.combat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

import tour_of_heroes.exceptions.NoFighterException;
import tour_of_heroes.exceptions.NoHeroException;
import tour_of_heroes.exceptions.NoMechantException;
import tour_of_heroes.helpers.Randomize;
import tour_of_heroes.models.Personnage;
import tour_of_heroes.utils.CustomDate;

/**
 * @author Aelion
 *
 */
public final class Combat {
	private Personnage hero;
	private Personnage mechant;
	
	private String date;
	
	private Personnage winner;
	private Personnage looser;
	
	public Combat() {
		CustomDate date = new CustomDate();
		this.date = date.asString();
	}
	
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
	
	public String getDate() {
		return this.date;
	}
	
	public void run() throws Exception  {
		if (this.mechant != null && this.hero != null) {
			int result = Randomize.getRandom(0, 3);
			
			System.out.println("Résultat : " + result);
			
			if (result == 1) { // Le gentil gagne
				this.hero.iWin();
				this.mechant.iLoose();
				this.winner = this.hero;
				this.looser = this.mechant;
			} else if (result == 2) { // Le méchant gagne
				this.hero.iLoose();
				this.mechant.iWin();
				this.looser = this.hero;
				this.winner = this.mechant;
			}
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
	
	public Optional<ArrayList<Personnage>> getResult() {
		ArrayList<Personnage> results = null;
		System.out.println(winner != null ? "Un combat" : "Pas de combat");
		if (winner != null) {
			results = new ArrayList<Personnage>();
			results.add(winner);
			results.add(looser);
			return Optional.of(results);
		}
		return Optional.empty();
		
	}
}
