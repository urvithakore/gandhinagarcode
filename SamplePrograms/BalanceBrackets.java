package apex.java.assign15.SamplePrograms;
import java.util.Stack;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// To check whether the brackets are balanced
public class BalanceBrackets {
	static Set<String> openbrac = new HashSet<String>();
	static Set<String> closebrac = new HashSet<String>(); 
	static Map<String,String> matchBrac = new HashMap<String,String>();
	static {
		
		//Set<String> openbrac = new HashSet<String>(); 
		openbrac.add("{");
		openbrac.add("(");
		openbrac.add("[");
		openbrac.add("<");
		//Set<String> closebrac = new HashSet<String>(); 
		closebrac.add("}");
		closebrac.add(")");
		closebrac.add("]");
		closebrac.add(">");
		//Map<String,String> matchBrac = new HashMap<String,String>();
		matchBrac.put("}","{");
		matchBrac.put("]","[");
		matchBrac.put(")","(");
		matchBrac.put(">","<");
		
	}
	
	static public boolean CheckBalanceBracketsWithStack(String Arr)
	{
		int arrlen = Arr.length();
		Stack<String> stk= new Stack<String>();
			
		
		for(int i=0;i<arrlen;i++)
		{
			String s = String.valueOf(Arr.charAt(i));
			if(openbrac.contains(s))			
			{
				stk.push(s);
			}
			else if(closebrac.contains(s))
			{
				if(!stk.isEmpty())
				{	
					String str = stk.lastElement();
					//System.out.println("lastelement:" + str);
					if ((matchBrac.get(s)).equals(str))
					{
						stk.pop();
					}
					else
					{
						return false;
					}
				}
				else 
					return false;
			}
		}
		if(stk.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Arr= "(){()(())}]";
		if(CheckBalanceBracketsWithStack(Arr))
			System.out.println("Balanced brackets:" + Arr);
		else
			System.out.println("Not a Balanced brackets:" + Arr);
			

	}

}
