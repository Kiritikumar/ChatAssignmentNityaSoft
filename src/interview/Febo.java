package interview;

public class Febo {
	public static int Febonicc(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2) {
			return 1;
		}
		return Febonicc(n-2)+Febonicc(n-1);
	}
		
		public static void main(String[] args) {
			// type1
//			int a=0 ,b=1,c=0;
//			System.out.print(a+" "+b+" ");
//			for(int i=1;i<10;i++) {
//				c=a+b;
//				System.out.print(c +" ");
//				a=b;
//				b=c;
//			}
//			
			//type 2
//			int maxNum=10,preNum=0, nextNum=1;
//			System.out.println("febonacci num");
//			int i=0;
//			
//			while(i<=maxNum) {
//				System.out.print(preNum+" ");
//				
//				int sum = preNum+nextNum;
//				preNum=nextNum;
//				nextNum=sum;
//				i++;
//			}
			for(int i=0;i<=10;i++) {
				System.out.print(Febonicc(i)+" ");
			}
			
		}
}
