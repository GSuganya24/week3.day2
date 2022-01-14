package week3.day2Assignment;

public class CharOccurence {
public static void main(String[] args) {
	String str = "welcome to chennai";
	int count = 0;
	char[] charArray = str.toCharArray();
	System.out.println(charArray);
	int l = charArray.length;
	for(int i=0;i<l;i++) {
		if(charArray[i] == 'e') {
			count = count+1;
		}
}
	//printing the count
	System.out.println("Count of the character 'e' is " +count);
}
}
