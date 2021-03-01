package example2;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//=============sum of each number=========================
		int n=623;
		int sum=0, r;
		while(n>0) {
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("sum is : "+sum);
//=============squre of each digite===============
		int n1=123,r1; 
		String sqr="";
		while(n1>0) {
			r1=n1%10;
			sqr=(r1*r1)+sqr; //for n^4 = r*r*r
			n1=n1/10;
		}
		System.out.println("sqr of each : "+sqr);
		
//===========amstrong num like 153 370 371 407 eg : 1^3 + 5^3 + 3^3= 153
		int n2=407,r2; 
		int result=0;
		int temp1=n2;
		while(n2>0) {
			r2=n2%10;
			result=result+(r2*r2*r2); //for n^4 = r*r*r
			n2=n2/10;
		}
//		System.out.println(result);
		if(temp1==result) {
			System.out.println(result+" is Amstrong number");
		}
		else {
			System.out.println(result+" is not Amstrong number");
		}
		
	}

}
