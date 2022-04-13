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
    private ArrayList<D> al; 
    
    public D peekFirst(){
        return al.get(0);
    }

    public D peekLast(){
        if (al.size() < 1) {
            return null;
        } else {
        return al.get(al.size() - 1);
        }
    }

    public void addFirst(D d) {
        al.add(0, d);
    }

    public void addLast(D d) {
        al.add(d);
    }

}
