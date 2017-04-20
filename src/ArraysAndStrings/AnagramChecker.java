package ArraysAndStrings;

import java.util.Arrays;
/**
 * 
 * @author sulagnabal
 * Write a method to decide if two strings are anagrams or not.
 *
 */

public class AnagramChecker {
	
	public static boolean checkForAnagramSolutionI(String str1, String str2){
		char[] str1ToChar = str1.toCharArray();
		char[] str2ToChar = str2.toCharArray();
		Arrays.sort(str1ToChar);
		Arrays.sort(str2ToChar);
		return String.valueOf(str1ToChar).equals(String.valueOf(str2ToChar));
		
	}
	
	public static boolean checkForAnagramSolutionII(String str1, String str2){
		int [] isThere = new int[256]; //Assuming its an ASCII system.
		int unique_cnt1=0, unique_cnt2=0;
		
		if(str1.length()!=str2.length()) return false;
		
		//Scan the first string. Count the number of duplicates by incrementing the 
		//isThere[char] value. And count the number of unique characters.
		for(char c : str1.toCharArray()){
			if(isThere[c]==0)
				unique_cnt1++;
			isThere[c]++;
		}
		
		for(char c: str2.toCharArray()){
			//Ether encountered a different letter or more duplicates of a char compared to str1.
			if(isThere[c]==0) return false;
			
			if(isThere[c]==1) unique_cnt2++; //Count the unique characters in str2 when isThere[c]==1
			
			isThere[c]--; //decrement count of the character when found in str2
		}
		
		return unique_cnt1==unique_cnt2;
	}

	public static void main(String[] args) {
		System.out.println(AnagramChecker.checkForAnagramSolutionI("CINEMA", "ICEMAN"));
		
		System.out.println(AnagramChecker.checkForAnagramSolutionII("aababbcdeefa", "aaabcccddefe"));
		System.out.println(AnagramChecker.checkForAnagramSolutionII("CINEMA", "ICEMAN"));
	}

}
