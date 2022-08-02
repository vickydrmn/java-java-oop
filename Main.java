package modul4.ke3A;

public class Main {
    public static void main(String[] args){
        Tabung a = new Tabung();
        Limas b = new Limas();

        a.jarijari = 7;
        a.tinggi = 10;
        b.sisi = 6;
        b.tinggi = 8;
        System.out.println("Luas Lingkaran = "+a.luas());
        System.out.println("keliling Lingkaran = "+a.keliling());
        System.out.println("Luas persegi = "+b.luas());
        System.out.println("keliling persegi = "+b.keliling());
        System.out.println("volume tabung = "+a.getVolume());
        System.out.println("volume limas = "+b.getVolume());

    }
}
