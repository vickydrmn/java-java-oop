package modul4.ke1;

public class kerucut extends bangunruang {

    static double mencari_s(double r, double t){
    double s = Math.sqrt(Math.pow(r, 2) + Math.sqrt((Math.pow(t, 2)))); //sqrt untuk menghitung akar kuadrat, Math.pow membuat akar
    return s;
    }
    double s, r, t, lsk, Lpk, vk;

    @Override
    public void setLuasPermukaan(){
        lsk = 3.14 * r * s;
        Lpk = lsk + (3.14 * r * r);

    }
    @Override
    public void setVolume(){
        vk = (3.14 * r * r * t)/3;

    }
}