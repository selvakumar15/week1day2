package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";
		
		char[] ch = str.toCharArray();

		int length = str.length();
		int count = 0;

		for (int i = 0; i < length; i++) {
			if (ch[i] == 'e') {
				count = count + 1;

			}

		}
		
		System.out.println("Number of char of e :" + count);
	}
}
