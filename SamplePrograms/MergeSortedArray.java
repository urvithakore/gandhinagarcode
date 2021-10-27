package apex.java.assign15.SamplePrograms;

import java.util.Scanner;

//program to merge two sorted arrays.

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner in = new Scanner(System.in);	
		System.out.print("Input no. of elements in first array: ");
		m = in.nextInt(); 
		
		int  arr1[]= new int [m];
		if(in.hasNextInt())
		{
			for(int i=0;i<m; i++)
			{
				arr1[i]=in.nextInt();				
			}
			
		}
		System.out.print("Input no. of elements in second array: ");
		n = in.nextInt(); 
		
		int  arr2[]= new int [n];
		if(in.hasNextInt())
		{
			for(int i=0;i<n; i++)
			{
				arr2[i]=in.nextInt();				
			}
			
		}
		in.close();
		int[] mergedarr = MergeSorted(arr1,arr2);
		
		for(int i=0;i<mergedarr.length; i++)
		{
			System.out.print(mergedarr[i] + " ");				
		}
	}
	
	public static int[] MergeSorted(int[] ary1, int[] ary2)
	{
		int x, y, j=0, k=0;
		
		x=ary1.length;
		y=ary2.length;
		int[] mergarr=new int[x+y];
		for (int i=0;i<x+y;i++)
		{
			if(j<x && k<y)
			{
				if(ary1[j]<=ary2[k])
				{
					mergarr[i]=ary1[j];
					j++;
				}	
				else
				{
					mergarr[i]=ary2[k];
					k++;
				}
			}
			else if(j==x||k==y)
			{
				if(j==x)
				{
					mergarr[i]=ary2[k];
					k++;
				}
				else
				{
					mergarr[i]=ary1[j];
					j++;
				}
			}	
				
				
		}
		
		return mergarr;
	}	
	

}
