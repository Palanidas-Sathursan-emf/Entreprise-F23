package models;

/**
 * Capacité à simuler une impression sans accéder à une imprimante.
 */
public interface IImprimable {
    /**
     * Simule l'impression de l'objet.
     * 
     * @return un message décrivant l'impression simulée
     */
    String imprimer();
}
