public class Laptop extends Perangkat {
    protected String text;
    protected int ram;
    protected Double procesor;
    protected boolean webcam;
    protected String drive;


    public Laptop(String drive, int ram, Double procesor, boolean webcam) {
        super(drive, ram, procesor,webcam);
        this.webcam=webcam;
    }

    @Override
    public void Pemberitahuan() {
        if(webcam==true){
            text="Memiliki Webcam";
        }
        else{
            text="Tidak Memiliki Webcam";
        }
        System.out.println("Laptop memiliki drive type " + drive + "dengan Ram sebesar" + ram +
        "GB dan prosesor secepat" + procesor + "Selain itu laptop ini" +text);
    }

    public void OpenGame(String namagamenya){
        System.out.println("Laptop Berhasil Membuka Game" + namagamenya);
    }

    public void KirimEMAIL(String Email){
        System.out.println("Laptop Mengirim Email Ke" + Email);
    }

    public void KirimEMAIL(String Email1, String emailkedua){
        System.out.println("Laptop Mengirim Email Ke" + Email1 + "Dan Ke" +emailkedua);
    }
}