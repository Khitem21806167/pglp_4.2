package Exceptions;

public class ErreurSaisieException extends IllegalArgumentException {

	public ErreurSaisieException() {
		super("Erreur de saisie.");
	}
}
