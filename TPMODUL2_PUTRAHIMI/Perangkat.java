public class Perangkat {

    String drive;
    int ram;
    float processor;

    public Perangkat(String drive, int ram, float processor) {

        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void informasi() {
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram +
        " GB dan processor secepat " + processor + " Ghz\n");
    }

}