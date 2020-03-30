package Exceptions;

public class ValeurLimiteException extends ArithmeticException {
	
	 // Constructeur de l'exception ValeurLimiteException
	 
	public ValeurLimiteException() {
		super("ERREUR : la valeur de votre operande est pas supportable par votre calculatrice, si vous voulez quitter tapez (exit).");
	}


}
