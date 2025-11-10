public class Templar extends Character implements Healer , Tank{
    public  final int healCapacity;
    public  final int shield;
    public Templar(String name , int maxHealth , int healCapacity , int shield){
        super(name , maxHealth);
        this.shield = shield;
        this.healCapacity = healCapacity;        
    }
    @Override
    public int getHealCapacity(){
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
    public int getShield(){
        return this.shield;
    }
    @Override
    public String toString(){
        if (getCurrentHealth() == 0){
            return getName() +  "has been beaten, even with its " + this.shield + " shield. So bad, it could heal "+ getHealCapacity()+ " HP."; 
        }
        return  getName() + " is a strong Templar with " + getCurrentHealth() + " HP. It can heal "+ getHealCapacity() +" HP and has a shield of "+ this.shield +".";
    }
}