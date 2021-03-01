package example2;

public class Exmple1 {

	public static void main(String[] args) {

		int n=101;
		int temp=n;
		int rev=0, r;
		while(n>0) {
			r=n%10;
			rev=r+(rev*10);
			n=n/10;
		}
		System.out.println(rev);
		if(rev==temp) {
			System.out.println("polyndrom");
		}
		else {
			System.out.println("not polyndrom");
		}
	}

}
