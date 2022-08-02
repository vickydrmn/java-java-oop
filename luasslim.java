package modul3.parent;

public class luasslim extends tabung{
    double LST, r, t;

    @Override
    public void LST() {
        LST = 2 * 3.14 * r * t;
        System.out.println("Luas Selimut : " + LST);
    }
}