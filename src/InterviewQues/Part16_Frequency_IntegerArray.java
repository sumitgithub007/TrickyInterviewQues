package InterviewQues;

public class Part16_Frequency_IntegerArray {

	//Find duplicates or print frequency
	
	public static void main(String[] args) {
		
	
		int arr[] = new int [] {2,3,4,5,2,3,3,4,5,6,9};
		int fr[] = new int [arr.length];
		
		int visited=-1;
		
		for(int i=0;i<arr.length;++i)
		{
			int count=1;
			for(int j=i+1;j<fr.length;++j)
			{
			  if(arr[j]==arr[i])
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
				if(fr[i]>1)
				System.out.println(arr[i]+" " +fr[i]);
			}
		}
		
	}
	
	
	
}
