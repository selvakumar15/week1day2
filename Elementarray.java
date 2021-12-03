package week1.day2;

import java.util.Arrays;

public class Elementarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,6,7,8,9};
		
		Arrays.sort(arr);
		
		for(int i =0;i<arr.length;i++) {
			int x =i + 1;
		 if(arr[i]==x) {
			 
			 //System.out.println(arr[i]);
				
			}else {
				
				System.out.println("Missing number is " + x);
				break;
			}
			
		 
		}
	

	}

}


 