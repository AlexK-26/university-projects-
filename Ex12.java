package homeEx1By10page;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Ââåäè òðåõçíà÷íîå ÷èñëî x=");
		int x=sc.nextInt();
		int x0=x%10;
		int x1=(x/10)%10;
		int x2=x/100;
		int unox=x0*100+x1*10+x2;
		System.out.print("×èñëî ïåðåâ¸ðòûøü ÷èñëà "+x+" ýòî: "+unox);
	}

}
