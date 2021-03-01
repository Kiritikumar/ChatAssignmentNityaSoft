package example2;

public class VowelsInString {

	public static void main(String[] args) {
		System.out.println(vowelsFinding("hey"));
		System.out.println(vowelsFinding("zzz"));
	}
	//checking a string cointains vowels or not
	public static boolean vowelsFinding(String vowel) {
		return vowel.matches(".*[aeiou].*");
	}
}
