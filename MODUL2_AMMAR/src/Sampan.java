public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("jenis sampan dengan kursi berjumlah" +jumlahKursi+ "Ditetapkan dengan biaya sebesar" + biaya + "");
    }

    @Override
    public void berlayar(){
        System.out.println("Jenis sampan sedang berlayar menggunakan " + layar + "");
    }

    @Override
    public void berlabuh(){
        System.out.println("Jenis Sampah berlabuh di pantai tanpa jangkar");

    }
    @Override
    public void berlabuh(int jangkar){
        System.out.println("Jenis sampan berlabuh di pantai menggunakan 2 jangkar");
    }
}


