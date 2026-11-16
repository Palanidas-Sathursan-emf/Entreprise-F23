package services;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ServiceFormatage {

  public String formaterTaille(long taille) {
    DecimalFormatSymbols symbols = new DecimalFormatSymbols();
    symbols.setGroupingSeparator('\'');

    DecimalFormat format = new DecimalFormat("#,###,###", symbols);
    String formatee = format.format(taille);
    return formatee + " bytes";
  }

  public String formaterDuree(int seconds) {

    return "";
  }
}
