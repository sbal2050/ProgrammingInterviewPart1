package ArraysAndStrings;
/**
 * 
 * @author sulagnabal
 * Design an algorithm and write code to remove the duplicate characters in a string 
 * without using any additional bu er. NOTE: One or two additional variables are  
 * fine. An extra copy of the array is not.
 * FOLLOW UP -> Write the test cases for this method.
 *
 */

public class DuplicateCharRemover {
	
	public static String removeDuplicates(String str){
		boolean isUnique[] = new boolean[256];
		char result[] = new char[str.length()];
		int j =0;
		for(char c : str.toCharArray()){
			if(isUnique[c]) 
				continue;
			isUnique[c] = true;
			result[j++] = c;
			
		}
		return String.valueOf(result);
	}
	public static void main(String[] args) {
		
		String s = "SULAGNa";
		String output = DuplicateCharRemover.removeDuplicates(s);
		System.out.println("Length = "+ output.length()+" And string wihtout duplicate is : "+output);

	}

}
