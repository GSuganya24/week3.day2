package week3.day2Assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicates {
	public static void main(String[] args) {
		Integer[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> num = new HashSet<Integer>();
		Set<Integer> dupNum = new HashSet<Integer>();
		for(int foreach : arr) {
			boolean add = num.add(foreach);
			if(!add) {
				dupNum.add(foreach);
			}
		
	}
		System.out.println("Printing Duplicates : " +dupNum);
}
}
