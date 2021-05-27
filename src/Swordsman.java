import java.util.Random;

public class Swordsman extends Warrior implements Skills {


    @Override
    public int  skillActivation() {
        if (getHealth() < 250) {
            System.out.println("Your skill is ready");

            setHealth(getHealth() + 300);
            return 1;
        }
        return 0;
    }

    private Swordsman(int health, int damage) {
        super(health, damage);
    }

    public Swordsman() {
        Random random = new Random();
        setDamage(180 + random.nextInt(40));
        setHealth(800);
    }

    @Override
    void attack(Warrior warrior, int damage) {
        System.out.println("Swordsman took " + damage + " damage");
    }

    @Override
    void takeDamage(Warrior warrior, int damage) {
        System.out.println("Swordsman loose " + damage + " health");
        warrior.setHealth(getHealth() - damage);
    }


}
