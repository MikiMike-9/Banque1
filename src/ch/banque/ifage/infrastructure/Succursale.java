package ch.banque.ifage.infrastructure;

public class Succursale {

	private Adresse adresse;
	private Immeuble immeuble;
	private String nom;
	
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Immeuble getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Immeuble immeuble) {
		this.immeuble = immeuble;
	}
	
}
