import java.util.*;
public class ElectronicStoreTester {
    public static Scanner kbReader= new Scanner (System.in);
    public static void main(String args[]){
        String userInput=" ";
        boolean stockValue;
        boolean whileRun=true;
        ElectronicStore store = new ElectronicStore("Store");
        store.printStock();


        while (true){
            System.out.print("Enter a term to search for: ");
            userInput=kbReader.nextLine();

            if (userInput.equals("quit")){
                break;
            }
            stockValue=store.searchStock(userInput);

            if (stockValue){
                System.out.println("A matching item is contained in the store's stock");
            }
            else{
                System.out.println("No items in the store's stock match that term");
            }
        }
    }
}
