package trials;

public class Regexx {
	
		public static void main(String args[]) {
			String regex1 = "[\\w]+ [\\w]+ [\\d]+";
			String str1 = "d2 Training 123";

			String regex2 = "[\\w]+ [\\t] [\\w]+";
			String str2 = "Java 	 Training";

			String regex3 = "[\\w]+ [^\\w]+ [\\d]+";
			String str3 = "Java Training 123";

			String regex4 = "[\\D]+ [\\W]+";
			String str4 = "Java *";

			System.out.println(str1.matches(regex1));
			System.out.println(str2.matches(regex2));
			System.out.println(str3.matches(regex3));
			System.out.println(str4.matches(regex4));

		}
	}