
public class ElectronicStore {
    String name;

    Desktop d1;
    Desktop d2;
    Desktop d3;

    Laptop l1;
    Laptop l2;
    Laptop l3;

    Fridge f1;
    Fridge f2;
    Fridge f3;
    Object[] stockArray= new Object[9];





    public ElectronicStore(String name){
        this.name=name;
        d1 = new Desktop(3.5,8,500,false);
        d2 = new Desktop(3.0,16,250,true);
        d3 = new Desktop(4.3,32,500,true);
        stockArray[0]=d1;
        stockArray[1]=d2;
        stockArray[2]=d3;

        l1= new Laptop(3.1,32,500,true, 15);
        l2= new Laptop(2.5,8,250,false, 13);
        l3= new Laptop(3.0,16,250,true, 15);
        stockArray[3]=l1;
        stockArray[4]=l2;
        stockArray[5]=l3;

        f1= new Fridge(16.5,true,"Black");
        f2= new Fridge(12.0,false,"White");
        f3= new Fridge(23.0,true,"Stainless Steel");
        stockArray[6]=f1;
        stockArray[7]=f2;
        stockArray[8]=f3;

    }

    public void printStock(){
        System.out.println("The store stock includes:");
        for (int i=0; i<9;i++){
            System.out.println(stockArray[i]);
        }
    }
    public boolean searchStock(String searchTerm){
        for (int i=0; i<9; i++){
            String toStringReturned=(stockArray[i].toString()).toLowerCase();
            if (toStringReturned.contains(searchTerm.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
