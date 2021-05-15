package onlesson;
import java.util.Scanner;
public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите a и b ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//System.out.print("Большее число: ");
		if (a==b) System.out.print("Равны");
		else if (a>b) System.out.print("Большее число: "+a);
		else System.out.print("Большее число: "+b);
	}

}
