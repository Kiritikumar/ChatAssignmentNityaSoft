package java8;


import java.util.Arrays;
import java.util.List;

public class LambdaEx {

	public static void main(String args[]) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,4,6,7,8,9,1);
//		numbers.stream()
//		.map(e->e.toString())
//		.map(e->e.valueOf(e))
//		.forEach(System.out::println);
	
		System.out.println(
				numbers.stream()
//				reduce(0,(total,e)->Integer.sum(total,e))
//				.reduce(0,Integer::sum)
//				.filter(e->e%2==0)
//				.mapToInt(e->e*2)
//				.sum()
				.filter(LambdaEx::isDiv)
				.map(LambdaEx::mapDouble)
				.findFirst()
				.orElse(0));
				
		
//		List<String> strings=Arrays.asList("hi","hello");
//		strings.forEach(i->System.out.println(i));
		
		
	}
	public static boolean isDiv(int i) {
		System.out.println("it is divisible"+i);
		return i%5==0;
	}
	public static int mapDouble(int i) {
		System.out.println("it is double the size"+i);
		return i*2;
	}
}
