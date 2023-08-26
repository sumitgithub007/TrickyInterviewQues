package InterviewQues;

import java.util.HashMap;
import java.util.Map;

public class Part16_Frequency_OtherMethod {

	//Find duplicates or print frequency
	
	public static void main(String[] args) {
		
	
		String arr[] = new String [] {"Amazon","GCP","Azure","Amazon","Ali baba","sauce","Azure","GCP"};

//		Set<String> hset = new HashSet<>();
//		for(String h : arr)
//		{
//			
//			if(hset.add(h)==false)
//			{
//			  System.out.println(h);
//			}
//		}
		
		Map<String,Integer> infraMap = new HashMap<String,Integer>();
		
		for(String e : arr)
		{
			Integer count =  infraMap.get(e);
			
			if(count==null)
			{
				infraMap.put(e, 1);
				
			}
			else {
				
				infraMap.put(e, ++count);
				
			}
			
			
			
		}
		for(Map.Entry<String,Integer> map : infraMap.entrySet())
		{
			int key = map.getValue();
			if(key>1)
			System.out.println(map.getKey());
		}
		
		
		

	}
}