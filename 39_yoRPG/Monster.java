public class Monster {
  private int hp;
  private int defense;
  private int strength;
  
  public Monster() {
  }
  
  public boolean isAlive(){
    if (hp > 0) {
      return true;
  }
    return false;
  }
  
  // accessing instance variables
  
  public int getHp () {
    return hp;
  }
  
  public int getDefense() {
    return defense;
  }
  
  public int getStrength() {
    return strength;
  }
  
  
  
  
  // changing instance variables
  
  public int setHP(int newHP) {
    hp = newHP;
  }
  
  public int setDefense(int newDefense) {
    defense = newDefense;
  }
  
  public int setStrength(int newStrength) {
    strength = newStrength; 
  }
}
