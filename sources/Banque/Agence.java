/**
 * 
 * TD1- Modélisation Orientée Objet d'une application de gestion 
 * de comptes bancaire 
 * @author tewfik
 * 
 */

package Banque;

import DAB.Distributeur;

/**
 * Cette class modélise le concept de banque.
 * Elle joue le role d'interface avec 
 * le guichetier de la banque
 * @author tewfik
  */
public class Agence {
	
	/*
	 * max : nombre maximum d'élément dans un tableau.
	 */
	static final int max= 50;
	
	/*
	 * nbComptes : nombre de comptes gérés par la banque
	 */
	protected int nbComptes = 0;
	
	/*
	 * nbClients : nombre de clients gérés par la banque.
	 */
	protected int nbClients = 0;

	/**
	 * 
	 * @uml.property name="lesComptes"
	 * @uml.associationEnd 
	 * @uml.property name="lesComptes" multiplicity="(0 -1)"
	 */
	/*
	 * un tableau contenant l'ensemble de comptes. 
	 */
	protected Compte[] lesComptes;

	/**
	 * 
	 * @uml.property name="lesClients"
	 * @uml.associationEnd 
	 * @uml.property name="lesClients" multiplicity="(0 -1)"
	 */
	/*
	 * un tableau contenant l'ensemble de clients. 
	 */
	protected Client[] lesClients;

 
	
	
	/*
	 * le constructur 
	 */
	public Agence(){
		lesComptes = new Compte[max];
		lesClients = new Client[max];
	}
	
	
	
	
	/**
	 * ajouter un objet compte dans le tableau de comptes
	 * @param cpt
	 */
	
	public void addCompte(Compte cpt){
		
	    this.lesComptes[nbComptes]=cpt;
	    nbComptes++;
	}
	
	
	/**
	 * ajoute un objet client dans le tableau de clients
	 * @param cl
	 */
	public void addClient(Client cl){
	   this.lesClients[nbClients] = cl;
	   nbClients++;
	}
	
	
	
	/**
	 * Cette méthode propose la fontionnalité d'ouverture 
	 * d'un nouveau compte
	 * @param nom_client
	 * @param adresse
	 * @param montant_initial
	 */
	
	
	
	
	
	
	
	/**
	 * Seulement pour lancer qlq tests.
	 * @param args
	 */
	
	
}
