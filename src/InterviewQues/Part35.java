package InterviewQues;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Part35 {

	
	public static void main(String[] args) {
		
		int no[]  =new int[] {1,2,3,4,5,6,7};
		
		int total=0;
		float avg =0.0f;
		for(int i=0;i<no.length;++i)
		{
			total = total + no[i];
	        avg = total/no.length;
		}
		
		System.out.println(avg);
	
		OptionalDouble a2vg = Arrays.stream(no).average();
		System.out.println(a2vg.getAsDouble());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
