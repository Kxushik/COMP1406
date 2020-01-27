public class AddressTester {
    public static void main(String[] args){
        //Declaration
        Address a1;

        //Insantiation
        a1= new Address();

        Address a2 = new Address(); //Combined two steps in one
        //Initilization

        a1.street= "Macy Blvd.";
        a1.country="Canada";
        a1.city= "Ottawa";
        a1.province="Ontario";
        a1.postalCode="K1Z7K1";

        a2.street="Bell St N";
        a2.country="Canada";
        a2.city= "Ottawa";
        a2.province="Ontario";
        a2.postalCode="K1R7A1";

        System.out.println(a1.street);
        System.out.println("a2 street: "+a2.street);
    }
}
