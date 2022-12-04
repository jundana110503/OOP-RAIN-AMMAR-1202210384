public class MainApp  {
        public static main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat(drive:"Marsalis", ram:16, procesor:6.00);
        perangkat1.informasi();
        System.out.println("");

        Handphone handphone1 = new Handphone(drive:"Iphone", ram: 4, procesor: 4.0, fingerprint:true);
        handphone1.informasi();
        handphone1.telfon(No_HP:087284679256);
        handphone1.KirimSMS(No_HP:087926946715);
        handphone1.telfon(No_HP2:087582493482);
        System.out.println("");

        
        Handphone laptop1 = new Laptop(drive:"NeptuneNet", ram: 32, procesor: 6.5, webcam:true);
        laptop1.informasi();
        laptop1.OpenGame(namagamenya: "fifa23");
        laptop1.KirimEMAIL(Email:"marsalis2003@gmail.com");
        laptop1.KirimEMAIL(Email1:"marsalis2003@gmail.com", emailkedua:"jundana2003@gmail.com");
        System.out.println("");
    }
}
