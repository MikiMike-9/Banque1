package ch.banque.ifage.compte;

import ch.banque.ifage.misc.BanqueException;

public class Compte {

	private int solde;
	private String typeCompte;
	private int NumeroCompte;
	//private Compte compte;
	
	public int getSolde() {
		return solde;
	}
	public void setSolde(int solde) {
		this.solde = solde;
	}
	public String getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}
	public int getNumeroCompte() {
		return NumeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		NumeroCompte = numeroCompte;
	}
	
	public Compte (int numeroCompte) throws BanqueException {
		
		if (numeroCompte <= 0) {
			this.NumeroCompte = numeroCompte;
		}
		if (numeroCompte > 000001) {
			this.NumeroCompte = numeroCompte;
		}
		else {
			throw new BanqueException("Numero de compte invalide");
		}
		
	public int retirer(int montant) {
		setSolde(solde - montant);
		System.out.println("La somme de" + montant + "CHF a ete retirer");
		return (montant);
		}
	public int deposer(int montant) {
		setSolde(montant + solde);
		System.out.println("La somme de" + montant + "CHF a ete deposer");
		return (solde);
		
	}
	Compte cpXavier = new Compte(1234);
	}
	
	
	}
	
	
	
		
	
	
		
	
	
	
	

