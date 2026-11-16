package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Conteneur de fichiers et de sous-dossiers, sans cycle ni enfant partagé.
 * Sa taille est calculée récursivement ; sa date reste celle fournie à la
 * création.
 */
public final class Dossier extends Element {
    private final List<Element> contenu = new ArrayList<>();

    /**
     * Crée un dossier vide sans parent.
     *
     * @param nom  nom non vide du dossier
     * @param date date de modification non nulle
     */
    public Dossier(String nom, LocalDateTime date) {
        super(nom, date);
    }

    /**
     * Rattache un élément et l'ajoute à la fin du contenu, sans changer la date du
     * dossier.
     * Ignore l'ajout si l'élément est nul, possède déjà un parent ou créerait un
     * cycle.
     * 
     * @param element l'élément non nul, sans parent
     */
    public void ajouter(Element element) {
        if (element == null)
            return;
        if (element.getParent() != null)
            return;
        for (Dossier ancetre = this; ancetre != null; ancetre = ancetre.getParent()) {
            if (ancetre == element)
                return;
        }
        contenu.add(element);
        element.definirParent(this);
    }

    /**
     * Expose une copie non modifiable du contenu immédiat.
     * 
     * @return les enfants dans leur ordre d'insertion
     */
    public List<Element> getContenu() {
        return List.copyOf(contenu);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTaille() {
        long total = 0;
        for (Element element : contenu)
            total += element.getTaille();
        return total;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return "<DIR>";
    }
}
