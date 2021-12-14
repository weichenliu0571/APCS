/*****************************************************
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS pd6
HW47 -- Guess Number Game
2021-12-14
time spent:  0.5 hours
DISCO
- You can return nothing in a method of type void. 
- If a guess was too low, the _lo is replaced by guess +1 and if the guess was too high, the _hi was replaced by guess - 1. 
QCC
- When would using break be better than returning nothing?
 *****************************************************/

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
    DISCO:
    QCC:
 ***/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 1;
    //pick random number in range [a,b]
    _target = (int) (Math.random()*(_hi+1) + a);
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

    //3 cases: we either found it, too hi, too lo
    if (guess == _target) {
      System.out.println("Correct! It took " + _guessCtr + " guesses");
    }
    else {
      if (guess > _target) {
        System.out.println("Too high");
        if ( guess > _hi) {
            System.out.println("YOUR GUESS IS OUTSIDE OF RANGE. PLEASE GUESS AGAIN!");
        } else {
            _hi = guess - 1; 
        }
      }
      else {
        System.out.println("Too low");
        if ( guess < _lo) {
            System.out.println("YOUR GUESS IS OUTSIDE OF RANGE. PLEASE GUESS AGAIN!");
        } else {
            _lo = guess + 1; 
        }
      }
      _guessCtr += 1;
      playRec();
    }
  }


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;

    while( true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo
      if (guess == _target) {
        System.out.println("Correct! It took " + _guessCtr + " guesses");
        return;
      }
      else {
        if (guess > _target) {
          if ( guess > _hi) {
              System.out.println("YOUR GUESS IS OUTSIDE OF RANGE. PLEASE GUESS AGAIN!");
          } else {
                _hi = guess - 1; 
          }
        }
        else {
          System.out.println("Too low");
          if ( guess < _lo) {
              System.out.println("YOUR GUESS IS OUTSIDE OF RANGE. PLEASE GUESS AGAIN!");
          } else {
              _lo = guess + 1; 
          }
        }
        _guessCtr++;
    }
  }
}


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    playRec();
    //playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {

    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //start the game
    g.play();

  }

}//end class GuessNumber
