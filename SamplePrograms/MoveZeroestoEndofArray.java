package apex.java.assign15.SamplePrograms;
import java.util.Arrays;
// program to move every zero to the right side of a given array of integers
public class MoveZeroestoEndofArray {

	
	public static int[] Movezeros(int[] nums) {
	     if (nums == null) {
	      throw new IllegalArgumentException("Null array!");
	    }
	    boolean swap = true;
	    while (swap) {
	      swap = false;
	      for (int i = 0; i < nums.length - 1; i++) {
	        if (nums[i] == 0 && nums[i + 1] != 0) {
	          swap(nums, i, i + 1);
	          swap = true;
	        }
	      }
	    }
		return nums;
	  }
	  private static void swap(int[] nums, int a, int b) {
	    int temp = nums[a];
	    nums[a] = nums[b];
	    nums[b] = temp;
	  }
	    public static void main(String[] args) {
			int[] nums = {0,31,24,0,10,25,5,0};
			System.out.println("\nOriginal array: "+Arrays.toString(nums));  
			int[] result = Movezeros(nums);
	 		System.out.println("\nResult: " + Arrays.toString(result));		
			}

}
