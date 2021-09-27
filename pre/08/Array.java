/* Weichen Liu
APCS
HW05 -- SummerHW08
2021-09-27
*/

import java.util.Arrays;

public class Array {
	
	
	public static double[] powArray(double a[], int power) {
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i], power);
		}
		return b;
	}
	
	public static int[] histogram(int array[], int counters) {
		int[] counts = new int[counters];
		for (int a : array) {
			counts[a]++;
		}
		return counts;
	}
	
	public static void printArray(double[] b) {
		System.out.print("{" + b[0]);
		for (int i = 1; i < b.length; i++) {
		System.out.print(", " + b[i]);
		}
		System.out.println("}");
		
	}
	
	
		public static void printArray2(int[] b) {
		System.out.print("{" + b[0]);
		for (int i = 1; i < b.length; i++) {
		System.out.print(", " + b[i]);
		}
		System.out.println("}");
		
	}
	
	public static int indexofMax(int array[]){ // Exercise 4, You can but you will also have to have another counter on the side. It is just much more work. 
		int Answer = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1]) {
				Answer = i;
			}
		}
		return Answer;
	}
	
   public static boolean[] sieve(int x){
        boolean[] array = new boolean[x];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
            }
            
        array[0] = false;
        array[1] = false;
        
        for (int i = 2; i < array.length; i++) {
            if (array[i] == true) {
                for (int j = 2; i * j < array.length; j++) {
                    array[i * j] = false;
                }
            }
                
        }
        
        return array;
    }
	
	
	public static void main(String[] args) {
		double[] b = powArray(new double[]{1.0, 2.0, 3.0}, 2);
		printArray(b);
		int AnswerIndex = indexofMax(new int[]{1, 2, 3, 5, 4});
		System.out.println(AnswerIndex);
		int[] counts = histogram(new int[]{1, 2, 3, 5, 4}, 100);
		printArray2(counts);
		System.out.println(Arrays.toString(sieve(10)));
	}
}


