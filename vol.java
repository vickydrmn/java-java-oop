package modul3.parent;

public class vol extends tabung{
    double volume, r, t;

    @Override
    public void volume() {
        volume = 3.14 * r * r * t;
        System.out.println("Volume : " + volume);
    }
}
