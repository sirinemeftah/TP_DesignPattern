package strategy;

public class PayerParCarte implements ModeDePaiement {
    private String nomTitulaire;
    private String numeroCarte;
    private String dateExpiration;
    private String codeSecurite;

    public PayerParCarte(String nomTitulaire, String numeroCarte, String dateExpiration, String codeSecurite) {
        this.nomTitulaire = nomTitulaire;
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.codeSecurite = codeSecurite;
    }

    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + " euros effectué par carte bancaire.");
        System.out.println("Titulaire : " + nomTitulaire);
        System.out.println("Numéro de carte : " + numeroCarte);
        System.out.println("Date d'expiration : " + dateExpiration);
        System.out.println("Code de sécurité : " + codeSecurite);
    }
}