import java.util.Random;

public class Archer extends Warrior implements Skills {
    Random random = new Random();

    private Archer(int health, int damage) {
        super(health, damage);
    }

    public Archer() {
        setDamage(270 + random.nextInt(60));
        setHealth(600);
    }

    @Override
    void attack(Warrior warrior, int damage) {
        System.out.println("Archer took " + damage + " damage");
    }

    @Override
    void takeDamage(Warrior warrior, int damage) {
        System.out.println("Archer loose " + damage + " health");
        warrior.setHealth(getHealth() - damage);
    }

    @Override
    public int skillActivation() {
        if (getHealth() < 300) {
            System.out.println("Your skill is ready");
            setDamage(100);
            setHealth(getHealth() + getDamage());
            return 0;
        }
        return 0;
    }


}
