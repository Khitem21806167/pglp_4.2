package Commands;
import pglp_4_2.pglp4_2.*;

public class QuitCommand implements RunCommand {
	
	private Boutton bt;
	
	public QuitCommand(Boutton bt) {
		this.bt=bt;
	}
	
	@Override
	public void run() {
		bt.Off();
	}
}
