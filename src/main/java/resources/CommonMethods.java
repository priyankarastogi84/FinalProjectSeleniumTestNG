package resources;

import java.util.Random;

public class CommonMethods {

	public static String getEmail() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String email = salt.toString() + "@gmail.com";
		return email;
	}
	
	public static void main(String[] args) {
		
		CommonMethods obj=new CommonMethods();
		System.out.println(obj.getEmail());
		
	}
}





