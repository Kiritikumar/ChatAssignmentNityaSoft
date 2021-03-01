package example;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		String temp=str;
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("given String : "+temp);
		System.out.println("reverce string is : "+rev);


		
		if(str.equals(rev)) {
			System.out.println("polyndrom");
		}
		else {
			System.out.println("not polyndrom");
		}
	}

}
