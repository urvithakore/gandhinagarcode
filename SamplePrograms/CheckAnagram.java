package apex.java.assign15.SamplePrograms;

import java.util.Arrays;
//import java.util.HashSet;
import java.util.Scanner;
//import java.util.Set;

// To check if the words are anagram
public class CheckAnagram {
	
	public static boolean isAnagram(String strg1, String strg2)
	{
		if(strg1.length() != strg2.length())
			return false;
		char[] charstrg1 = strg1.toCharArray();
		char[] charstrg2 = strg2.toCharArray();
		Arrays.sort(charstrg1);
		System.out.println(charstrg1);
		Arrays.sort(charstrg2);
		System.out.println(charstrg2);
		if((new String(charstrg1)).compareToIgnoreCase(new String(charstrg2))==0)
			return true;
		else
			return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1, str2;
		str1=str2="";
		System.out.println("Enter first string: ");
		if(scan.hasNext())
			str1 = scan.nextLine();
		System.out.println("Enter second string: ");
		if(scan.hasNext())
			str2 = scan.nextLine();
		scan.close();
		
		System.out.println(str1+ " " + str2 + " are anagrams ??" + isAnagram(str1, str2));		
		

	}

}
