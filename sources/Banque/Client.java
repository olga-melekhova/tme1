/*
 * Created on 21 sept. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package Banque;

import DAB.CarteBancaire;

/**
 * 
 * @author tewfik
 *
 * cette classe est la modélisation du concept d'un client.
 * Toutes les informations associées à un client sont définies 
 * comme des attributs de la classe.
 */

public class Client {

	/**
	 * 
	 * @uml.property name="id_client"
	 */
	/*
	 * id_Client : identifiant du client.
	 */
	protected int id_client;

	
	/*
	 * nb_comptes : le nombre de comptes
	 */
	protected int nb_comptes =0;

	/**
	 * 
	 * @uml.property name="nom_client"
	 */
	/*
	 * nom_client : le nom du client
	 */

	protected String nom_client;

	/**
	 * 
	 * @uml.property name="adresse_client"
	 */
	/*
	 * adresse_client.
	 */
	protected String adresse_client;


	/**
	 * 
	 * @uml.property name="comptesDeClient"
	 * @uml.associationEnd 
	 * @uml.property name="comptesDeClient" multiplicity="(0 -1)" inverse="proprietaire:domaineBancaire.Compte"
	 */
	/*
	 * Un tableau de comptes appartiennent au client.
	 */
	private Compte[] comptesDeClient;

	
	private CarteBancaire carte;
	
	
	/**
	 * ajouter un objet compte au tableau de comptes.
	 * @param cpt
	 */
	
	public void addCompte(Compte cpt){
		
	this.comptesDeClient[nb_comptes]=cpt;
	this.nb_comptes++;
	}

	/**
	 * @return Returns the adresse_client.
	 * 
	 * @uml.property name="adresse_client"
	 */
	public String getAdresse_client() {
		return this.adresse_client;
	}

	/**
	 * @param adresse_client The adresse_client to set.
	 * 
	 * @uml.property name="adresse_client"
	 */
	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}


	/**
	 * @return Returns the comptesDeClient.
	 * 
	 * @uml.property name="comptesDeClient"
	 */
	public Compte[] getComptesDeClient() {
		return comptesDeClient;
	}

	/**
	 * @param comptesDeClient The comptesDeClient to set.
	 * 
	 * @uml.property name="comptesDeClient"
	 */
	public void setComptesDeClient(Compte[] comptesDeClient) {
		this.comptesDeClient = comptesDeClient;
	}

	/**
	 * @return Returns the id_client.
	 * 
	 * @uml.property name="id_client"
	 */
	public int getId_client() {
		return id_client;
	}

	/**
	 * @param id_client The id_client to set.
	 * 
	 * @uml.property name="id_client"
	 */
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	/**
	 * @return Returns the nom_client.
	 * 
	 * @uml.property name="nom_client"
	 */
	public String getNom_client() {
		return nom_client;
	}

	/**
	 * @param nom_client The nom_client to set.
	 * 
	 * @uml.property name="nom_client"
	 */
	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

}
