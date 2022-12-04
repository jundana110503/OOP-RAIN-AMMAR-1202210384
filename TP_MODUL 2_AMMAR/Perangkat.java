public class Perangkat {
    protected String drive;
    protected int ram;
    protected Double procesor;
    protected boolean webcam;

    public Perangkat(String drive, int ram, Double procesor, boolean webcam) {
    this.drive = drive;
    this.ram = ram;
    this.procesor = procesor;
    this.webcam = webcam;
    }

    public void Pemberitahuan(){
        System.out.println("Perangkat tidak diketahui memiliki drive type" +drive+ "Dengan RAM sebesar" +ram+
        "GB dan Procesor secepat" +procesor+ "GHZ");
    }
}

