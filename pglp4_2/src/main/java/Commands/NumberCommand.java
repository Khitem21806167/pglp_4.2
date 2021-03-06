package Commands;
import pglp_4_2.pglp4_2.*;
import java.util.Stack;


public class NumberCommand implements WorkUndo {
	
	private double nb;
	private Stack<Double> pile;
	
	public NumberCommand(Stack<Double> pile, double nb) {
		this.pile = pile;
		this.nb = nb;		
	}
	
	@Override
	public void run() {
		Taille.MinMax(nb);
		this.pile.push(nb);
	}
	
	@Override
	public void undo() {
		this.pile.pop();
	}

}
