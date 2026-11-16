package models;

/**
 * Capacité à simuler la lecture et l'arrêt d'un média, sans charger de fichier
 * réel.
 */
public interface IJouable {
    /**
     * Donne la durée du média.
     * 
     * @return la durée strictement positive en secondes
     */
    int getDureeSecondes();

    /**
     * Simule le début de lecture ; aucun son ni aucune vidéo n'est produit.
     * 
     * @return un message décrivant la lecture simulée
     */
    String jouer();

    /**
     * Simule l'arrêt de lecture.
     * 
     * @return un message décrivant l'arrêt
     */
    String arreter();
}
