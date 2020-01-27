public class CustomerTestProgram {
    public static void main(String args[]){
        Customer c;
        c= new Customer("bob");
        //c.name="Bob";
        c.age=24;
        c.money=50;
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.money);
    }
}
