package week3.day2Assignment;

public class Palindrome {
	public static void main(String[] args) {
		String s1 = "madam";
		String s2 = "";
		int l = s1.length();
		//Iterate over the String in reverse order
		for(int i=l-1;i>=0;--i) {
			s2 = s2 + s1.charAt(i);//Add the char into rev
		}
		//Compare the original String with the reversed String, if it is same then print palinDrome 
		if(s1.equals(s2)) {
			System.out.println("Is a Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
}
}
