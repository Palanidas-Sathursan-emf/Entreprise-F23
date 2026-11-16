package services;

import java.time.LocalDateTime;
import models.*;

/**
 * Fabrique une arborescence fictive contenant les six formats et des dossiers.
 */
public final class DonneesExemple {
    /**
     * Empêche l'instanciation de cette fabrique utilitaire.
     */
    private DonneesExemple() {
    }

    /**
     * Construit une nouvelle arborescence indépendante pour chaque appel.
     * Inclut des dates identiques et des tailles différentes pour illustrer les tris.
     * @return la racine contenant les six formats, un dossier vide et des sous-dossiers
     */
    public static Dossier creerRacine() {
        LocalDateTime dateDeBase = LocalDateTime.of(2026, 11, 2, 9, 0);
        Dossier racine = new Dossier("Exemple", dateDeBase);
        Dossier archives = new Dossier("Archives", dateDeBase.minusDays(1));
        Dossier sousDossier = new Dossier("Année 2025", dateDeBase.minusYears(1));
        sousDossier.ajouter(new DocumentPdf("rapport", dateDeBase.minusYears(1), 800));
        archives.ajouter(sousDossier);
        racine.ajouter(archives);
        racine.ajouter(new DocumentExcel("budget", dateDeBase, 3500));
        racine.ajouter(new DocumentPdf("consigne", dateDeBase, 1200));
        racine.ajouter(new DocumentWord("courrier", dateDeBase.plusDays(1), 2400));
        racine.ajouter(new ImagePng("photo", dateDeBase.plusHours(2), 15000, ".png"));
        racine.ajouter(new VideoMp4("presentation", dateDeBase.minusDays(2), 5000000, 120));
        racine.ajouter(new AudioMp3("musique", dateDeBase, 3000000, 180));
        racine.ajouter(new Dossier("Vide", dateDeBase.plusDays(1).withHour(14)));
        racine.ajouter(new ImageJpeg("laLigneNoir", dateDeBase.plusDays(2), 15000, ".jpeg"));
        return racine;
    }
}
