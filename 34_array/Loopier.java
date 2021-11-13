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
  public static void main(String[] args) {
    int[] local = arrayRandInts(5);
    System.out.println(strArrayInts(local));
    System.out.println(linSearch (local, 5));
  }
}
