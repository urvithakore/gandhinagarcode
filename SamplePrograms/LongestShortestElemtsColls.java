package apex.java.assign15.SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class LongestShortestElemtsColls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("Mango", "Papaya", "Banana", "Pineapple","Apple","Kiwi"));
		// One way
		/*
		 * Collections.sort(list, Comparator.comparingInt(String::length));
		 * list.forEach(System.out::println); System.out.println("Shortest: " +
		 * list.get(0)); System.out.println("Longest: "+ list.get(list.size()-1));
		 */
		
		// Other way
		
		//String shortest = list.stream().sorted(Comparator.comparingInt(String::length)).findFirst().orElse(null);
		String shortest = list.stream().min(Comparator.comparingInt(String::length)).orElse(null);
		String longest = list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		
		System.out.println("Shortest: "+ shortest);
		System.out.println("Longest: "+ longest);
		
	}

}
