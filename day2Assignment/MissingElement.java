package week3.day2Assignment;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class MissingElement {
public static void main(String[] args) {
	Integer[] arr = {1,2,3,4,7,6,8};
	int l = arr.length;
	List<Integer> num = Arrays.asList(arr);
	Collections.sort(num);
	int firstNum = num.get(0);
	for(int i=0;i<l;i++) {
		if(num.get(i)==(firstNum+i)) {
			continue;
		}else {
			System.out.println(firstNum+i);
			break;
		}
	}
}
}
