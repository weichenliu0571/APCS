// TNPG: kraken (Ryan Lau + Jon and Weichen Liu + Blueface)
// APCS
// HW23 -- What Does Equality Look Like?
// 2021-10-22
// time spent: 1.0 hrs

/*
DISCOVERIES
    0. The "this" keyword is an alias for THIS OBJECT.
UNRESOLVED QUESTIONS
    0. Should we assume the bias to be 0.5 and the upFace to be heads in the constructor?
    1. Should we use the "this" keyword when it is not necessary but to be more clear?
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
        // build Objects from blueprint specified by class Coin

        // test default constructor
        Coin mine = new Coin();
        
        // test 1st overloaded constructor
        Coin yours = new Coin("quarter");
        
        // test 2nd overloaded constructor
        Coin wayne = new Coin("dollar", "heads");
        
        // test toString() methods of each Coin
        System.out.println("mine: " + mine);
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);
        
        // test flip() method
        System.out.println("\nAfter flipping...");
        yours.flip();
        wayne.flip();
        System.out.println("yours: " + yours);
        System.out.println("wayne: " + wayne);
        
        // test equals() method
        if (yours.equals(wayne)) {
            System.out.println("Matchee matchee!");
        } else {
            System.out.println("No match. Firestarter you can not be.");
        }
        /*===================TOP==========================
        ====================BOTTOM======================*/
    }
}
