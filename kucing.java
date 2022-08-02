package Abstract;

public class kucing extends hewan {
    @Override
    void setNama(){
        System.out.println("nama kucing");
    }

    @Override
    void setMakanan(){
        System.out.println("makan ikan");
    }

    void setWarna(){
        System.out.println("warna putih");
    }
}
