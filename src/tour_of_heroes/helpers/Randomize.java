/**
 * 
 */
package tour_of_heroes.helpers;

import java.util.Random;

/**
 * @author Aelion
 *
 */
public class Randomize {
	public final static Random RANDOM = new Random();
	
	public static int getRandom(int min, int max) {
		Random random = new Random();
		return min + random.nextInt(max - min);
	}
}