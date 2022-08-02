package modul2.t2b;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        kalkulator Vicky1 = new kalkulator();


        Vicky1.pilihMenu();
        switch (Vicky1.getInputMenu()) {
            case 1:
                System.out.println("\nLuas");
                System.out.print("Masukan Panjang Diagonal1 : ");
                Vicky1.setDiagonal1(input);
                System.out.print("Masukan Panjang diagonal2 : ");
                Vicky1.setDiagonal2(input);
                System.out.print("Luasnya adalah : "+Vicky1.hitungluas());
                break;
            case 2:
                System.out.println("\nKeliling");
                System.out.print("Masukan Panjang Sisi : ");
                Vicky1.setSisi(input);
                System.out.println("Kelilingnya adalah : "+Vicky1.hitungkeliling());
                break;
        }
    }
}