package tour_of_heroes.exceptions;

public class NoMechantException extends Exception {

	public NoMechantException() {
		// TODO Auto-generated constructor stub
		super("Le méchant n'a pas été défini");
	}

	public NoMechantException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NoMechantException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NoMechantException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NoMechantException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
