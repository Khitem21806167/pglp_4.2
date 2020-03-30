package Commands;
import java.util.Stack;
import Exceptions.*;
import pglp_4_2.pglp4_2.*;

public class UndoCommand implements RunCommand {

		private WorkUndo commande;
		public UndoCommand(Stack<WorkUndo> historique) {
			Taille.TaillePile(historique.size(), 1);
			this.commande = historique.pop();
		}

		@Override
		public void run() {
			commande.undo();		
		}
	
}
