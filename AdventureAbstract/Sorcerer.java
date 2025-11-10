public class Sorcerer extends Character implements Healer {

    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    @Override
    public int getHealCapacity() {
        return this.healCapacity;
    }

    @Override
    public void heal(Character target) {
        int newHealth = target.getCurrentHealth() + this.healCapacity;
        if (newHealth > target.getMaxHealth()) {
            newHealth = target.getMaxHealth();
        }
        target.setCurrentHealth(newHealth);
    }

    @Override
    public void attack(Character target) {
        this.heal(this);         
        target.takeDamage(10);    
    }

    @Override
    public void takeDamage(int damage) {
        setCurrentHealth(getCurrentHealth() - damage);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead sorcerer. So bad, it could heal " + healCapacity + " HP.";
        }
        return getName() + " is a sorcerer with " + getCurrentHealth() + " HP. It can heal " + healCapacity + " HP.";
    }
}
