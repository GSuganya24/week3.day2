package week3.day2Assignment;

import java.util.Arrays;


public class Anagram {
public static void main(String[] args) {
	String text1 = "stops";
	String text2 = "potss";
	//checking the length of the array
	int l1 = text1.length();
	int l2 = text2.length();
	int count = 0;
	char[] charArray1 = text1.toCharArray();
	char[] charArray2 = text2.toCharArray();
	Arrays.sort(charArray1);
	Arrays.sort(charArray2);
	System.out.println(charArray1);
	System.out.println(charArray2);
	if(l1 == l2) {
		for(int i = 0;i<(l1-1);i++) {
			if((charArray1[i]) == (charArray2[i])){ // Checking each character in the array is same
				count = count+1;
			}
		}
		if (count == (l1-1)) { // If the count is equals (lenghth-1)i.e = index count
			System.out.println("Is an Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
		
	}	else { // If the both length not equals
			System.out.println("Not an Anagram");
		}
        //Checking whether both the arrays are equal	
//		if(Arrays.equals(charArray1, 0, l1, charArray2, 0, l2)) {
//			System.out.println("Is an Anagram");
//		}
//	}else {
//		System.out.println("Not an Anagram");
//	}
}
}
