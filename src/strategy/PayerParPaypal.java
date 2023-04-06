package strategy;

public class PayerParPaypal implements ModeDePaiement {
    private String email;
    private String motDePasse;

    public PayerParPaypal(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + " euros effectué par Paypal.");
        System.out.println("Email : " + email);
        System.out.println("Mot de passe : " + motDePasse);
    }
}