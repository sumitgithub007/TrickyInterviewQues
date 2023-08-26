package InterviewQues;

import java.util.HashMap;
import java.util.Map;

public class Part21_HashMap {

	public static void main(String[] args) {
		
		String s = "10101010101010";
		char[] arr = s.toCharArray();
	 
	Map<Character,Integer> hmap = new HashMap<Character,Integer>();
	
	int count=1;
	for(char a : arr)
	{
		if(hmap.containsKey(a)) { //if(hmap.get(a)==null)
		
			hmap.put(a,hmap.get(a)+1);
		
		}
		else {
		
			hmap.put(a, 1);
		}
	}
		
	System.out.println(hmap);
	
		
	
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
