package onlesson;
import java.util.Random;
import java.util.Scanner;
public class Zadacha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a=r.nextInt(100);
		int b=r.nextInt(100);
		System.out.println("Проверка знания ТАБЛИЦЫ УМНОЖЕНИЯ");
		System.out.print("Решите пример "+a+"*"+b+" = ");
		Scanner sc = new Scanner(System.in);
		int c=sc.nextInt();
		if (c==a*b) System.out.print("Ура!");
		else {System.out.print("Неверно: ");
			System.out.print("Решите пример повторно "+a+"*"+b+" = ");
			c=sc.nextInt();}
		if (c==a*b) System.out.print("Ура!");
		else System.out.print("Опять Неверно: "+a+"*"+b+" = "+(a*b));
	}

}
