package apex.java.assign15.SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
// program to check frequency of words in sentence

public class WordFrequencyInSentence   {
	static class wordcount implements Comparable<wordcount> {
		String word;
		int frequency;

		
		  wordcount() 
		  { 
			  this.word = new String(); 
			  this.frequency=0; 
		   }


		public wordcount(String string, int i) {
			// TODO Auto-generated constructor stub
			this.word = string;
			this.frequency=i;
		}
		
		/*
		 * int compareTo(wordcount obj2) { //return (this == null)?((obj2==null)?
		 * 0:-1):((obj2==null)? 1: this.word.compareTo(obj2.word)); return
		 * this.word.compareTo(obj2.word); }
		 */


		public int compareTo(wordcount obj2) {
			// TODO Auto-generated method stub
			//return this.word.compareTo(obj2.word);
			return (this == null)?((obj2==null)? 0:-1):((obj2==null)? 1: this.word.compareTo(obj2.word));
		}
		 
	}
	
	public static Map<String, Integer> CountWordFrequencyMap(String sen) {
		
		String[] strarray = sen.split(" ");
		Map<String, Integer> mapWordFreq = new HashMap<String, Integer>();
		
		for(int i=0;i<strarray.length;i++)
		{
			Integer res = mapWordFreq.put(strarray[i], 1);
			if(res!=null) 
				mapWordFreq.put(strarray[i], (res.intValue() + 1));
		}
		
		return mapWordFreq;
		
		
	}

	public static wordcount[] CountWordFrequency(String sen) {

		String[] strarray = sen.split(" ");
		Arrays.sort(strarray);
		/*
		 * for(String str:strarray) { System.out.println(str); }
		 */
		wordcount[] wc = new  wordcount[strarray.length];
		for (int i = 0, j = 0; i < strarray.length;) {
			//System.out.println(strarray[i]);
			wc[j] = new wordcount(strarray[i],1);

			while ((i < strarray.length - 1) && (strarray[i].compareTo(strarray[i + 1]) == 0)) {
				// wc[j].word= strarray[i];
				//wc[j]=new wordcount(wc[j].word,wc[j].frequency++);
				wc[j].frequency++;
				i++;
			}

			j++;
			i++;

		}

		return wc;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "How are you doing you are today?";
		String s = null;
		s = sentence;
		System.out.println(s);
		String senmod = sentence.replace(".", "");
		senmod = senmod.replace("?", "");
		senmod = senmod.replace(",", "");

		wordcount[] wcs = CountWordFrequency(senmod);
		Comparator<WordFrequencyInSentence.wordcount> c = new Comparator<WordFrequencyInSentence.wordcount>() {
			public int compare(wordcount obj1, wordcount obj2)
			{
				return (obj1==null)?((obj2==null)? 0 : -1) : ((obj2==null)? 1 : (obj1.frequency - obj2.frequency));
			}
		};	
//		Arrays.sort(wcs);
		System.out.println("Unsorted List");
		for(int i=0;i<wcs.length && wcs[i]!=null; i++)
			System.out.println(wcs[i].word + " " + wcs[i].frequency);
		
//		Arrays.sort(wcs,c);
		//Arrays.sort(wcs, (Comparator<? super WordFrequencyInSentence.wordcount>) (wordcount obj1, wordcount obj2)->(obj1==null)? (obj2==null ? 0 : -1 ) : (obj1.frequency - obj2.frequency));
		System.out.println("Sorted List");
		for(int i=0;i<wcs.length && wcs[i]!=null; i++)
			System.out.println(wcs[i].word + " " + wcs[i].frequency);
		System.out.println("End of list");
		
		Map<String, Integer> mapwcs = CountWordFrequencyMap(senmod);
		System.out.println(mapwcs);
		Map<String, Integer> sortedmapwcs = sortMapbyValue(mapwcs);
		System.out.println(sortedmapwcs);
		return;

	}

	static Map<String, Integer>sortMapbyValue(Map<String, Integer> unsortedmap)
	{
		//Map<String, Integer> maplinked = new LinkedHashMap<String, Integer> ();
		List<Entry<String,Integer>> entrylist = new LinkedList<Entry<String,Integer>>(unsortedmap.entrySet());
		
		Collections.sort(entrylist, new Comparator<Entry<String,Integer>>(){
			public int compare(Entry<String,Integer> obj1, Entry<String,Integer> obj2)
			{
				return (obj1.getValue()-obj2.getValue());
			}
		});
		
		Map<String, Integer> maplinked = new LinkedHashMap<String, Integer>();
		entrylist.forEach((Map.Entry<String,Integer> obj)->maplinked.put(obj.getKey(),obj.getValue()));
		
		return maplinked;
		
	}
}
