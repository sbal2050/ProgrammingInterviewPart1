package ArraysAndStrings;

/**
 * 
 * @author sulagnabal
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call 
 * to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 *
 */

public class StringRotationChecker {
	
	public static boolean isRotation(String str1 , String str2){
		str1 = str1 + str1; //Concatenate the same string
		return isSubstring1(str1, str2);
	}
	
	private static boolean isSubstring1(String s1, String s2){
		return s1.contains(s2);
	}
	
	

	public static void main(String[] args) {
		System.out.println(StringRotationChecker.isRotation("waterbottle", "erbottlewat"));

	}

}
