package Exceptions;

public class DivisionparZeroException  extends ArithmeticException {

	public DivisionparZeroException() {
		super("ERREUR : Impossible la Division par zero, si vous voulez quitter tapez (exit). ");
	}
}
