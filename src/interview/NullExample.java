package interview;

public class NullExample {

	static String s; // null
	static int a;// 0
	static String s1 = null;
	static int[] b = null; // null pusble arrays and all reffernces and string or object types only not for
							// primitives

//	static String s2=NULL;//not possible bcz null is resoverd word all resover words is lowercase only
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=null; // we can't assign null value for primitives 
		System.out.println(b);
		System.out.println(s + " " + a + " ");
		System.out.println(s1 == null);// true
//		System.out.println(s1.equals(null)); //java.lang.NullPointerException
//		System.out.println(s1.length()); 	//java.lang.NullPointerException
		System.out.println(null == null);// true
//		System.out.println(null);//The method println(char[]) is ambiguous for the type PrintStream
		System.out.println(s1 == null + "static null");// false
		String s3 = null;
		System.out.println(s3 == null);// true
//		System.out.println(s3.equals(null));//java.lang.NullPointerException: Cannot invoke "String.equals(Object)" because "s3" is null
		try {
			if (s3 == null) {
				System.out.println("null aplicable ==");
			}
		} catch (NullPointerException nep) {
			System.out.println("NullPointerException will Caught");
		}
		try {
			if (s3.equals(null)) {
				System.out.println("null aplicable for equals method");
			}
		} 
		catch (NullPointerException nep) {
			System.out.println(" in this NullPointerException will Caught for eql method");
		}
		try {
			if (s3.equals("abc")) {
				System.out.println("abc is null aplicable for equals method");
			}
		} 
		catch (NullPointerException nep) {
			System.out.println("NullPointerException will Caught for eql abc");
		}
		
	}

}
