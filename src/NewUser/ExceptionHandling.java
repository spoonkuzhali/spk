package NewUser;

public class ExceptionHandling {
	try {
		int []a = new int[3];
		a[4]=10;
		System.out.println(a[4]);
		
	}
		catch (ArrayIndexOutOfBoundsException ex) {
			
		System.out.println("exception has been handled");
			}
	catch (NullPointerException ex) {
System.out.println("not handled");
}
	catch (Exception ex) {
System.out.println("not a handled");	
}
	finally {
				System.out.println(6/2);
	}	
}
}



