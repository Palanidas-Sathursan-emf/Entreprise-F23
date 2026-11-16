package models;

import java.time.LocalDateTime;

/**
 * Élément nommé du système de fichiers fictif, avec une date de modification.
 * L'ordre naturel compare les noms par ordre alphabétique, sans tenir compte
 * des majuscules et des minuscules.
 */
public abstract class Element implements Comparable<Element> {
    private final String nom;
    private final LocalDateTime dateModification;
    private Dossier parent;

    /**
     * Initialise un élément non rattaché à un dossier.
     *
     * @param nom nom non vide de l'élément
     * @param dateModification date de modification non nulle
     */
    protected Element(String nom, LocalDateTime dateModification) {
        this.nom = nom;
        this.dateModification = dateModification;
    }

    /**
     * Donne le nom affiché de l'élément.
     * @return le nom, avec extension pour un fichier
     */
    public String getNom() { return nom; }
    /**
     * Donne la date utilisée pour les tris.
     * @return la date de modification
     */
    public LocalDateTime getDateModification() { return dateModification; }
    /**
     * Donne le dossier contenant cet élément.
     * @return le parent, ou {@code null} si l'élément n'est pas rattaché
     */
    public Dossier getParent() { return parent; }
    // Seul le modèle peut modifier le lien, après validation par Dossier.
    /**
     * Modifie le parent après validation de la relation par {@link Dossier#ajouter(Element)}.
     * @param parent le dossier auquel rattacher l'élément
     */
    void definirParent(Dossier parent) { this.parent = parent; }
    /**
     * Donne la taille du fichier ou la somme récursive du contenu d'un dossier.
     * @return la taille en octets
     */
    public abstract long getTaille();
    /**
     * Donne le type affiché dans la liste.
     * @return l'extension du fichier ou le marqueur {@code <DIR>} pour un dossier
     */
    public abstract String getType();

    /**
     * Compare les noms par ordre alphabétique, sans tenir compte de la casse.
     * @param autre l'élément non nul à comparer
     * @return un entier négatif, nul ou positif selon l'ordre des noms
     */
    @Override
    public int compareTo(Element autre) {
        return getNom().compareToIgnoreCase(autre.getNom());
    }
}
