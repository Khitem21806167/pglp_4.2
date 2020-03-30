package Exceptions;

public class PileVideException extends IllegalArgumentException {
	
	 // Constructeur de l'exception PileVideEXception
	public PileVideException() {
		super("Pas assez d'éléments dans la pile pour cette opération");
	}

}
