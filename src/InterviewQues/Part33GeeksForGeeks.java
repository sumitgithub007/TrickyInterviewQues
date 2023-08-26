package InterviewQues;

import java.util.ArrayList;
import java.util.List;

public class Part33GeeksForGeeks {

	public static void main(String[] args) {
		
		String str = "GeeksFUorGeekAs";
		String vow = "aeiouAEIOU";
		
		List<Character> alist = new ArrayList<Character>();
		
		for(int i=0;i<vow.length();++i)
		{
			
			alist.add(vow.charAt(i));
			
		}
		
		for(int i=0;i<str.length();++i)
		{
			if(alist.contains(str.charAt(i)))
			{
				System.out.println(str.charAt(i));
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
