public class Protagonist {
  private String name;
  private int hp;
  private int defense;
  private int atk;
  private int specialpower;




  public Protagonist() {
    name = "Pat";
    hp = 200;
    defense = 10;
    atk = 20;
    specialpower = (int) Math.random() * 15;
  }

  public Protagonist( String setName) {
    this();
    name = setName;
  }


  // methods

  public boolean isAlive(){
    if (hp > 0) {
      return true;
  }
    return false;
  }

  public void bleed(int dmg) {
    hp -= dmg;
  }

  public void specialize() {
    atk += specialpower;
  }

  public void normalize() {
    defense += specialpower;
  }

  public int attack(Monster monster) {
    int damage = atk - defense;
    if (damage > 0) {
      monster.bleed(damage);
    }
    return damage;
  }

  //accessing instance variable

  public String getName () {
    return name;
  }

  public int getHP () {
    return hp;
  }

  public int getDefense () {
    return defense;
  }

  public int getATK () {
    return atk;
  }



  //Changing instance variables

  public void setName (int newName) {
    name = newName;
  }

  public void setHP (int newHP) {
    hp = newHP;
  }

  public void setDefense (int newDefense) {
    defense = newDefense;
  }

  public void setStrength (int newATK) {
    atk = newATK;
  }


}
