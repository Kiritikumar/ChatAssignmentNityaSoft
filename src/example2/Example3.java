package example2;

public class Example3 {

	public static void main(String[] args) {
		
		//swaping two num without using 3rd variable
		int a=2;
		int b=4;
		System.out.println("before swaping a="+a+"  b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a="+a+"  b="+b);

	}

}
