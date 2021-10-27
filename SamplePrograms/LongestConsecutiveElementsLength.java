package apex.java.assign15.SamplePrograms;

import java.util.HashSet;
import java.util.Set;
// Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
public class LongestConsecutiveElementsLength {
	
	public static int FindConsecutiveElemsLength(int Arr[])
	{
		int arrlen = Arr.length;
		int result = 0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arrlen;i++)
			set.add(Arr[i]);
		for(int i=0;i<arrlen;i++)
		{
			if(!set.contains(Arr[i]-1))
			{
				int j=1;
				while(set.contains(Arr[i]+j))
				{
					j++;
				}
				if(j>result) result = j;
			}
		}
		
		//String 
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Arr[]= {45,46,34,3,7,44,5,9,6,43,};
		int len = FindConsecutiveElemsLength(Arr);
		System.out.println("Longest consecutive length: "+len);
		
	}

}
