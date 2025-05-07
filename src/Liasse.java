/***
 * Classe abstraite Liasse
 *
 * +ajouteDocument()
 * imprime()
 *
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Liasse {
    protected List<String> documents = new ArrayList<>();

    public void ajouteDocument(String doc) {
        documents.add(doc);
    }

    public abstract void imprime();
}
