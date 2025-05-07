/**
 * Constructeur LiasseVehiculeHtml.java
 * <p>
 * +construitBonDeCommande()
 * +construitDemmandeImmatriculation()
 */

public class ConstructeurLiasseVehiculeHtml extends ConstructeurLiasseVehicule {
    public ConstructeurLiasseVehiculeHtml() {
        liasse = new LiasseHtml();
    }

    @Override
    protected void construitBonDeCommande(String nomClient) {
        liasse.ajouteDocument("<HTML>Bon de commande Client : " + nomClient + "</HTML>");
    }

    @Override
    protected void construitDemandeImmatriculation(String nomClient) {
        liasse.ajouteDocument("<HTML>Demande d'immatriculation Demandeur : " + nomClient + "</HTML>");
    }
}

