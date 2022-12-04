public class Handphone extends Perangkat {

    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi() {
        if(fingerprint==true){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz. Selain itu handphone ini juga memiliki Fingerprint");
        }
        else if(fingerprint==false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + 
            " GB dan processor secepat " + processor + " Ghz.  Selain itu handphone ini TIDAK memiliki Fingerprint");
        }
    }

    public void telfon(int no_hp) {
        System.out.printf("Handphone berhasil menyambungkan telfon ke No %d ", no_hp);
    }

    public void kirimSMS(int no_hp) {
        System.out.printf("\nHandphone berhasil mengirim SMS ke No %d", no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2) {
        System.out.printf("\nHandphone berhasil mengirim SMS ke No %d dan %d", no_hp1, no_hp2);
    }
}