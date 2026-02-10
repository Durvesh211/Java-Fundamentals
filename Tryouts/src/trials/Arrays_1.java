package trials;

import java.util.Arrays;

public class Arrays_1 {
	public static void main(String[] args) {		

int[] numArr1 = {6,8,9,10,40,66};
int[] numArr3 = {8,6,9,10,40,66};
int[] numArr2 = {6,8,9,10,40,66};
boolean resultCompare = Arrays.equals(numArr1, numArr2);
System.out.println(resultCompare); //prints true or false
System.out.println(Arrays.equals(numArr1, numArr3)); //prints true or false
	}
}
