public class BankTester {
    public static void main(String[] args) {
    Person dave = new Person();
    dave.name="Dave";

    Bank bank = new Bank();
    bank.name="Scotiabank";
    bank.accounts = new BankAccount[15];
    bank.manager=dave;

    Bank bank2 = new Bank();
    bank2.name="TD BANK";
    bank2.accounts = new BankAccount[15];

    System.out.println(bank);
    System.out.println(bank2);
    }
}
