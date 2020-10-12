package ch.banque.ifage.personne;

import ch.banque.ifage.infrastructure.Departement;
import ch.banque.ifage.misc.BanqueException;

public final class Banquier extends Employe {

	private String bureau;
	
	
	public String getBureau() {
		return bureau;
	}


	public void setBureau(String bureau) {
		this.bureau = bureau;
	}


	public Banquier(String nom, String prenom, Departement departement) throws BanqueException {
		super(nom, prenom, departement);
		
	}
	
	
	


}
