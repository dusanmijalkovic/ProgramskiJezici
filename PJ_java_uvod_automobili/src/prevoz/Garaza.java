package prevoz;

import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;

public class Garaza
{
    private ArrayList<Auto> automobili;

    public Garaza()
    {
        this.automobili = new ArrayList<Auto>();
    }

    public void dodajAuto(Auto a)
    {
        automobili.add(a);
    }

    public void megatest()
    {
        double brutalnost = 0;
        for (Auto a : automobili)
        {
            if (a.brutalnost() > brutalnost)
            {
                brutalnost = a.brutalnost();
            }
        }
        try {
            FileOutputStream fos = new FileOutputStream("bruteforce.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeDouble(brutalnost);
            dos.close();
            fos.close();
            System.out.println("Megatest: " + brutalnost);
        } catch (IOException e) {
            System.err.println("Greska pri upisu u fajl: " + e.getMessage());
        }
    }
}
