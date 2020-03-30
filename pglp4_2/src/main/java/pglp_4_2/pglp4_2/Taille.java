package pglp_4_2.pglp4_2;
import Exceptions.*;

public class Taille {

	private static final double MIN_VALUE = -100000.0;
	private static final double MAX_VALUE = 100000.0;

	
	public void MinMax(double valeur)throws ValeurLimiteException{
		if(Math.abs(valeur)>MAX_VALUE) throw new ValeurLimiteException();
		if(Math.abs(valeur)<MIN_VALUE) throw new ValeurLimiteException();
	}
	
	public static void TaillePile(int actualSize, int wantedSize) throws PileVideException {
		if(actualSize < wantedSize) {
			throw new PileVideException();
		}
	}
	
}
