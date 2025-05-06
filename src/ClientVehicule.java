import java.util.Scanner;

public class ClientVehicule {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ConstructeurLiassevehicule constructeur;
        System.out.print("Voulez-vous construire des"
                + "liasses HTML (1) ou PDF (2) :");
        String choix = reader.next();
        if (choix.equals("1")) {
            constructeur = new ConstructeurLiasseVehiculeHtml();
        } else {
            constructeur = new ConstructeurliassevehiculePdf();
        }
        Vendeur vendeur = new vendeur(constructeur);
        Liasse liasse = vendeur.construit("Martin");
        liasse.imprime();
    }
}