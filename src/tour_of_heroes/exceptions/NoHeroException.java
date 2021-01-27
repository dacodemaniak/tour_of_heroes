package tour_of_heroes.exceptions;

public class NoHeroException extends Exception {

	public NoHeroException() {
		// TODO Auto-generated constructor stub
		super("Le héro n'a pas été défini");
	}

	public NoHeroException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoHeroException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NoHeroException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoHeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
