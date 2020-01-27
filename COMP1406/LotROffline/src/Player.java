public class Player {
    String name;
    int level;
    int currentHealth;
    int maxHealth;
    int strength;
    int dexterity;
    int intelligence;
    boolean alive;
    Item[] inventory;
    Armor[] armor;

    public Player(String n, int s, int d, int i){
        name=n;
        level=1;
        strength=s;
        dexterity=d;
        intelligence=i;
        currentHealth=100;
        maxHealth=100;
        alive=true;
        inventory= new Item[10];
        armor = new Armor[10];
    }

    public String toString(){
        return "bruh";
    }
}
