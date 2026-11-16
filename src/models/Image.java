package models;

import java.time.LocalDateTime;

public abstract class Image extends Fichier implements IImprimable {
    
    public Image(String nom, LocalDateTime date, long taille, String extension) {
        super(nom, date, taille, extension);
    }

    @Override
    public String imprimer() {
        return "Impression de l'image " + getNom();
    }

    
}
