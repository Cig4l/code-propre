package ex2;

public class CompteCourant extends CompteBancaire {
    /** decouvert : un découvert est autorisé seulement pour les comptes courants */
    private double decouvert;

    /**
     * Constructeur
     * @param decouvert : réprésente le découvert du compte
     * @param solde :  : réprésente le solde du compte
     */
    public CompteCourant(double decouvert, double solde){
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void debiterMontant(double montant) {
        if (getSolde() - montant > decouvert){
            setSolde(getSolde() - montant);
        }
    }
}
