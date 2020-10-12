package ch.banque.ifage.personne;

import ch.banque.ifage.compte.Coffre;
import ch.banque.ifage.compte.Compte;
import ch.banque.ifage.misc.BanqueException;

public class Client extends Personne {
	
	private Compte compte;
	private String coffre;

	
	
	
	public Client(String nom, String prenom ) throws BanqueException {
		super(nom, prenom);
	
	}


	public Compte getCompte() {
		return compte;
	}


	public void setCompte(Compte compte) {
		this.compte = compte;
	}


	public String getCoffre() {
		return coffre;
	}


	public void setCoffre(String coffre) {
		this.coffre = coffre;
	}
	
	
	//public Client emprunter(int montant) {
		//setCompte(compte - montant);
		//System.out.println("La somme de" + montant + "CHF a ete emprunter");
		//return (montant);
	
	
	/*public void transferer(int montant, Compte compte1, Compte compte2) throws BanqueException {
		compte1.retirer(montant);
		compte2.deposer(montant);
		System.out.println(montant + "CHF a bien ete transferer du compte" + compte1.getNumeroCompte);
	}*/
	Client x = new Client("Xavier", "Renaud");
	
	x.setCompte(cpXavier); 


}
		
	
		
	
	
		
	
	
	
	
	

