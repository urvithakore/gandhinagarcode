package apex.java.assign15.SamplePrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

// to remove duplicate elements from sorted array.

public class RemoveDupElementsSortedArray {

	public static Object[] removeDuplicateUsingSet(int Arr[])
	{
		int arrlen = Arr.length;
		Set<Integer> s = new LinkedHashSet<Integer>();
		for(int i=0;i<arrlen;i++)
		{
			s.add(Arr[i]);
		}
		
		return(s.toArray());
	}
	
	public static int[] removeDuplicateUsingArray(int Arr[])
	{
		int arrlen=Arr.length;
		int[] TempArr= new int[arrlen];
		for(int i=0, j=0;i<arrlen;)
		{
			TempArr[j]=Arr[i];
			while(i<(arrlen-1) && (Arr[i]==Arr[i+1]))
			{
				i++;
			}
				
			i++; j++;
		}
		
		return TempArr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int int_array[] ={1,1,2,3,12,12,34,34,34,56};
		Object resultarr[] = removeDuplicateUsingSet(int_array);
		for(int i=0; i<resultarr.length;i++)
		{
			System.out.print((int)resultarr[i]+" ");
		}	
		System.out.println();
		int int_resultarr[] = removeDuplicateUsingArray(int_array);
		for(int i=0; i<int_resultarr.length;i++)
		{
			System.out.print(int_resultarr[i]+" ");
		}	
		

	}
	
	/*
	 * public class RemoveDuplicatefromList{
	 * 
	 * }
	 */


}

