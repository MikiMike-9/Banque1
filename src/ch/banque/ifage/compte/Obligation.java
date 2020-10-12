package ch.banque.ifage.compte;

public class Obligation extends Titre{
	
	private int tauxInteret;
	private String maturité;
	
	
	public int getTauxInteret() {
		return tauxInteret;
	}
	public void setTauxInteret(int tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	

}
