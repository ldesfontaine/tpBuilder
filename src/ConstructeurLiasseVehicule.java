/**
 * Constructeur abstraite LiasseVehiculejava
 * <p>
 * +construitBonDeCommande()
 * +construitDemmandeImmatriculation()
 * +résultat()
 */


public abstract class ConstructeurLiasseVehicule {
    protected Liasse liasse;

    public void construitLiasse(String nomClient) {
        construitBonDeCommande(nomClient);
        construitDemandeImmatriculation(nomClient);
    }

    protected abstract void construitBonDeCommande(String nomClient);

    protected abstract void construitDemandeImmatriculation(String nomClient);

    public Liasse getLiasse() {
        return liasse;
    }
}

