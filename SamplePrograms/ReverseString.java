// program to reverse a string

package apex.java.assign15.SamplePrograms;

public class ReverseString {
	
	static String ReverseStringLoops(String str)
	{
		char chtemp;
		int len=str.length();
		char[] charray = str.toCharArray();
		for(int i=0;i<len/2;i++)
		{
			chtemp = charray[i];
			charray[i]=charray[len-i-1];
			charray[len-i-1]= chtemp;
		}
		return (new String(charray));
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Coronavirus Dhissoom";
		String revstr = ReverseStringLoops(str);
		System.out.println(revstr);
	}

}
