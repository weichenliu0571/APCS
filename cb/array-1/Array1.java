/*
Big Apples (Weichen Liu + Blueface, Jeffery Tang + Mathias, Lior + Toothless)
APCS
HW36 -- PPMP[]
2021-11-16
time spent: .5 hours
DISCO
- You can parameter pass an array by typing new int[]{array} as an arguement and placing the array inside the brackets. 
QCC
- What is the fastest way to print an array?
*/

public class Array1 {
  
  // https://codingbat.com/prob/p185685
  // Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
  
  public static boolean firstLast6(int[] nums) {
    return (nums[0]==6 || nums[nums.length - 1]==6);
  }
  
  // https://codingbat.com/prob/p118976
  // Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
  
  public static boolean sameFirstLast(int[] nums) {
    return (nums.length > 0 && nums[0]==nums[nums.length - 1]);
  }
  
  // https://codingbat.com/prob/p167011
  // Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
  
  public static int[] makePi() {
    int [] pi = {3, 1, 4};
    return pi;
  }
  
  // https://codingbat.com/prob/p191991
  // Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
  
  public static boolean commonEnd(int[] a, int[] b) {
    return (a[0]==b[0] || a[a.length - 1]==b[b.length - 1]);
  }
  
  
  public static String strArrayInts(int[] intArray) {
    String out = ("{" + intArray[0]);
    for (int x = 1 ; x < intArray.length ; x += 1) {
      out += ", " + intArray[x];
    }
    out += "}";
    return out;
  }
  
  // https://codingbat.com/prob/p175763
  // Given an array of ints length 3, return the sum of all the elements.
  
  public static int sum3(int[] nums) {
    int local = 0;
    for (int element : nums) {
      local += element;
    }
    return local;
  }
  
  public static void main (String[] args) {
    System.out.println(firstLast6(new int[]{1, 2, 6})); // true
    System.out.println(firstLast6(new int[]{6, 1, 2, 3})); // true
    System.out.println(firstLast6(new int[]{13, 6, 1, 2, 3})); // false
    
    System.out.println(sameFirstLast(new int[]{1, 2, 3})); // false
    System.out.println(sameFirstLast(new int[]{1, 2, 3, 1})); // true
    System.out.println(sameFirstLast(new int[]{1, 2, 1})); // true
    
    System.out.println(strArrayInts(makePi())); // [3, 1, 4]
    
    System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})); // true
    System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
    System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})); // true
    
    System.out.println(sum3(new int[]{1, 2, 3})); // 6
    System.out.println(sum3(new int[]{5, 11, 2})); // 18
    System.out.println(sum3(new int[]{7, 0, 0})); // 7
    
  }
}
