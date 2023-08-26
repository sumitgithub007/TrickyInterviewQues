package InterviewQues;

public class Part32 {
 //occurrence of character
	public static void main(String[] args) {
		
		String s = "aaasumitaaajkjkaaa";
		String y = s.replaceAll("[ai]", "");
		int count =  s.length() - s.replaceAll("[ai]", "").length();
		
		
	System.out.println(count);
		
		
		long data =s.chars().filter(e->(char)e=='a'|| (char)e=='i').count();
		
		System.out.println(data);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
