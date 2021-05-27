import java.util.Random;

public class Mage extends Warrior implements Skills {

    @Override
    public int skillActivation() {
        if (getHealth() < 150) {
            System.out.println("Your skill is ready");
            setDamage(getDamage() * 2);
            return 1;
        }
        return 0;
    }

    private Mage(int health, int damage) {
        super(health, damage);
    }

    public Mage() {
        Random random = new Random();
        setDamage(180 + random.nextInt(40));
        setHealth(800);
    }

    @Override
    void attack(Warrior warrior, int damage) {
        System.out.println("Mage took " + damage + " damage");
    }

    @Override
    void takeDamage(Warrior warrior, int damage) {

        System.out.println("Mage loose " + damage + " health");
        warrior.setHealth(getHealth() - damage);
    }


}
