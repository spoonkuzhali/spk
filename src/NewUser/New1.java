package NewUser;

import java.nio.charset.MalformedInputException;

public class New1 {
	public static int a=25;
	
	private void User() {
	 a=5;
		System.out.println("123");
		//System.out.println(a);
		
	}
	
		public static void main(String[] args) {
			
			New1 b= new New1();
		System.out.println(b.a);
			
			b.User();
			System.out.println(b.a);
			
			
			New1 c = new New1();
			System.out.println(c.a);

			
			
	}
	
	
	
}