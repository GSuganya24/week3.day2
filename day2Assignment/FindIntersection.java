package week3.day2Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {
public static void main(String[] args) {
	int[] a =  {3,2,11,4,6,7};
	int[] b = {1,2,8,4,9,7};
	Set<Integer> num1 = new LinkedHashSet<Integer>(); //Creating set for the two arrays
	Set<Integer> num2 = new LinkedHashSet<Integer>();
	for (int eachInt1 : a) { // foreach loop
		num1.add(eachInt1);
	}
	System.out.println(num1);
	for (int eachInt1 : b) { // eachInt1 is an iterator so we can use the same value in diff loops
		num2.add(eachInt1);
	}
	System.out.println(num2);
	num1.retainAll(num2); // It retains the values which are equal
	System.out.println("Intersection are : " +num1);
}
}
