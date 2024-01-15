public class Warrior extends Player{
    public Warrior(int hp, int mp, int str, int intel, int dex, int luck, int charisma, String name) {
        super(hp, mp, str, intel, dex, luck,charisma, name);
    }

    public void PowerAttack() {
        System.out.println("You swing your massive sword and deal 10 dmg.");
    }
}
