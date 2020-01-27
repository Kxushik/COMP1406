public class Fridge {
    double Size;
    //True - Has Freezer
    boolean Freezer;
    String Color;

    public Fridge(double size, boolean freezer, String color){
        Size=size;
        Freezer=freezer;
        Color=color;
    }
    public String toString(){
        if (!Freezer){
            return(Size+" cu. ft. Fridge"+" ("+Color+")");
        }
        else{
            return(Size+" cu. ft. Fridge with Freezer"+" ("+Color+")");
        }
    }
}
