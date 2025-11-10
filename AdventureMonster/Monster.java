public class Monster extends Character{
    public Monster(String namee , int maxHealth){
        super(namee , maxHealth);
    }
    @Override
    public String toString(){
        if (getCurrentHealth() != 0 ){
            return getName()+ " is a monster with " +  getCurrentHealth()+ " HP";
        }
        return getName() + " is a monster and is dead";
    }
}