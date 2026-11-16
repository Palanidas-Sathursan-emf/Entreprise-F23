package models;

import java.time.LocalDateTime;

/**
 * Document Word fictif au format DOCX, imprimable.
 */
public final class DocumentWord extends Document {
    /**
     * Crée un fichier fictif. Les valeurs fournies sont supposées valides.
     *
     * @param nom    nom non vide, sans extension
     * @param date   date de modification non nulle
     * @param taille taille en octets, positive ou nulle
     */
    public DocumentWord(String nom, LocalDateTime date, long taille) {
        super(nom, date, taille, ".docx");
    }
}
