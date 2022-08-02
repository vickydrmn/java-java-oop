package modul5.tug1;

import java.util.Scanner;

public class dinasPertanahan {
    Scanner input = new Scanner((System.in));

    private String[] alamat = new String[100];
    private int[] panjangTanah = new int[100];
    private int[] luasTanah = new int[100];

    public String getAlamat(int a) {
        return alamat[a];
    }

    public void setAlamat(Scanner input, int a) {
        this.alamat[a] = input.nextLine();
    }

    public int getLuasTanah(int b) {
        return luasTanah[b];
    }

    public void setLuasTanah(Scanner input, int b) {
        this.luasTanah[b] = input.nextInt();
        input.nextLine();
    }

    public int getPanjangTanah(int b) {
        return panjangTanah[b];
    }

    public void setPanjangTanah(Scanner input, int c) {
        this.panjangTanah[c] = input.nextInt();
        input.nextLine();
    }
}