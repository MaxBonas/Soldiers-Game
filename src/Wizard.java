import java.util.concurrent.TimeUnit;

public class Wizard extends Player implements Attacker {



    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public String toString() {
        return "\n Wizard{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", hp=" + getHp() +
                ", isAlive=" + isAlive() +
                ", mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

    @Override
    public int getNextAttackDamage() {
        if (getMana() >= 5) {
            return getIntelligence();
        }
        return 2;
    }

    private void spendMana() {
        if (getMana() >= 5) {
            setMana(getMana() - 5);
        }
        else {
            setMana(getMana() + 1);
        }
    }
    @Override
    public void attack(Player player) throws InterruptedException {
        spendMana();
        player.setHp(player.getHp() - getNextAttackDamage());
        if (player.getHp() <= 0) player.setAlive(false);
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println("               " + (char)27 + "[40m" + "(∩ꖘ_ꖘ)⊃━☆ﾟ.*:☆ﾟ:(☉ѽ☉)" + (char)27 + "[0m");
        System.out.println("               " + getName() + " dealt " + (player.getHp() - getNextAttackDamage()) + " damage.\n");
    }
}