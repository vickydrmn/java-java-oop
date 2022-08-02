package modul2.t2b;

import java.util.Scanner;

public class kalkulator {
    private int inputMenu;
    private double Diagonal1, Diagonal2, Sisi;
    private double Hasil;

    public void setInputMenu(Scanner scan) {
        this.inputMenu = scan.nextInt();
    }

    public void setDiagonal1(Scanner scan) {
        this.Diagonal1 = scan.nextDouble();
    }

    public void setDiagonal2(Scanner scan) {
        this.Diagonal2 = scan.nextDouble();
    }

    public void setSisi(Scanner scan) {
        this.Sisi = scan.nextDouble();
    }

    public double getDiagonal1() {
        return Diagonal1;
    }

    public double getDiagonal2() {
        return Diagonal2;
    }

    public double getSisi() {
        return Sisi;
    }

    public int getInputMenu() {
        return inputMenu;
    }

    public void pilihMenu() {
        Scanner scan = new Scanner((System.in));
        System.out.println("Program Menghitung Keliling/luas Belah Ketupat : ");
        System.out.println("1. Luas");
        System.out.println("2. Keliling");
        System.out.print("pilih 1/2 : ");
        setInputMenu(scan);
    }
    public double hitungluas() {
        Hasil = (getDiagonal1() * getDiagonal2())/2;
        return Hasil;
    }
    public double hitungkeliling(){
        Hasil = (getSisi() * 4);
        return Hasil;
    }
}
