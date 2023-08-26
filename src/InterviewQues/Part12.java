package InterviewQues;

public class Part12 {
//Tricky Interview Question : Pass null argument with method overloading of String and Object types

	public static void test(Object o)
	{
		System.out.println("Object");
		
	}
	

	public static void test(String o)
	{
		System.out.println("String");
		
	}
	
//	public static void test(String o)
//	{
//		System.out.println("String");
//		
//	}
	
	public static void main(String[] args) {
		test(null);
	}  
}
