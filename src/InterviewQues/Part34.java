package InterviewQues;

import java.util.Arrays;
import java.util.stream.Stream;

public class Part34 {

	
	public static void main(String[] args) {
		
		
		
	String[] batter = new String[] {"sachin","sehwag","virat"};
	
	String[] bowler = new String[] {"bumrah"};
	
	int len = batter.length + bowler.length;
	String[]fullTeam = new String[len];
	Stream<String> sbat= Arrays.stream(batter);
	Stream<String> sbow =Arrays.stream(bowler);
 
	String fullTeam2[]=Stream.concat(sbat, sbow).toArray(size->new String[size]);
 
	int k=0;
	int count=-1;
	for(int i=0;i<fullTeam.length;++i)
	{
		if(k<batter.length)
		{
			fullTeam[++count] = batter[i];
		}
		if(k<bowler.length)
		{
			fullTeam[++count] = bowler[i];
		}
		++k;
	}
	
	for(String s1:fullTeam)
	{
		System.out.println(s1);
	}
	
	
	
	
	
	
	
//	
//	String newarr[] = new String[len]; 
//     StringBuffer str = new StringBuffer();
//	
//	int i=0;
//	int counter=-1;
//	while(i<batter.length || i<bowler.length)
//	{
//		if(i<batter.length)
//		{
//			newarr[++counter] = batter[i];
//		 //  str.append(batter[i]);
//		}
//		if(i<bowler.length)
//		{
//			newarr[++counter] = bowler[i];
//			// str.append(bowler[i]);
//		}
//		++i;
//	}
//	
//	//System.out.println(str);
//	
//	for(String data : newarr)
//	{
//		System.out.println(data);
//	}
//	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
