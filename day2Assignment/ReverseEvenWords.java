package week3.day2Assignment;


public class ReverseEvenWords {
public static void main(String[] args) {
	String test = "I am a software tester";
	String[] charArray = test.split(" ");
	for(int i = 0; i<charArray.length ; i++) {
		String word = charArray[i];
		int l = charArray[i].length();
		if(((i+1)%2)==0 ) {
			for(int j = (l-1);j>=0;j--) {
			  System.out.print(charArray[i].charAt(j));//reversing eachChar of the taken word
			}
			}else {
				System.out.print(word);
			
		}
		System.out.print(" ");
	}
	
	
}
}
