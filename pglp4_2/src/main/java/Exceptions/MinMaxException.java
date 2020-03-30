package Exceptions;

public class MinMaxException extends ArithmeticException{
	 
		public MinMaxException() {
			super("Valeur absolue trop grande pour être gérée");
		}

}
