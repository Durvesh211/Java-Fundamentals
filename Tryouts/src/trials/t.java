package trials;

public class t {

}
class Tester3{

    public static String removeWhiteSpaces(String str){
		String strx = str.replaceAll(" ", "");
        return strx;
	}
	
	public static void main(String args[]){
		String str = "Hello   How are you   ";
		str = removeWhiteSpaces(str);
		System.out.println(str);
	}
}