  import java.lang.Math;

  public class Loopier {

    public static int[] arrayRandInts(int size) {
      int[] randInts = new int[size];
      for (int x = 0 ; x < size ; x += 1) {
        randInts[x] = (int)(Math.random() * 10);
      }
      return randInts;
    }


    public static String strArrayInts(int[] intArray) {
      String out = ("{" + intArray[0]);
      for (int x = 1 ; x < intArray.length ; x += 1) {
        out += ", " + intArray[x];
      }
      out += "}";
      return out;
    }


    public static int linSearch(int[] a, int target) {
      for (int x = 0 ; x < a.length ; x += 1) {
        if (a[x] == target) {
          return x;
        }
      }
      return -1;
    }

    
    public static int linSearchR(int[] a, int target) {
      int leng = a.length - 1



      
      if (a[0] == target) {
        return
      }
    }

    public static int freq( int[] a, int target ) {
      int answer = 0;
      int counter = 0;
      while (counter < a.length - 1) {
        if (a[counter] == target) {
          answer ++;
        }
        counter ++;
      }
      return answer;
    }


    public static void main(String[] args) {
      int[] local = arrayRandInts(5);
      System.out.println("Testing printing the string: " + strArrayInts(local));
      System.out.println("Testing looking for an index of an int in the string: " + linSearch(local, 5));
      System.out.println("Testing looking for a frequency of an int in the string: " + freq(local, 5));
    }
}
