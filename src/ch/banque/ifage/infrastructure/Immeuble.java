package ch.banque.ifage.infrastructure;

public class Immeuble {

	private Adresse adresse;
	private String nomBatiment;
	
	
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public String getNomBatiment() {
		return nomBatiment;
	}
	public void setNomBatiment(String nomBatiment) {
		this.nomBatiment = nomBatiment;
	}
	
}
