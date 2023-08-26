package InterviewQues;

import java.util.StringJoiner;

//What is StringJoiner in JDK 1.8 || Combine Multiple Strings into One

public class Part31 {

	public static void main(String[] args) {
		
		
		  
		StringJoiner joiner = new StringJoiner(":","[","]");
		
		joiner.add("Sumit").add("Is").add("Good");
		
		System.out.println(joiner.toString());
		
		
		
		
		
	}
	
	
}
