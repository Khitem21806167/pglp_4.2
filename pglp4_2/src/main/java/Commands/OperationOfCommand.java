package Commands;
import java.util.Stack;
import pglp_4_2.pglp4_2.*;
import Exceptions.*;

public class OperationOfCommand implements WorkUndo {
	
	private double dernierChar;
	private double avantDernier;
	private Operation operation;
	private Stack<Double> pile;
	
	public OperationOfCommand(Stack<Double> pile, Operation operation) {
		Taille.TaillePile(pile.size(), 2);
		this.pile = pile;
		this.operation = operation;
	}
	
	@Override
	public void undo() {
		this.pile.pop();
		this.pile.push(avantDernier);
		this.pile.push(dernierChar);
	}

	@Override
	public void run() {
		double resultat;
		this.dernierChar = this.pile.pop();
		this.avantDernier = this.pile.pop();
		try {
			resultat = operation.eval(avantDernier, dernierChar);
			Taille.MinMax(resultat);
			this.pile.push(resultat);
		}
		catch (ArithmeticException e) {
			this.pile.push(avantDernier);
			this.pile.push(dernierChar);
			throw e;
		}
	}
	
	


}
