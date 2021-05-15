package homeEx1By10page;
import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("¬веди трехзначное число x=");
		int x=sc.nextInt();
		int x0=x%10;
		int x1=(x/10)%10;
		int x2=x/100;
		int unox=x0*100+x1*10+x2;
		System.out.print("„исло перевЄртышь числа "+x+" это: "+unox);
	}

}
