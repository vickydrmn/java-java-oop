package modul2.t2;

import java.util.Scanner;

public class konveksibulan {

public static void main(String[] args){
    int bulan,detik, menit,jam,hari;

    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.print("Masukan Bulan : ");
    bulan = input.nextInt();

    detik = bulan * 2592000;
    menit = bulan *  43200;
    jam = bulan * 720;
    hari = bulan * 30;

    System.out.println("Hasil Konveksi bulan");
    System.out.println(bulan + " bulan = " + detik+ " detik");
    System.out.println(bulan + " bulan = " + menit + " menit");
    System.out.println(bulan + " bulan = " + jam + " jam");
    System.out.println(bulan + " bulan = " + hari + " hari ");
    input.close();
    }
}