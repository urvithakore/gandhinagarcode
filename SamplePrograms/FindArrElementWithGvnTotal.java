package apex.java.assign15.SamplePrograms;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;
import java.util.HashSet;

// Given an array of integers, find two numbers such that they add up to a specific target number

public class FindArrElementWithGvnTotal {

	public  static Object[] FindArrEleWithGivenTotal(int Arr[],int Total)
	{
		int[] arr= Arr;
		int arrlen = Arr.length;
		
		Vector<Set<Integer>> v = new Vector<Set<Integer>>(2);	
		for(int i=0;i<arrlen;i++)
		{			
			for(int j=0;j<arrlen;j++)
			{
				if(j==i) continue;
				if((arr[i]+arr[j])==Total)
				{
					Set<Integer> s = new HashSet<>();
					s.add(i);
					s.add(j);
					if(!v.contains(s))
					{	
						v.add(s);
					}
				}		
			}
		}
		Object[] set =v.toArray();
		return set;
	}
	
	public static void main	(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int Total = 0;
		System.out.println("Enter Total");
		if(inp.hasNextInt())
		{
			Total = inp.nextInt();
		}
		int int_array[] = {12,34,56,23,45,89,20,66,36,40,25,42};
		
		inp.close();	
		
		Object[] result=FindArrEleWithGivenTotal(int_array, Total);
		if (result.length == 0) 
		{
			System.out.println("Total not found");
		}
		for(int i=0;i<result.length; i++)
		{	
			Set<Integer> s = (Set<Integer>) result[i];
			for (Integer ele:s)
			{
				System.out.print(int_array[ele] + " "); 
			}	
			System.out.println();
		}	
	}
}
