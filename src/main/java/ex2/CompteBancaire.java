package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {
	/** solde : solde du compte */
	private double solde;
	
	/**
	 * constructeur
	 * @param solde	représente le solde du compte
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Débite un montant sur le compte bancaire
	 * @param montant : montant à débiter sur le compte bancaire
	 */
	public abstract void debiterMontant(double montant);
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
}
