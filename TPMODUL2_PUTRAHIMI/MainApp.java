public class MainApp {

    public static void main(String[] args) {

        Perangkat pgkt  = new Perangkat("Seagate", 4, 1.60F);
        pgkt.informasi();
        System.out.println("");
        Laptop pc = new Laptop("HDD", 16, 2.90F, false);
        pc.informasi();
        pc.bukaGame("Asseto");
        pc.kirimEmail("putra@gmail.com");
        pc.kirimEmail("rahim@gmail.com", "tony@gmail.com\n");
        Handphone hp = new Handphone("Tensor", 12, 1.80F, true);
        hp.informasi();
        hp.telfon(245783103);
        hp.kirimSMS(245783103);
        hp.kirimSMS(245783103, 5732190);
    }
}
