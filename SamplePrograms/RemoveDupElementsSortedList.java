package apex.java.assign15.SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Prog to Remove Duplicates from Sorted List

public class RemoveDupElementsSortedList {

	static List<Integer> RemoveListDuplicateUsingSet(List<Integer> intLst)
	{
		Set<Integer> set= new HashSet<Integer>();
		set.addAll(intLst);
		return (new ArrayList<Integer>(set));
	}
	
	static List<Integer> RemoveListDuplicateUsingArray1(List<Integer> intLst)
	{
		Integer[] temparr = intLst.toArray(new Integer[intLst.size()]);
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=0;i<temparr.length;i++)
		{
			
			
			 if (lst.isEmpty())
			 {
				 lst.add(temparr[i]);
			 }
			 else
			 {
				 if(!lst.contains(temparr[i]))
					 lst.add(temparr[i]);
			 }		 
		 }
	
		return lst;
	}
	
	static List<Integer> RemoveListDuplicateUsingArray2(List<Integer> intLst)
	{
		Integer[] temparr = intLst.toArray(new Integer[intLst.size()]);
		Integer[] resultarr = new Integer[temparr.length];
		for(int i=0,j=0;i<(temparr.length)-1;)
		{
			resultarr[j]=temparr[i];
			while(i<(temparr.length)-1 && temparr[i]==temparr[i+1] )
			{
				System.out.println("i: "+i);
				i++;
			}
			j++; i++;	
		 }
	
		return (Arrays.asList(resultarr));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intSortedList= new ArrayList<Integer>(Arrays.asList(1,2,3,3,3,4,4,5,6,6));
		System.out.println(intSortedList.toString());
		//List<Integer> intUniSortedList = RemoveListDuplicateUsingSet(intSortedList);
		//List<Integer> intUniSortedList = RemoveListDuplicateUsingArray1(intSortedList);
		List<Integer> intUniSortedList = RemoveListDuplicateUsingArray2(intSortedList);
		System.out.println(intUniSortedList.toString());
	}

}

