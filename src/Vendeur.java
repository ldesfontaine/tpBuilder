/***
 * Classe Vendeur
 *
 * créé la liasse à partir du nom du client.
 *
 * +construit()
 *
 */


public class Vendeur {
    private final ConstructeurLiasseVehicule constructeur;

    public Vendeur(ConstructeurLiasseVehicule constructeur) {
        this.constructeur = constructeur;
    }

    public Liasse construit(String nomClient) {
        System.out.println("Construction de la liasse pour " + nomClient);
        constructeur.construitLiasse(nomClient);
        return constructeur.getLiasse();
    }
}


