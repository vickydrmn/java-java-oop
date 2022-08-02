package modul3.parent;

public class luasper extends tabung{
    double LPT, r, t;

    @Override
    public void LPT() {
        LPT = 2 * ((3.14 * r * r) * (2 * 3.14 * r * t));
        System.out.println("Luas Permukaan : " + LPT);
    }
}