public class Customer {
    String name;
    int age;
    float money;
    boolean admitted;

    public Customer(){
        admitted=false;
    }
    public Customer(String initName){
        name = initName;
        age=0;
        money=0.0f;
        admitted=false;
    }
    public Customer(String initName, int initAge){
        name=initName;
        age=initAge;
        admitted=false;
    }
    public Customer(String initName, int initAge, float initMoney){
        name=initName;
        age=initAge;
        money=initMoney;
        admitted=false;
    }

    public float computeFee(){
        if (age >= 18&&age<=65){
            return 12.75f;
        }
        else if (age<=3){
            return 0;
        }
        else if (age>=4 && age<=17){
            return 8.50f;
        }
        return (0.5f*12.75f);
    }

    public boolean spend(float amount){
        if (amount>=0) {
            if (money >= amount) {
                this.money = money - amount;
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    public boolean hasMoreMoneyThan(Customer c){
        if (money>c.money){
            return true;
        }
        return false;
    }
    public void payAdmission(){
        spend(computeFee());
        if ((spend(computeFee()))==true) {
            admitted = true;
        }
    }

    public String toString(){
        if (admitted==false) {
            return ("Customer " + name + ": a " + age + " year old with $" + money + " who has not been admitted");
        }
        return ("Customer " + name + ": an" + age + " year old with $" + money + " who has been admitted");
    }
}

