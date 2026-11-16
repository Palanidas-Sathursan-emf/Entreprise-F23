package models;

import java.time.LocalDateTime;

/**
 * Base commune aux documents dont l'impression est simulée.
 */
public abstract class Document extends Fichier implements IImprimable {
    /**
     * Crée un fichier fictif. Les valeurs fournies sont supposées valides.
     *
     * @param nom       nom non vide, sans extension
     * @param date      date de modification non nulle
     * @param taille    taille en octets, positive ou nulle
     * @param extension extension du format, avec son point initial
     */
    protected Document(String nom, LocalDateTime date, long taille, String extension) {
        super(nom, date, taille, extension);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String imprimer() {
        return "Impression du document " + getNom();
    }
}
