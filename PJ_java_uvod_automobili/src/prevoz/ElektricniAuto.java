package prevoz;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class ElektricniAuto extends Auto
{
    private int kapacitetBaterije;

    public ElektricniAuto(int konjaza, int obrtniMoment, int kapacitetBaterije)
    {
        super(konjaza, obrtniMoment);
        this.kapacitetBaterije = kapacitetBaterije;

        try
        {
            PrintWriter pisac = new PrintWriter(new FileWriter(getRedniBroj() + ".txt"));
            pisac.println("Tip: Elektricni");
            pisac.println("Redni broj: " + getRedniBroj());
            pisac.println("Konjaza: " + getKonjaza());
            pisac.println("Moment: " + getObrtniMoment());
            pisac.println("Kapacitet baterije: " + kapacitetBaterije);
            pisac.println("Brutalnost: " + brutalnost());
            pisac.close();
        }
        catch (IOException e)
        {
            System.err.println("Greska pri upisu u fajl: " + e.getMessage());
        }
    }

    @Override
    public double brutalnost()
    {
        return getKonjaza() * (getObrtniMoment() + kapacitetBaterije);
    }
}
