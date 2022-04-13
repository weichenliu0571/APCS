// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW90 -- Swabbing the Deque
// 2022-04-06w
// time spent : 0.5 hrs

/**
DISCO:
- Deque has a front and a back
QCC:
- Why do we have addFirst if offerFirst is better? 
**/

public class QQKachoo<D> implements Deque<D>{

//ACCESSORS
    public D peekFirst();
    public D peekLast();

// MUTATORS 
  public void addFirst(D d);
  public void addLast(D d);

  public D removeFirst();
  public D removeLast();

  public D offerFirst(D d);
  public D offerLast(D d);
    
  public D pollFirst();    
  public D pollLast(); 

}
