package ex1;

import java.util.Date;

public class Entreprise {

	/**
	 * siret : numéro SIRET de l'entreprise.
	 * Il s'agit d'un numéro unique de 14 chiffres identifiant l'entreprise en France.
	 */
	private int siret;

	/** nom : nom de l'entreprise */
	private String nom;

	/** adresse : adresse de l'entreprise */
	private String adresse;

	/** dateCreation : date de création de l'entreprise */
	private Date dateCreation;
	private static final int CAPITAL_MAX = 3000000;

	/**
	 * Constructeur
	 * @param siret : numéro SIRET de l'entreprise
	 * @param nom : nom de l'entreprise
	 * @param adresse : adresse de l'entreprise
	 * @param dateCreation : date de création de l'entreprise
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation){
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;

	}

	/**
	 * affiche les informations sur l'entreprise
	 */
	public void afficherStatut(){
		System.out.println("INFOS ENTREPRISE");
		System.out.println("Siret : " + this.siret);
		System.out.println("Nom : " + this.nom);
		System.out.println("Adresse : " + this.adresse);
		System.out.println("Date de création : " + this.dateCreation);
	}

	/**
	 * @return siret
	 */
	public int getSiret() {
		return siret;
	}


	/**
	 * setter siret
	 *
	 * @param siret : numéro de siret de l'entreprise
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * setter nom
	 *
	 * @param nom : nom de l'entreprise
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * setter
	 *
	 * @param adresse : adresse de l'entreprise
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return dateCréation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * setter
	 *
	 * @param dateCreation : date de création de l'entreprise
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return capitalMax
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
}
