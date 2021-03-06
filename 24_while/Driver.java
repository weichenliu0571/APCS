
// TNPG: kraken (Ryan Lau + Jon and Weichen Liu + Blueface)
// APCS
// HW24 -- Using while loop to determine numbers of matches
// 2021-10-25
// time spent: 1.0 hrs

/*
DISCOVERIES
    0. ! can be used in front of a boolean expression in the while loop to control a case where the boolean expression is not met. 

UNRESOLVED QUESTIONS
    0. Is it possible to use multiple while loops to make the code cleaner? 
    
POST-v0 MODS
      0. Removed the reset of name and value in .reset()
*/

/***
    driver for class Coin

    ~~~ SUGGESTED WORKFLOW: ~~~
    1. Compile this file and run. Note anything notable.
    2. Move the "TOP" line down, so that it is below the first statement.
    (emacs: with cursor at beginning of TOP line, C-k C-k, DOWN, DOWN, C-y)
    (your editor: ???)
    3. Compile and run again.
    4. Resolve errors one at a time until it works.
    5. Repeat 2-4 until TOP meets BOTTOM.
***/

public class Driver {
    public static void main(String[] args) {
        Coin uno = new Coin();
        Coin dos = new Coin();

        int matches = 0;
        int minMatches = 100000;
        int minHeads = 300000;
        int yearOfBirth = 2005;

        while (!(matches > 65536 && matches % yearOfBirth == 0 && matches > minMatches && uno.getHeadsCtr() + dos.getHeadsCtr() > minHeads)) {
            if (uno.flip() == dos.flip()) {
                matches++;
            }
        }

        System.out.println("num of matches: " + matches);
        System.out.println("num of flips: " + uno.getFlipCtr());
        System.out.println("num of total heads: " + (uno.getHeadsCtr() + dos.getHeadsCtr()));
    }
}
