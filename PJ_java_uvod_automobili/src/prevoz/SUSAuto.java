package prevoz;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class SUSAuto extends Auto {
    private String gorivo;

    public SUSAuto(int konjaza, int obrtniMoment, String gorivo) {
        super(konjaza, obrtniMoment);
        this.gorivo = gorivo;

        try {
            PrintWriter pisac = new PrintWriter(new FileWriter(getRedniBroj() + ".txt"));
            pisac.println("Tip: SUS");
            pisac.println("Redni broj: " + getRedniBroj());
            pisac.println("Konjaza: " + getKonjaza());
            pisac.println("Moment: " + getObrtniMoment());
            pisac.println("Gorivo: " + gorivo);
            pisac.println("Brutalnost: " + brutalnost());
            pisac.close();
        } catch (IOException e) {
            System.err.println("Greska pri upisu u fajl: " + e.getMessage());
        }
    }

    @Override
    public double brutalnost() {
        if (gorivo.equals("dizel")) {
            return getKonjaza() * getObrtniMoment() * 1.3;
        } else if (gorivo.equals("benzin")) {
            return getKonjaza() * getObrtniMoment() * 1.5;
        } else {
            return 0;
        }
    }
}
