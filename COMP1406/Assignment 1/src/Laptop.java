public class Laptop {
    double CPU;
    int RAM;
    int storage;
    //SSD - True, HDD - False
    boolean SSD;
    int screenSize;

    public Laptop(double cpu, int ram, int iStorage, boolean ssd, int screensize){
        CPU = cpu;
        RAM=ram;
        storage=iStorage;
        SSD=ssd;
        screenSize=screensize;
    }
    public String toString(){
        if (!SSD){
            return (screenSize+"\""+" Laptop PC with "+CPU+"ghz CPU, "+RAM+" GB RAM, "+storage+"GB HDD drive.");
        }
        else{
            return (screenSize+"\""+" Laptop PC with "+CPU+"ghz CPU, "+RAM+" GB RAM, "+storage+"GB SSD drive.");

        }
    }
}
