package ch.banque.ifage.infrastructure;

public class Etablissement {
	
	private String nom;
	private Immeuble immeuble;
	private Adresse adresse;
	
	
	public Immeuble getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Immeuble immeuble) {
		this.immeuble = immeuble;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	

}
