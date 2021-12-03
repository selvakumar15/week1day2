package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
	

		int[] num = {40,90,80,25,60};
		
		Arrays.sort(num);
		
		int secondbiggestnumber= num.length-2;
		
		System.out.println(num[secondbiggestnumber]);
    
	}

}
