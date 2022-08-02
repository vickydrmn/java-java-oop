package com.modul1;
//heru  darmawan
public class modul1{
    private String nama;
    private String NIM;
    private String password;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama(){
        return nama;
    }
    public String getNIM(){
        return NIM;
    }
    public String getPassword(){
        return password;
    }

    public void daftar(String nama,String NIM,String password){
        setNama(nama);      //variable
        setNIM(NIM);        //variable
        setPassword(password);  //variable
    }
}