package modul5.tug2;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String jawab, str;
        int menu;
        String line;
        boolean runing = true;
        dinaspertanahan vicky = new dinaspertanahan();
        Scanner input = new Scanner((System.in));
        do {
            System.out.println("==data==");
            System.out.println("1. creat data");
            System.out.println("2. show data");
            System.out.print("pilih 1 atau 2 : ");
            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:
                    while (runing) {
                        try {
                            //path untuk menyebutkan alamat
                            File path = new File("D:\\java\\out\\production\\belajar ngoding java\\modul-1-PPBO\\src\\modul5\\tug2\\datadinaspertanahan.txt");
                            input.reset();
                            System.out.println("\nMasukan Alamat : ");
                            vicky.alamat = input.nextLine();
                            System.out.println("Masukan panjang tanah : ");
                            vicky.panjangTanah = Integer.parseInt(input.nextLine());
                            System.out.println("Masukan luas tanah : ");
                            vicky.luasTanah = Integer.parseInt(input.nextLine());
                            //menabahkan file baru
                            FileWriter d = new FileWriter(path, true);
                            str = "Alamat : " + vicky.alamat+ "\npanjang tanah : " + vicky.panjangTanah + "\nluas tanah : " + vicky.luasTanah;
                            d.write(str+"\n\n");
                            d.close();
                            System.out.println("Apakah anda ingin kembali ke menu?");
                            System.out.print("Jawab [ya/tidak]> ");
                            jawab = input.nextLine();
                            if (!jawab.equalsIgnoreCase("tidak")) {//untuk membandingkan string ke objek
                                runing = false;
                            }
                        } catch (InputMismatchException ime) {
                            // pernyataan disini akan di eksekusi jika terjadi Exception
                            System.err.println("data salah coba lagi ");
                        } catch (Exception e) {
                            e.printStackTrace();//membantu indentifikasi bug
                        }finally {
                            System.out.println("end");
                        }
                    }
                    break;
                case 2:
                    while (runing) {
                        try {
                            System.out.println("\n==show data==\n");
                            FileReader fileReader = new FileReader("D:\\java\\out\\production\\belajar ngoding java\\modul-1-PPBO\\src\\modul5\\tug2\\datadinaspertanahan.txt");
                            BufferedReader bufferedReader = new BufferedReader(fileReader);

                            while ((line = bufferedReader.readLine()) != null) {
                                System.out.println(line);
                            }
                            bufferedReader.close();

                        } catch (FileNotFoundException ex) {
                            System.err.println("file tidak di temukan");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }finally {
                            System.out.println("end");
                        }
                        System.out.println("Apakah anda ingin kembali ke menu?");
                        System.out.print("Jawab [ya/tidak]> ");
                        jawab = input.nextLine();
                        if (!jawab.equalsIgnoreCase("tidak")) {//untuk membandingkan string ke objek tertentu, tanpa memperhatikan kasus.
                            runing = false;
                        }
                    }
            }
            runing = true;
        } while ( runing );
    }
}
    //Exception adalah sebuah alur peristiwa yang menjalankan proses pada program, pristiwa tersebut bisa berupa kesalahan atau error pada program yang kita buat, error tersebut bisa terjadi karena beberpa faktor, diantaranya: kesalahan input, jenis format data yang dimasukan salah, peggunaan array yang melebihi batas, Dll.
