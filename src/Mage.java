public class Mage extends Player {
    public Mage(int hp, int mp, int str, int intel, int dex, int luck,int charisma, String name) {
        super(hp, mp, str, intel, dex, luck, charisma, name);
    }

    public void Teleport() {
        System.out.println("You teleport to the nearest town.");
    }
}
