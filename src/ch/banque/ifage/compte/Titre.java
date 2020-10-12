package ch.banque.ifage.compte;

public class Titre extends Coffre {
	
	private int montant;
	private String entreprise;
	
	
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public String getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

}
