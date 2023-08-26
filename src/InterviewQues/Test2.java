package InterviewQues;

public class Test2   {

	public static  void shift(int left,int right,int[]arr)
	{
		while(left<=right)
		{
			 if(arr[left]>0 && arr[right]>0)
			 {
				 left++;
			 }
			 else if(arr[left]<0 && arr[right]>0)
			 {
				 int temp;
				 temp=arr[left];
				 arr[left]=arr[right];
				 arr[right]=temp;
				 
				 left++;
				 right--;
				 
			 }
			 
			 else if(arr[left]<0 && arr[right]<0)
			 {
				 right--;
			 }
			 else {
				 left++;
				 right--;
			 }
		}
	}
	
	public static void display(int []arr)
	{
		for(int data : arr)
		{
			System.out.println(data);
		}
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,1,1,1,1,1,-2,1,1};
		
		Test2.shift(0, arr.length-1, arr);
		Test2.display(arr);
	 
		
	}
}
