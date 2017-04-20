package ArraysAndStrings;

public class SubStringChecker {
	
	
	public static boolean isSubString(String longer, String shorter){
		if(longer == null || shorter == null ) return false;
		if(longer.isEmpty() || shorter.isEmpty()) return false;
		if(shorter.length() > longer.length()) return false;
		
		for(int i =0; i< longer.length() ; i++){
			if(longer.charAt(i) == shorter.charAt(0)){
				String subString = longer.substring(i, i + shorter.length());
				if(subString.equals(shorter)) return true;
				i = i+ shorter.length();
			}
		}
		
		return false;
	}
	

	public static void main(String[] args) {
		System.out.println(SubStringChecker.isSubString(" ", "Car"));

	}

}
