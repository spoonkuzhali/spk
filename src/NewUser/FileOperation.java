package NewUser;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\kuzha\\eclipse-workspace\\Java\\src\\NewUser\\File");
		boolean mkdir = f.mkdir();
		System.out.println(mkdir);
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		boolean canRead = f.canRead();
		System.out.println(canRead);
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		boolean exists = f.exists();
		System.out.println(exists);
		String[] list = f.list();
		for(String string:list) {
			System.out.println(string);
		}
		
		File[] listFiles = f.listFiles();
		for(File file:listFiles) {
			System.out.println(file);
			}
		
		
		
		
		
		
		
		
		
	}

}
