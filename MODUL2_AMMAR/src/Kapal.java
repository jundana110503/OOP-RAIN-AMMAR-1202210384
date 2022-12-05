public class Kapal extends TransportasiAir {
    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Jenis Kapal dengan kursi berjumlah" +jumlahKursi+ "diteapkan dengan biaya" +biaya+"");
    }
    @Override
    public void berlayar(){
        System.out.println("jenis kapan sedang berlayar menggunakan mesin diesel dengan kecepatan yang tidak stabil" +layar+"");

    }
    @Override
    public void berlayar(int kecepatan){
        kecepatan += kecepatan;
        System.out.println("Jenis Kapal Sedang berlayar menggunakan mesin diesel dengan kecepatan" +kecepatan+)
    }
}
        