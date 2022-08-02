package modul3.parent;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        String menu;
        Scanner input = new Scanner((System.in));
        vol vicky = new vol();
        luasslim vicky1 = new luasslim();
        luasper vicky2 = new luasper();
        System.out.println("Program Menghitung tabung : ");
        System.out.println("volume tabung");
        System.out.println("luas Pelimut tabung");
        System.out.println("Luas Permukaan Tabung");
        System.out.print("pilih V/LST/LPT: ");
        menu = input.nextLine();

        switch (menu) {
            case "V":
                System.out.println("\n==volume==");
                System.out.print("masukan tinggi : ");
                vicky.t = (input.nextDouble());
                System.out.print("masukan jari-jari : ");
                vicky.r = (input.nextDouble());
                vicky.volume();
                break;
            case "LST":
                System.out.println("\n==luas selimut==");
                System.out.print("masukan tinggi : ");
                vicky1.t = (input.nextDouble());
                System.out.print("masukan jari-jari : ");
                vicky1.r = (input.nextDouble());
                vicky1.LST();
                break;
            case "LPT":
                System.out.println("\n==luas permukaan==");
                System.out.print("masukan tinggi : ");
                vicky2.t = (input.nextDouble());
                System.out.print("masukan jari-jari : ");
                vicky2.r = (input.nextDouble());
                vicky2.LPT();
                break;
        }
        input.close();
    }
}