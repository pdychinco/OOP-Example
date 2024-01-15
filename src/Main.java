public class Main {
    public static void main(String[] args) {
        Warrior char1 = new Warrior(123,41,23,1,10,5, 2,"Princeton");
        Mage char2 = new Mage(200,1000,3,1000,3,6,10,"Inez");
        char1.Attack();
        char2.Attack();
        char2.PrintStats();
        char2.LevelUp();
        if(char1.getDex() < 15) {
            System.out.println("you suck. you have no dex. go back to killing slimes scrub");
        } else {
            System.out.println("You dodged the arrows");
        }
        char1.PrintStats();
        char1.LevelUp();
        char1.PrintStats();

        System.out.println();
        char1.PowerAttack();
        char2.Teleport();
    }
}
