package modul2.t1;

import java.util.Scanner;

public class d {
    public static void main(String[] args){
        perhitungan vicky = new perhitungan();

        System.out.println("Masukkan Nilai Anda : ");
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai Progdas : ");
        vicky.setNilaiProgdas(input.nextInt()); //untuk memasukkan nilai integer dari pengguna dan menetapkannya ke variabel n

        System.out.print("Nilai Kalkulus : ");
        vicky.setNilaiKalkulus(input.nextInt());

        System.out.print("Nilai Orkom : ");
        vicky.setNilaiOrkom(input.nextInt());

        System.out.println("------------------------------");
        System.out.println("Nilai Anda : ");
        System.out.println("Nilai Progdas : "+vicky.getNilaiProgdas());
        System.out.println("Nilai Kalkulus : "+vicky.getNilaiKalkulus());
        System.out.println("Nilai Orkom : "+vicky.getNilaiOrkom());

        System.out.println("\nRata-rata : "+ vicky.hitungRata());
        vicky.cekNilai();
        input.close();
    }
}