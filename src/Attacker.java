public interface Attacker {

    int getNextAttackDamage();
    void attack (Player player) throws InterruptedException;
}
