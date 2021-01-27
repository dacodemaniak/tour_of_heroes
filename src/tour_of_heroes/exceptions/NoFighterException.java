package tour_of_heroes.exceptions;

public class NoFighterException extends Exception {

	public NoFighterException() {
		// TODO Auto-generated constructor stub
		super("Aucun combattant n'a été défini");
	}

	public NoFighterException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoFighterException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NoFighterException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoFighterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
