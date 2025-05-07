/**
 * ConstructeurLiasseVehiculePdf.java
 * <p>
 * +construitBonDeCommande()
 * +construitDemmandeImmatriculation()
 */


public class ConstructeurLiasseVehiculePdf extends ConstructeurLiasseVehicule {
    public ConstructeurLiasseVehiculePdf() {
        liasse = new LiassePdf();
    }

    @Override
    protected void construitBonDeCommande(String nomClient) {
        liasse.ajouteDocument("<PDF>Bon de commande Client : " + nomClient + "</PDF>");
    }

    @Override
    protected void construitDemandeImmatriculation(String nomClient) {
        liasse.ajouteDocument("<PDF>Demande d'immatriculation Demandeur : " + nomClient + "</PDF>");
    }
}
