package week3.day2Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] strArray = text.split(" ");

	        int l = strArray.length;
			List<String> str =  new ArrayList<String>(l);
			for (String each : strArray) {
				str.add(each);
			}
			System.out.println(str);
			List<String> list = new ArrayList<String>(); 
			Set<String> temp = new HashSet<String>(); // Creating a set to add the value temporarily to check for duplicates

			for (int i = 0;i<l;i++) {
				String str1 = str.get(i);
			    boolean add = temp.add(str1); 
				if(!add) {
					list.add("");
				}else {
				
				list.add(str1);
				}
			}
			System.out.println(list);
}
}
