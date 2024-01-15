public class Player {
    private int hp;
    private int mp;
    private int str;
    private int intel;
    private int dex;
    private int luck;
    private int charisma;
    private String name;

    public Player(int hp, int mp, int str, int intel, int dex, int luck, int charisma, String name) {
        this.hp = hp;
        this.mp = mp;
        this.str = str;
        this.intel = intel;
        this.dex = dex;
        this.luck = luck;
        this.name = name;
        this.charisma = charisma;
    }
    public void Attack() {
        System.out.println(this.name + " attacked");
    }
    public void LevelUp() {
        this.setDex(this.getDex()+1);
        this.setStr(this.getStr()+3);
        this.setIntel(this.getIntel()-1);
    }

    public void PrintStats() {
        System.out.println("Your strength is: " + this.getStr());
        System.out.println("Your int is: " + this.getIntel());
        System.out.println("Your dex is: " + this.getDex());
        System.out.println("Your charisma is: " + this.charisma);
    }
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getIntel() {
        return intel;
    }

    public void setIntel(int intel) {
        this.intel = intel;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
