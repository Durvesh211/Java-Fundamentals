package trials;
class Tester66{
    
static String moveSpecialCharacters(String str){
        
      String regex = "[^a-zA-Z0-9\\s+]";
      String specialChars = "";
      String inputData = "";
      for(int i=0; i< str.length(); i++) {
         char ch = str.charAt(i);
         if(String.valueOf(ch).matches(regex)) {
            specialChars = specialChars + ch;
         } else {
            inputData = inputData + ch;
         }
      }
		//Implement your code here and change the return value accordingly
      String str1 = inputData+specialChars;
        return str1;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	   
	}
	
}