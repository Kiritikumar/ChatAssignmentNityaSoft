package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Example5 {

public static void countStrings(ArrayList<String> list) {
	Set<String> st=new TreeSet<String>(list);
	for(String str: st) {
		System.out.println(str+" "+Collections.frequency(list, str));
	}
}
	public static void main(String[] args) {
		String[] str= {"zzz","gggg","kkk","kkk","aaa","zzz","bbb"};
		ArrayList<String> list=new ArrayList<String>();
		for(String s:str) {
			list.add(s);
		}
		System.out.println(list);
		
		countStrings(list);
		
	}
}
