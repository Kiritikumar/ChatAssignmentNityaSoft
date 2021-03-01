package example;

public class Example6 {

	public static void main(String[] args) {

		String s="kiritikumar";
		char[] ch=s.toCharArray();
		System.out.println(s);
		for(int i=0;i<=s.length()-1;i++) {
			for(int j=i;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]+"  ");
				}
			}
		}
	}

}
