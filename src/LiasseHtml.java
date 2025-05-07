/***
 * Classe concrete LiasseHtml
 *
 * +ajouteDocument()
 * imprime()
 *
 */


public class LiasseHtml extends Liasse {
    @Override
    public void imprime() {
        System.out.println("Liasse HTML");
        for (String doc : documents) {
            System.out.println(doc);
        }
    }
}
