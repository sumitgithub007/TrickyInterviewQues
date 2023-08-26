package InterviewQues;

public class Part13_Run_WithoutObject {

	
	static {
		
		System.out.println("Static block will be called");
		test();
	}
	
	public static void cover()
	{
		System.out.println("Cover method");
	}
	
	
	public static void test() 
	{
	
		cover();
		System.out.println("Test method static");
	
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main method static");

		
		
	}
	
}
