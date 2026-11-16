package models;

import java.time.LocalDateTime;

/**
 * Document PDF fictif, imprimable.
 */
public final class DocumentPdf extends Document {
    /**
     * Crée un fichier fictif. Les valeurs fournies sont supposées valides.
     *
     * @param nom    nom non vide, sans extension
     * @param date   date de modification non nulle
     * @param taille taille en octets, positive ou nulle
     */
    public DocumentPdf(String nom, LocalDateTime date, long taille) {
        super(nom, date, taille, ".pdf");
    }
}
