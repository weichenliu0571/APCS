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

public class Array2 {
  
// https://codingbat.com/prob/p162010
// Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

    public static int countEvens(int[] nums) {
      int local = 0;
      for (int element : nums) {
        if (element % 2 == 0) {
          local += 1;
        }
      }
      return local;
    }
 
// https://codingbat.com/prob/p196640
// Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
  
    public static int bigDiff(int[] nums) {
      int max = 0;
      int min = 999;
      for (int element : nums) {
        max = Math.max(max, element);
        min = Math.min(min, element);
      }
      return max - min;
    }
 
// https://codingbat.com/prob/p136585
// Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
  
    public static int centeredAverage(int[] nums) {
      int max = 0;
      int min = 999;
      int sum = 0;
      for (int element : nums) {
        max = Math.max(max, element);
        min = Math.min(min, element);
        sum += element;
      }
      return (sum - (max + min))/(nums.length - 2);
    }
  
// https://codingbat.com/prob/p127384
// Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
  
    public static int sum13(int[] nums) {
        int sum = 0;
        for (int x = 0; x < nums.length; x += 1) {
          if (x == 0 && nums[x] != 13) {
            sum += nums[x];
          }
          else if (nums[x] != 13 && nums[x-1] != 13) {
            sum += nums[x];
          }
        }
        return sum;
    }
  
// https://codingbat.com/prob/p111327
// Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
  
  
    public static int sum67(int[] nums) {
        int sum = 0;
        for (int x = 0; x < nums.length; x += 1) {
          if (nums[x] == 6) {
            while (nums[x] != 7) {
              x += 1;
            }
          }
          else {
            sum += nums[x];
          }
        }
        return sum;
    }
  
    public static void main(String []args) {
        int[] test1 = new int[] {2, 1, 2, 3, 4};
        System.out.println(countEvens(test1));
        int[] test2 = new int[] {10, 3, 5, 6};
        System.out.println(bigDiff(test2));
        int[] test3 = new int[] {1, 2, 3, 4, 100};
        System.out.println(centeredAverage(test3));
        int[] test4 = new int[] {1, 2, 2, 1, 13};
        System.out.println(sum13(test4));
        int[] test5 = new int[] {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum67(test5));
    }
}
