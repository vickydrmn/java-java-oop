package modul4.ke1;

public class bola extends bangunruang {
    double lpb, vb, r;

    @Override
    public void setLuasPermukaan(){
        lpb = 4 * 3.14 * r;

    }
    @Override
    public void setVolume(){
        vb = (4 * 3.14 * r * r * r)/3;

    }
}
