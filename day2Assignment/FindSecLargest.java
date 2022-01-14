package week3.day2Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;;

public class FindSecLargest {
//	public static int getSecLargestNumber(Integer[] data, int len) { //Method with args Integer Array & length
//		List<Integer> num = Arrays.asList(data);  //Converting Array as list
//		Collections.sort(num);
//		int secLar = num.get(len-2);
//		return secLar;
//	}
//
//	
//
//public static void main(String[] args) {
//	Integer[] data = {3,2,11,9,6,7,13};
//	int l = data.length;
//	   int n = FindSecLargest.getSecLargestNumber(data , l);//Passing the data and the length
//		System.out.println(n);	
//		
//		
//	}

	public static void main(String[] args) {
	    Integer[] data = {3,2,11,9,6,7,13};
		int l = data.length;
		List<Integer> num = Arrays.asList(data);
		Collections.sort(num);
		int secLar = num.get(l-2);
		System.out.println("Second Largest Number : " +secLar);
		
	}
}
