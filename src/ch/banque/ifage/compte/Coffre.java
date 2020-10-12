package ch.banque.ifage.compte;

public abstract class Coffre {
	
	
	private int NumeroCoffre;
	private String lieu;
	
	
	public int getNumeroCoffre() {
		return NumeroCoffre;
	}
	public void setNumeroCoffre(int numeroCoffre) {
		NumeroCoffre = numeroCoffre;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

}
