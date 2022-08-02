package modul4.ke1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        String menu;
        Scanner input = new Scanner((System.in));
        kerucut a = new kerucut();
        bola b = new bola();
        System.out.println("Program Menghitung Bangun Ruang : ");
        System.out.println("1. Luas Permukaan Kerucut : ");
        System.out.println("2. Volume Kerucut : ");
        System.out.println("3. Luas Permukaan Bola : ");
        System.out.println("4. Volume Bola : ");
        System.out.print("pilih 1/2/3/4: ");
        menu = input.nextLine();

        switch (menu){
            case "1":
                System.out.println("Luas Permukaan Kerucut");
                System.out.println("Masukan jari-jari : ");
                a.r = (input.nextDouble());
                System.out.println("Masukan Tinggi : ");
                a.t = (input.nextDouble());
                a.setLuasPermukaan();
                System.out.println("Luas Permukaan kerucut adalah : "+a.Lpk );
                break;
            case "2":
                System.out.println("Volume Kerucut");
                System.out.println("Masukan jari-jari : ");
                a.r = (input.nextDouble());
                System.out.println("Masukan Tinggi : ");
                a.t = (input.nextDouble());
                a.setVolume();
                System.out.println("Volume kerucut adalah : "+a.vk);
                break;
            case "3":
                System.out.println("Luas Permukaan Bola");
                System.out.println("Masukan jari-jari : ");
                b.r = (input.nextDouble());
                b.setLuasPermukaan();
                System.out.println("Luas Permukaan BOla adalah : "+b.lpb );
                break;
            case "4":
                System.out.println("Volume Bola");
                System.out.println("Masukan jari-jari : ");
                b.r = (input.nextDouble());
                b.setVolume();
                System.out.println("Volume bola adalah : "+b.vb);
                break;
        }
    }
}
