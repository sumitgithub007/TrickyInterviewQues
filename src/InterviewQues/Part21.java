package InterviewQues;

public class Part21 {

	public static void main(String[] args) {
		
		String s = "jamessss band  kl";
		char[] arr = s.toCharArray();
		
		int fr[] = new int[arr.length];
		
		
		int visited=-1;
		for(int i=0;i<arr.length;++i)
		{
			int count =1;
			for(int j=i+1;j<fr.length;++j)
			{
				if(arr[i]==arr[j])
				{
					++count;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
			{
				fr[i]=count;
			}
		}
		
		for(int i=0;i<fr.length;++i)
		{
			if(fr[i]!=visited)
			{
				
				System.out.println(arr[i]+" "+fr[i] );
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
