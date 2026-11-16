package models;

import java.time.LocalDateTime;

/**
 * Fichier fictif de taille fixe dont le nom affiché comprend une extension.
 */
public abstract class Fichier extends Element {
    private final long taille;
    private final String extension;

    /**
     * Crée un fichier fictif. Les valeurs fournies sont supposées valides.
     *
     * @param nomSansExtension nom non vide, sans extension
     * @param date             date de modification non nulle
     * @param taille           taille en octets, positive ou nulle
     * @param extension        extension du format, avec son point initial
     */
    protected Fichier(String nomSansExtension, LocalDateTime date, long taille, String extension) {
        super(nomSansExtension, date);
        this.taille = taille;
        this.extension = extension;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getNom() {
        return super.getNom() + extension;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public long getTaille() {
        return taille;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getType() {
        return extension;
    }
}
