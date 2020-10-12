package ch.banque.ifage.personne;

import ch.banque.ifage.infrastructure.Departement;
import ch.banque.ifage.misc.BanqueException;

public class Employe extends Personne {
	
	private int salaire;
	private Departement departement;
	private String horaire;
	
	
	
	

	public Employe(String nom, String prenom, Departement departement) throws BanqueException {
		super(nom, prenom) ;
		
	}



	public int getSalaire() {
		return salaire;
	}



	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}



	public Departement getDepartement() {
		return departement;
	}



	public void setDepartement(Departement departement) {
		this.departement = departement;
	}



	public String getHoraire() {
		return horaire;
	}



	public void setHoraire(String horaire) {
		this.horaire = horaire;
	}
}
