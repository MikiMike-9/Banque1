package ch.banque.ifage.personne;

import ch.banque.ifage.infrastructure.Departement;
import ch.banque.ifage.misc.BanqueException;

public abstract class Personne {
	
	private String nom;
	private String prenom;
	private Adresse adresse;
	private String email;
	private Departement departement;
	
	/*private Personne() {
		System.out.println("Vous etes dans Personne") ;
	}*/
	
	public Personne(String nom, String prenom ) throws BanqueException {
		
		
		if((nom == null) && (prenom == null)) {
			throw new BanqueException("Nom et/ou Prenom invalide");
		}
		
		if ((nom.trim().length () > 1) && (prenom.trim().length() > 1 )) {
			this.nom = nom;
			this.prenom = prenom;
	}
		else {
				throw new BanqueException("Nom et/ou Prenom invalide");
				
		}
		
		}
	public Personne(String nom, String prenom, Adresse adresse, Departement departement) throws BanqueException {
		this(nom, prenom);
		this.adresse = adresse;
		this.departement = departement;
	}
	
		
	
	
	public void afficheNoms() {
		System.out.println(this.nom + " " + this.prenom);
	}
	
	/*public void setNom(String nom) {
		if (nom.trim().length() > 1) {
			this.nom = nom;
		}
		else {
		System.out.println("Modification refusee. Nom invalide";)
				
		}
	}*/
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	
		
	

}
