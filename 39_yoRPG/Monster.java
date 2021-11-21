public class Monster {
  private int hp;
  private int defense;
  private int atk;

  public Monster() {
    hp = 200;
    defense = 50;
    atk = 60;
  }

  public void bleed(int dmg) {
    hp -= dmg; 
  }

  public int attack(Protagonist protagonist) {
    int damage = atk - defense;
    if (damage > 0) {
      protagonist.bleed(damage);
    }
    return damage;
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

  public int getATK() {
    return atk;
  }




  // changing instance variables

  public int setHP(int newHP) {
    hp = newHP;
  }

  public int setDefense(int newDefense) {
    defense = newDefense;
  }

  public int setATK(int newATK) {
    atk = newATK;
  }
}
