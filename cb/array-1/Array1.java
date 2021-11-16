public class Array1 {
  public static boolean firstLast6(int[] nums) {
    return (nums[0]==6 || nums[nums.length - 1]==6);
  }
  public static boolean sameFirstLast(int[] nums) {
    return (nums.length > 0 && nums[0]==nums[nums.length - 1]);
  }
  public static int[] makePi() {
    int [] pi = {3, 1, 4};
    return pi;
  }
  public static boolean commonEnd(int[] a, int[] b) {
    return (a[0]==b[0] || a[a.length - 1]==b[b.length - 1]);
  }
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
    
    System.out.println(makePi(new int[]{3, 1, 4})); // [3, 1, 4]
    
    System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3})); // true
    System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
    System.out.println(commonEnd(new int[]{1, 2, 3}, new int[]{1, 3})); // true
    
    System.out.println(sum3(new int[]{1, 2, 3})); // 6
    System.out.println(sum3(new int[]{5, 11, 2})); // 18
    System.out.println(sum3(new int[]{7, 0, 0})); // 7
    
  }
}
