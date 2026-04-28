import prevoz.*;

public class GlavnaKlasa
{
    public static void main(String args[])
    {
        Garaza g = new Garaza();
        SUSAuto s1 = new SUSAuto(150, 320, "dizel");
        SUSAuto s2 = new SUSAuto(150, 320, "benzin");
        ElektricniAuto e1 = new ElektricniAuto(300, 400, 100);
        g.dodajAuto(s1);
        g.dodajAuto(s2);
        g.dodajAuto(e1);
        g.megatest();
    }
}
