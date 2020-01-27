public class Desktop {
    double CPU;
    int RAM;
    int storage;
    //SSD - True, HDD - False
    boolean SSD;

    public Desktop(double cpu, int ram, int iStorage, boolean ssd){
        CPU = cpu;
        RAM=ram;
        storage=iStorage;
        SSD=ssd;
    }
    public String toString(){
        if (!SSD) {
            return ("Desktop PC with " + CPU + "ghz CPU," + " " + RAM + "GB RAM," + " " + storage + "GB HDD drive.");
        }
        return ("Desktop PC with " + CPU + "ghz CPU," + " " + RAM + "GB RAM," + " " + storage + "GB SSD drive.");
    }
}
