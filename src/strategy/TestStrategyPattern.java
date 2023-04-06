package strategy;

public class TestStrategyPattern {

    public static void main(String[] args) {
        // Création des articles
        Article article1 = new Article("T-shirt", 20);
        
        // Paiement par carte
        ModeDePaiement carte = new PayerParCarte("sirine","1234567890", "12/22", "123");
        carte.payer(article1.getPrix());

        // Paiement par PayPal
        ModeDePaiement paypal = new PayerParPaypal("john.doe@example.com", "mypassword");
        paypal.payer(article1.getPrix());
    }

}