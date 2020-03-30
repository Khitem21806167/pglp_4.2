package pglp_4_2.pglp4_2;

public enum CalculatriceRPN {
	CALCULATOR;
	
	public void run( String[] args) {
		SaisieRPN saisie = new SaisieRPN();
		saisie.saisie();
	}
	
	public static void main( String[] args ) {
		CALCULATOR.run(args);
		
	}
}