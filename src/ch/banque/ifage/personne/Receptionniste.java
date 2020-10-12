package ch.banque.ifage.personne;

import ch.banque.ifage.infrastructure.Departement;
import ch.banque.ifage.misc.BanqueException;

public final class Receptionniste extends Employe {

	public Receptionniste(String nom, String prenom, Departement departement) throws BanqueException {
		super(nom, prenom, departement);
	
	}

}
