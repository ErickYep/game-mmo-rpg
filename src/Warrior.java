public abstract class Warrior implements Skills {
    private int health;
    private int damage;

    public Warrior(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public Warrior() {
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    abstract void attack(Warrior warrior, int damage);

    abstract void takeDamage(Warrior warrior, int damage);

    @Override
    public int skillActivation() {
        return 1;
    }
}
