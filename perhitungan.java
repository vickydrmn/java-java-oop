package modul2.t1;

public class perhitungan {
    private int NilaiProgdas, NilaiKalkulus, NilaiOrkom;
    private double Hasil;

    public void setNilaiProgdas(int nilaiProgdas) {
        this.NilaiProgdas = nilaiProgdas;
    }

    public void setNilaiKalkulus(int nilaiKalkulus) {
        this.NilaiKalkulus = nilaiKalkulus;
    }

    public void setNilaiOrkom(int nilaiOrkom) {
        this.NilaiOrkom = nilaiOrkom;
    }

    public int getNilaiProgdas() {
        return NilaiProgdas;
    }

    public int getNilaiKalkulus() {
        return NilaiKalkulus;
    }

    public int getNilaiOrkom() {
        return NilaiOrkom;
    }

    public double hitungRata() {
        Hasil = (getNilaiProgdas() + getNilaiKalkulus() + getNilaiOrkom());
        Hasil/=3;
        return Hasil;
    }
    public void cekNilai() {
        if(Hasil>=70){
            System.out.println("Status : Lulus");
        }
        if (Hasil < 70){
            System.out.println("Status : Gagal");
        }
    }
}