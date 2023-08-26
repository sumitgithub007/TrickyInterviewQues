package InterviewQues;

import java.lang.reflect.Field;

//Java Interview Question: Create a Language Translator & Auto Bots || Reflection In Java

public class Part26 {

	
	static {
		
	 
		
			try {
				Field value = String.class.getDeclaredField("value");
				value.setAccessible(false);
				 
				value.set("hello", "hi bro");
				value.set("bye", "ok bye!");
			} catch (NoSuchFieldException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	public static void main(String[] args) {
		
		System.out.println("hello");
	}
	
}
