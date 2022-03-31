// Mister George :: Diana Akhmedova, Ziying Jian, Weichen Liu
// APCS pd08
// HW85 -- Leon Leonwood Stack
// 2022-03-31t
// time spent : 0.5 hrs

/*
DISCO
- Z needs to be changed to Comparable.
- We do not need to keep track of size() as ArrayList and LinkedList do that for us already.

QCC
- Why does Z need to be changed to Comparable?
- What other methods will we be implementing for stacks?
*/

/***
 * class ALStack
 * v1
 * Implements a stack of PANCAKES using an encapsulated ArrayList
 **/

import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE>
{
  private ArrayList<PANCAKE> _stack;



  public ALStack(  )
  {
    _stack = new ArrayList();
  }


  public void push( PANCAKE s )
  {
    _stack.add(s);
  }


  public PANCAKE pop()
  {
    if ( isEmpty() )  {
        return null;
    }

    return _stack.remove(_stack.size() - 1);
  }


  public PANCAKE peekTop()
  {
    if ( isEmpty() )  {
        return null;
    }
    return _stack.get(_stack.size() - 1);
  }


  public boolean isEmpty()
  {
    return (_stack.size() == 0);
  }

}
