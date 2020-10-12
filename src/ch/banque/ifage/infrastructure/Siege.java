package ch.banque.ifage.infrastructure;

public class Siege {
	
	private Immeuble immeuble;
	private String nom;
	private Succursale succursale;
	private Adresse adresse;
	
	
	public Immeuble getImmeuble() {
		return immeuble;
	}
	public void setImmeuble(Immeuble immeuble) {
		this.immeuble = immeuble;
	}
	public Succursale getSuccursale() {
		return succursale;
	}
	public void setSuccursale(Succursale succursale) {
		this.succursale = succursale;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	

}
