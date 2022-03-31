/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
    ALStack parenNums = new ALStack();
    ALStack operators = new ALStack();

    String[] arr = expr.split("\\s+"); 

    for (String element : arr) {
      if (element.equals("+") || element.equals("-") || element.equals("*") || element.equals("/")) {
        operators.push(element); 
      } else if (isNumber(element) || element.equals("(")) {
        parenNums.push(element); 
      } else {
          if (operators.peekTop().equals("+")) {
            parenNums.push(unload(1, parenNums));
            operators.pop(); 

          } else if (operators.peekTop().equals("-")) {
            parenNums.push(unload(2, parenNums));
            operators.pop(); 

          } else if (operators.peekTop().equals("*")) {
            parenNums.push(unload(3, parenNums));
            operators.pop();           

          } else {
            parenNums.push(unload(4, parenNums));
            operators.pop(); 

          }
      }
    }

  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, ALStack<String> numbers )
  {
        while (!(parenNums.peekTop().equals("("))) {
          int temp = (int) parenNums.peekTop();
          parenNums.pop();

          if (op == 1) {

            int tempAdd = (int) parenNums.peekTop();
            temp = temp + tempAdd;
            parenNums.pop();

          } else if (op == 2) {

            int tempSubtract = (int) parenNums.peekTop();
            temp = temp - tempSubtract;
            parenNums.pop();

          } else if (op == 3) {

            int tempMultiply = (int) parenNums.peekTop();
            temp = temp * tempMultiply;
            parenNums.pop();

          } else {
            int tempDivide = (int) parenNums.peekTop();
            temp = temp / tempDivide;
            parenNums.pop();
          }
        }

        parenNums.pop(); // to remove open parenthesis

        return "" + temp; 

  }//end unload()



  public static boolean isNumber( String s ) {
    try {
      Integer.parseInt(s);
      return true;
    }
    catch( NumberFormatException e ) {
    return false;
    }
  }



  //main method for testing
  public static void main( String[] args )
  {


      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7
          /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
