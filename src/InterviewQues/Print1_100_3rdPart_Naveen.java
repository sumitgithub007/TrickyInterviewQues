package InterviewQues;

import java.util.Arrays;
import java.util.BitSet;

public class Print1_100_3rdPart_Naveen {

	//Print 1 100 without any loop and recursion
	public static void main(String[] args) {
		
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count=0;
			@Override
			public String toString()
			{
				return Integer.toString(++count);
			}
		});
		
	//	System.out.println(Arrays.toString(num));
		
		
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set, 1, set.length());
	}
	
}
