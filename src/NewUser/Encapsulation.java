package NewUser;

public class Encapsulation {
	private String username;
	private int password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username=="kuzhali") {
		this.username ="balance : 20000";
		}
		else if(username=="spk") {
			this.username="balance:10000";
			}
		else {
			this.username="incorrect username";
		}
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		if(password==12345) {
			this.password=1;
		}
		
		else
			this.password=0;
		}
		
	
	

}
