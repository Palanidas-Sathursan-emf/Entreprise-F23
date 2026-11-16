package models;

import java.time.LocalDateTime;

/**
 * Fichier audio MP3 fictif avec une durée et une lecture simulée.
 */
public final class AudioMp3 extends Fichier implements IJouable {
    private final int dureeSecondes;

    /**
     * Crée un fichier fictif. Les valeurs fournies sont supposées valides.
     *
     * @param nom           nom non vide, sans extension
     * @param date          date de modification non nulle
     * @param taille        taille en octets, positive ou nulle
     * @param dureeSecondes durée strictement positive en secondes
     */
    public AudioMp3(String nom, LocalDateTime date, long taille, int dureeSecondes) {
        super(nom, date, taille, ".mp3");
        this.dureeSecondes = dureeSecondes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getDureeSecondes() {
        return dureeSecondes;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String jouer() {
        return "Lecture en cours de " + getNom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String arreter() {
        return "Lecture arrêtée : " + getNom();
    }
}
