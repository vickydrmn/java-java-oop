package modul5.tug1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    //static String koh;
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        String jawab;
        boolean ggh = true;
        dinasPertanahan vicky = new dinasPertanahan();
        while (ggh) {
            try {
                Scanner input = new Scanner((System.in));
                System.out.println("Masukan Alamat : ");
                vicky.setAlamat(input, a);
                vicky.getAlamat(a);
                System.out.println("Masukan panjang tanah : ");
                vicky.setPanjangTanah(input, b);
                vicky.getPanjangTanah(b);
                System.out.println("Masukan luas tanah : ");
                vicky.setLuasTanah(input, c);
                vicky.getLuasTanah(c);

                System.out.println("Apakah anda ingin kembali ke menu?");
                System.out.print("Jawab [ya/tidak]> ");
                jawab = input.nextLine();
                if (!jawab.equalsIgnoreCase("tidak")) {//untuk membandingkan string ke objek
                    ggh = false;
                }

            } catch (InputMismatchException ime) {
                // pernyataan disini akan di eksekusi jika terjadi Exception
                System.err.println("data salah coba lagi ");
//                System.out.println("Masukan Alamat : ");
//                vicky.setAlamat(input, a);
//                System.out.println(vicky.getAlamat(a));
//                System.out.println("Masukan panjang tanah : ");
//                vicky.setPanjangTanah(input,b);
//                System.out.println(vicky.getPanjangTanah(b));
//                System.out.println("Masukan luas tanah : ");
//                vicky.setLuasTanah(input, c);
//                System.out.println(vicky.getLuasTanah(c);
            } catch (Exception e) {
                e.printStackTrace();//membantu indentifikasi bug

            } finally {
                System.out.println("end");
            }
//            System.out.println("\n==show data==\n");
//            System.out.println("Alamat : " + vicky.getAlamat(a));
//            System.out.println("Panjang tanah : " + vicky.getPanjangTanah(b));
//            System.out.println("Luas tanah : " + vicky.getLuasTanah(c));
//        }
        }
    }

    }