/***
 * Classe concrete LiassePdf
 *
 * +ajouteDocument()
 * imprime()
 *
 */


public class LiassePdf extends Liasse {
    @Override
    public void imprime() {
        System.out.println("Liasse PDF");
        for (String doc : documents) {
            System.out.println(doc);
        }
    }
}
