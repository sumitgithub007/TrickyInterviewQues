package InterviewQues;

public class StarPatterns {

	
	public static void main(String[] args) {
		
       
		int sp = 10;
		int a =0;
		//int q=0;
		 int var1=10;
		 int var2=10;
		
	 for(int i=1;i<=10;++i)
	 {
		 for(int k=1;k<=sp;++k)
		 {
			  System.out.print(" ");
		 }
		 
		 a=0;
		 for(int p=1;p<=var1;++p)
		 {
			System.out.print(++a); 
		 }
		 for(int q=1;q<var2;++q)
		 {
			 System.out.print(--a);
		 }
		 
		 --var1;
		 --var2;
		 System.out.println();
		 sp++;
	 }
		
		
		
		
		
		
		
		
		
		
		
	}

	}