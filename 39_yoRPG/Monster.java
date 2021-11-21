public class Monster {
  private int hp;
  private int defense;
  private int atk;

  public Monster() {
    hp = 200;
    defense = 10;
    atk = (int) (Math.random() * 30 + 11);
  }

  public void bleed(int dmg) {
    hp -= dmg;
  }

  public int attack(Protagonist protagonist) {
    int damage = (int)(getATK() - protagonist.getDefense());
    if (damage > 0) {
      protagonist.bleed(damage);
    } else {
      damage = 0;
    }
    return damage;
  }

  public boolean isAlive(){
    return hp > 0;
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

  public void setHP(int newHP) {
    hp = newHP;
  }

  public void setDefense(int newDefense) {
    defense = newDefense;
  }

  public void setATK(int newATK) {
    atk = newATK;
  }
}
