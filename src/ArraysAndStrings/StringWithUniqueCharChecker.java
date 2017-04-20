package ArraysAndStrings;

/*
 * Implement an algorithm to determine if a string has all unique characters. 
 * What if you can not use additional data structures?
 */

public class StringWithUniqueCharChecker {
	
	public static boolean hasUniqueChars(String str){
//Ofcourse check if the input string is empty, has only one character etc.
		
		//Assuming String ASCII string
		boolean isThere [] = new boolean[256];
		for(int i=0; i< str.length(); i++){
			if(isThere[str.charAt(i)]) 
				return false;
			isThere[str.charAt(i)] = true;
		}
		return true;
	}
}

/* 
 * Time Complexity : O(n)
 * Space Complexity : O(n) --using an extra boolean array variable.
 */

/**
 * Note :Find a better solution that can address real word scenario. This solution will fail with 
 * Unicode characters which Java support. 
 */
