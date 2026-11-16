package models;

import java.time.LocalDateTime;

public class ImageJpeg extends Image {

    public ImageJpeg(String nom, LocalDateTime date, long taille, String extension) {
        super(nom, date, taille, extension);
    }
    
}
