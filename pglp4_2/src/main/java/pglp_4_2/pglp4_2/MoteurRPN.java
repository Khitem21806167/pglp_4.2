package pglp_4_2.pglp4_2;
import java.util.Stack;
import Commands.*;


public class MoteurRPN extends Interpreteur{
	
	// pile d'operandes
		private Stack<Double> pile;
	
	//Constructeur MoteurRPN qui initialise la pile 
	public MoteurRPN() {
		pile= new Stack<Double>();
	}
	//ajouter une operade op dans la pile en respectant l intervlle
	public void stockOp(double op) {
		this.Reserver(new NumberCommand(pile, op));
	}
	//appliquer l op aux deux derniers operandes
	public void appliquerOperation(Operation op) {
		this.Reserver(new OperationOfCommand(pile, op));
	}
	
	/*
	 * Methode qui retourne l'ensemble des operandes stock�es
	 * @return la chaine de caracteres representant les operandes stock�es
	 */
	public String affichage(){
		String string = "";
		for(Double val: this.pile){
			string += val + " ";
		}
		return string;
	}
	
	/*
	 * Accesseur de la pile du moteurRPN
	 */
	public int getPile(){
		return this.pile.size();
	}
	

}