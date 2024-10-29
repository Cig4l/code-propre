package ex2;

public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Constructeur
	 * @param solde : représente le solde du compte
	 * @param tauxRemuneration : représente le taux de rémunération du compte
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Modifie le solde du compte pour ajouter la rémunération annuelle
	 */
	public void appliquerRemuAnnuelle(){
		setSolde(getSolde() + getSolde() * tauxRemuneration / 100);
	}

	@Override
	public void debiterMontant(double montant) {
		if (getSolde() - montant > 0){
			setSolde(getSolde() - montant);
		}
	}
}
