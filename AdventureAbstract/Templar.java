public class Templar extends Character implements Healer, Tank{

    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
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
        target.takeDamage(6);  
    }
   @Override
    public int getShield() {
        return this.shield;
    }
    @Override
    public void takeDamage(int damage) {
        int finalDamage = damage - this.shield;
        if (finalDamage < 0) finalDamage = 0;
        setCurrentHealth(getCurrentHealth() - finalDamage);
    }

    @Override
    public String toString() {
        if (getCurrentHealth() == 0) {
            return getName() + " is a dead templar. Its shield was not enough.";
        }
        return getName() + " is a templar with " + getCurrentHealth() + " HP, a shield of " + shield + ", and can heal " + healCapacity + " HP and has a shield of " +this.shield + ".";
    }
}
