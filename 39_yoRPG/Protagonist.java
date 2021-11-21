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
    atk = 40;
    specialpower = (int) Math.random() * 15;
  }

  public Protagonist( String setName) {
    this();
    name = setName;
  }


  // methods

  public boolean isAlive(){
    return hp > 0;
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
    int damage = (int)(getATK() - monster.getDefense());
    if (damage > 0) {
      monster.bleed(damage);
    } else {
      damage = 0;
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

  public void setName (String newName) {
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
