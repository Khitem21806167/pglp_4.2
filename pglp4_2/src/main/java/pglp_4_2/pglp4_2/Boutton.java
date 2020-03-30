package pglp_4_2.pglp4_2;

public class Boutton {
	private boolean BtOn;
	
	public Boutton() {
		this.BtOn = true;
	}
	
	public boolean EtatOn() {
		return BtOn;
	}
	
	public void Off() {
		BtOn = false;
	}	
	
	public void On() {
		BtOn = true;
	}	
}
