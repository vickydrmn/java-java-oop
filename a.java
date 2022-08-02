package com.modul1;
//heru  darmawan
import java.util.Scanner;

public class a {
    public static void main (String[] args){
        modul1 user = new modul1(); // user = object

        System.out.println("==daftar==");
        Scanner input = new Scanner(System.in);
        System.out.print("Nama     : ");
        String nama = input.nextLine();

        System.out.print("NIM      : ");
        String NIM = input.nextLine();

        while (NIM.length()!= 15){
            System.out.println("NIM harus berjumlah 15");
            System.out.print("Masukan NIM kebali : ");
            NIM = input.nextLine();
        }

        System.out.print("Password : ");
        String password = input.nextLine();

        while (password.length() < 8){
            System.out.println("Password minimal jumalah 8 karakter");
            System.out.print("Masukan pasword kembali : ");
            password = input.nextLine();
        }
        
        System.out.println("------------------------------");
        user.daftar(nama,NIM,password);
        System.out.println("Selamat "+user.getNama() + " Anda Berhasil daftar"); //variablenya user.getNama()
        System.out.println();
        System.out.println("Berikut username dan pasword anda :");
        System.out.println("username : " +user.getNIM());               //variablenya +user.getNIM())
        System.out.println("pasword  : " +user.getPassword());          //variablenya +user.getPassword()
        input.close();
    }
}