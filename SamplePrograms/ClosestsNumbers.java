package apex.java.assign15.SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestsNumbers {
	
	public static Integer[] findClosestNums(int[] numarr)
	{
		List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(numarr);
		int min_diff = Integer.MAX_VALUE;
		int new_diff = Integer.MAX_VALUE;
		//int diff = list.stream().max((a,b)->Math.abs(a,b)).foreach(System.out::println);
		for(int i=0;i<numarr.length - 1;i++)
		{
			new_diff = Math.abs(numarr[i]-numarr[i+1]);
			if(new_diff<min_diff)
			{
				min_diff=new_diff;
			}
		}
		for(int i=0;i<numarr.length-1;i++)
		{
			new_diff = Math.abs(numarr[i]-numarr[i+1]);
			if(new_diff == min_diff)
			{
				list.add(numarr[i]);
				list.add(numarr[i+1]);
			}
		}
		Object[] objarr = list.toArray();
		return  Arrays.copyOf(objarr,
                objarr.length,
                Integer[].class);
	}
	public static void main (String[] args) {
		
		int[] arr = {22,1,1,4,16,25,10,8,12};
		
		Integer[] pairs = findClosestNums(arr);
		for(int i=0;i<pairs.length-1;i=i+2)
		{
			System.out.println("("+pairs[i]+","+pairs[i+1]+")");
		}
	}

}
