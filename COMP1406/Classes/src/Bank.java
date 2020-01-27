public class Bank {
    String name;
    Person manager;
    BankAccount[] accounts;
    float interestRate;

    public Bank(){
        
    }

    public String toString(){
        return name+" with manager "+manager;
    }
}
