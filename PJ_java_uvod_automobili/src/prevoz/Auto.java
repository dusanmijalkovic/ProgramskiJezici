package prevoz;

public abstract class Auto implements Comparable<Auto>
{
    private int konjaza;
    private int obrtniMoment;
    private int redniBroj;
    private static int brojAuto = 0; //ako se misli na ovo da je redni broj nema smila jer je ststic samo za klasu ne za objekte te klase a kako klasa moze da ima redni broj?? makar ja ne vidim

    public Auto(int konjaza, int obrtniMoment)
    {
        this.konjaza = konjaza;
        this.obrtniMoment = obrtniMoment;
        brojAuto++;
        redniBroj = brojAuto;
    }

    public abstract double brutalnost();

    public int getRedniBroj()
    {
        return redniBroj;
    }

    public int getKonjaza()
    {
        return konjaza;
    }

    public int getObrtniMoment()
    {
        return obrtniMoment;
    }

    @Override
    public int compareTo(Auto drugi)
    {
        return Double.compare(this.brutalnost(), drugi.brutalnost());
    }
}
