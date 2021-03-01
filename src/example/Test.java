package example;

public class Test {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");

		System.out.println(s1 == "abc"); 
		System.out.println(s1 == s2);
		int y=400;
		if(y%4==0&&y%100!=0||y%400==0) {
			System.out.println("is leap");
		}
		else {
			System.out.println("not leap");
		}
		int n=5;
		for(int i=n;i<=10;i++) {
		System.out.println(n+"+"+i+"="+n*i);
		}

	}

}
