package week3.day2Assignment;

public class FindTypes {
public static void main(String[] args) {
	String test = "$$ Welcome to 2nd Class of Automation $$ ";
	int  letter = 0, space = 0, num = 0, specialChar = 0;
	char[] charArray = test.toCharArray();
	int l = charArray.length;
	for(int i=0;i<l;i++) {
		char c = charArray[i];
		if(Character.isLetter(c)){//((c >= 'a' && c <= 'z')||(c >= 'A' && c >= 'z')){
			letter = letter+1;
		}else if (Character.isDigit(c)){//(c >= '0' && c <= '9') {
			num = num+1;
		}else if (Character.isSpaceChar(c)){//(c == ' ') {
			space = space+1;
		}else {
			specialChar = specialChar+1;
		}
	}
	//Print the output
	System.out.println("letter: " + letter);
	System.out.println("space: " + space);
	System.out.println("number: " + num);
	System.out.println("specialCharcter: " + specialChar);
}
}
