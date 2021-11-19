public class Protagonist {
  private String name; 
  private int hp;
  private int defense;
  private int stength;
  

    
    
  public Protagonist() {
    name = "Pat";
    hp = 200;
    defense = 10;
    strength = 20;
  }
  
  public Protagonist( String setName) {
    name = setName;
  }
  
  public boolean isAlive(){
    if (hp > 0) {
      return true;
  }
    return false;
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
  
  public int getStrength () {
    return strength; 
  }
  
 
  
  //Changing instance variables
  
  public setName (int newName) {
    name = Newname;
  }
  
  public setHP (int newHP) {
    hp = newHP;
  }
  
  public setDefense (int newDefense) {
    return defense;
  }
  
  public setStrength (int newStrength) {
    return strength; 
  }
  
  
}
