
public class Handphone extends Perangkat {
    protected boolean fingerprint;
    protected String text;
    protected String drive;
    protected int ram;
    protected Double procesor;

    public Handphone(String drive, int ram, Double procesor, boolean fingerprint, boolean webcam) {
        super(drive, ram, procesor,webcam);
        this.fingerprint=fingerprint;
    }

    @Override
    public void Pemberitahuan() {
        if(fingerprint==true){
            text="Memiliki Fingerprint";
        }
        else{
            text="Tidak Memiliki Fingerprint";
        }
        System.out.println("Handphone memiliki drive type " + drive + "dengan Ram sebesar" + ram +
        "GB dan prosesor secepat" + procesor + "Selain itu handphone ini" +text);
    }

    public void telfon(int No_HP){
        System.out.println("Handphone Berhasil Menyambungkan Telpon Ke Nomer" + No_HP);
    }

    public void KirimSMS(int No_HP){
        System.out.println("Handphone Berhasil Mengirim Pesan Ke Nomer" + No_HP);
    }

    public void KirimSMS(int No_HP, int No_HP2){
        System.out.println("Handphone Berhasil Mengirim Pesan Ke Nomer" + No_HP);
    }
}