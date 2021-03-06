// Weichen Liu + Blueface
// APCS pd06
// HW28 -- String2 from coding bat
// 2021-10-29
// time spent: .5 hour (30 minutes)

/*
DISCO
- We can prevent the OUTOFBOUNDS error by not allowing the .substring() to include an index of a string that is equal or greater than the length of the string.

QCC
- Is there a cleaner method that works like .substring()? Ex. Python lets you just include the index of the string to print a certain char from the string.

*/

public class String2 {
 // https://codingbat.com/prob/p165312 
    /*
     * Given a string, return a string where for every char in the original,
     * there are two chars.
     */
    public static String doubleChar(String str) {
      String result = "";
      for (int i = 0; i < str.length(); i++){
        result += str.substring(i, i+1) + str.substring(i, i+1);
      }
      return result;
    }
  
// https://codingbat.com/prob/p147448
    /*
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     */
  
    public int countHi(String str) {
      int result = 0;
      for (int i = 0; i < str.length() - 1; i ++) {
      if (str.substring(i,i+2).equals("hi")) {
          result = result + 1;
      }
      }
        return result;
    }
  
// https://codingbat.com/prob/p111624
    /*
     * Return true if the string "cat" and "dog" appear the same number of times
     * in the given string.
     */
    public boolean catDog(String str) {
      int numCat = 0;
      int numDog = 0;
      for (int i = 0; i < str.length() - 2; i ++) {
        if (str.substring(i, i+3).equals("cat")) {
          numCat = numCat + 1;
        } else if (str.substring(i, i+3).equals("dog")) {
          numDog = numDog + 1;
        } 
      }
      return numCat == numDog;
      }

  // https://codingbat.com/prob/p123614
    /*
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     */
  
      public int countCode(String str) {
      int result = 0;
      for (int i = 0; i < str.length() - 3; i ++) {
        if (str.substring(i, i + 4).equals("code")) {
          result = result + 1;
        } else if (str.substring(i, i + 2).equals("co") && str.substring(i+3, i+4).equals("e")) {
          result = result +1;
        }
      }
      return result;
    }
  
  
      public boolean xyzThere(String str) {
      if ((str.length() > 2) && ((str.substring(0, 3)).equals("xyz"))){
        return true;
      }

      for (int i = 0; i <= str.length(); i++){
        if (i + 4 <= str.length()){
          if (((str.substring(i+1, i+4)).equals("xyz") && (!(str.substring(i, i+1)).equals(".")))){
            return true;
          }
         }
        }
        return false;
      }

// https://codingbat.com/prob/p126880
    /*
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */
  
      public boolean endOther(String a, String b) {
      String nA = a.toLowerCase();
      String nB = b.toLowerCase();
      boolean result = false;
      if (nA.length() > nB.length()) {
        for (int i = 0; i < nA.length() - (nB.length() - 1); i++) {
          if (nA.substring(i, i + nB.length()).equals(nB)) {
            result = true;
          } else {
            result = false;
          }
        }
      } else {
        for (int i = 0; i < nB.length() - (nA.length() - 1); i++) {
          if (nB.substring(i, i + nA.length()).equals(nA)) {
            result = true;
          } else {
            result = false;
          }
          }
        }
    return result;
    }
  
  
  
    public static void main(String[] args) {
        System.out.println(doubleChar("The")); // "TThhee"
        System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
      
        System.out.println(countHi("abc hi ho")); // 1
        System.out.println(countHi("ABChi hi")); // 2
        System.out.println(countHi("hihi")); // 2
      
        System.out.println(catDog("catdog")); // true
        System.out.println(catDog("catcat")); // false
        System.out.println(catDog("1cat1cadodog")); // true
      
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
      
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
      
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }
  
}
