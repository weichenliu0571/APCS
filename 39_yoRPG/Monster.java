public class Monster {
  private int hp;
  
  public Monster() {
  }
  
  public boolean isAlive(){
    if (hp > 0) {
      return true;
  }
    return false;
  }
  
  
}
