
/**
 * @author tewfik
 *
 * 
 */

package Banque;

/**
 * 
 * Cette classe modélise le concept de compte.
 * @author tewfik
 *
 * 
 */

public class Compte {

	
	/*
	 * l'identifiant du compte
	 */
	protected int id_compte;

	
	/*
	 * le solde courant de compte
	 */
	protected double solde;


	/*
	 * Une référence vers un objet client représentant
	 * le prop du compte.
	 */
	protected Client proprietaire;

	
	
	/*
	 * Contrcuteur.
	 */
	public Compte(int id, double montant_initial){
		id_compte = id;
		solde = montant_initial;
		
		}
	
	/**
	 * Débiter le compte.
	 * @param montant
	 */
	public void debiter(double montant){
	  solde = solde-montant;
	}
	
	/**
	 * créditer le compte
	 * @param montant
	 */
	public void crediter(double montant){
		  solde = solde+montant;
		}

	/**
	 * @return Returns the proprietaire.
	 * 
	 * @uml.property name="proprietaire"
	 */
	public Client getProprietaire() {
		return proprietaire;
	}

	/**
	 * @param proprietaire The proprietaire to set.
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	/**
	 * @return Returns the solde.
	 * 
	 * @uml.property name="solde"
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * @param solde The solde to set.
	 * 
	 * @uml.property name="solde"
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * @return Returns the id_compte.
	 * 
	 * @uml.property name="id_compte"
	 */
	public int getId_compte() {
		return id_compte;
	}

}
