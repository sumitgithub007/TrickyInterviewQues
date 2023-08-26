package InterviewQues;

import java.util.stream.IntStream;

public class ONE_100_withoutLoop {

	public void print(int start,int end)
	{
		if(start==end)
		{
			return;
		}
		
		 
			System.out.println(start);
		++start;
		print(start,end);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ONE_100_withoutLoop one = new ONE_100_withoutLoop();
		one.print(6,500);
		IntStream.range(1, 101).forEach(e->System.out.println(e));
	}
	
}

