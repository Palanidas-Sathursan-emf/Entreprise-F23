package models;

import java.time.LocalDateTime;

/**
 * Image PNG fictive dont l'impression est simulée.
 */
public final class ImagePng extends Fichier implements IImprimable {
    /**
     * Crée un fichier image fictif. Les valeurs fournies sont supposées valides.
     *
     * @param nom    nom non vide, sans extension
     * @param date   date de modification non nulle
     * @param taille taille en octets, positive ou nulle
     */
    public ImagePng(String nom, LocalDateTime date, long taille) {
        super(nom, date, taille, ".png");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String imprimer() {
        return "Impression de l'image " + getNom();
    }
}
