/*
Giant Lotus (Ryan Lau, Brian Li, Weichen Liu)
APCS
HW08 -- Refactor Freshie Zero
2021-09-30
*/

/*
DISCOVERIES
 0. If you update Greet.java, you have to re-javac Greet.java so that java Greet runs the updated Greet.java.
UNRESOLVED QUESTIONS
 0. Are we supposed to randomly pick 1 of the 3 hardcoded persons to greet?
*/

public class Greet {
    public static void main(String[] args) {
        greet("Kevin Durant");
        greet("Jordan Clark");
        greet("Lebron James");
    }
    
    public static void greet(String name) {
    	System.out.println("Why, hello there, " + name + ". How do you do?");
    }
}
