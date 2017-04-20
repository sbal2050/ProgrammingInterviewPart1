package ArraysAndStrings;

/**
 * 
 * @author sulagnabal
 * Write a method to replace all spaces in a string with ‘%20’.
 *
 */

public class SpaceReplacer {
	
   //If no additional data structures like StringBuffer or StringBuilder not allowed.
  // Or if we can not use methods from String Class like replaceAll().
   public static String replaceSpaceSolutionI(String str, String filler){
	   int spaceCount =0;
	   char[] newCharArray;
	   int newLength = str.length();
	   for(char c: str.toCharArray()){
		   if(c == ' '){ 
			   spaceCount++;
			   newLength += filler.length() -1; //minus 1 for the space that's already there.
		   }
	   }
	   newCharArray = new char[newLength];
	   int i =0;
	   for(char c : str.toCharArray()){
		   if(c == ' '){
			 for(char a : filler.toCharArray()){
				 newCharArray[i] = a;
				 i++;
			 }
		   }
		   else{
			   newCharArray[i] = c;
			   i++;
		   }
	   }
	   
	   return String.valueOf(newCharArray);
   }
	
	
	//With additional datastructure like StringBuilder/StringBuffer
	public static String replaceSpaceSolutionII(String str, String filler){
		
		StringBuilder sb = new StringBuilder();
		for(char c: str.toCharArray()){
			if(c==' '){
				sb.append(filler);
			}
			else{
				sb.append(c);
			}
		}
		
		return sb.toString();
	}

	//Using String Class's replaceAll() method.
	public static String replaceSpaceSolutionIII(String str, String filler){
		if(str == null || str.isEmpty()) return str;
		return str.replaceAll(" ", "%20");
	}
	
	public static void main(String[] args) {
		System.out.println(SpaceReplacer.replaceSpaceSolutionI("I love   Blue Sky ", "%20"));
		System.out.println(SpaceReplacer.replaceSpaceSolutionII("I love   Blue Sky ", "%20"));
		System.out.println(SpaceReplacer.replaceSpaceSolutionIII("I love   Blue Sky ", "%20"));
	}

}
