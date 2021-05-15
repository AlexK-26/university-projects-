package onlesson;

import java.util.Scanner;

public class Ex21 {
	public static void main(String[] args) {
		System.out.print("Введи х у :");
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if (x>0 & y>0) System.out.println("Точка в I четверти");
		else
			if (x<0 & y>0) System.out.println("Точка в II четверти");
			else
				if (x<0 & y<0) System.out.println("Точка в III четверти");
				else 
					if (x>0 & y<0) System.out.println("Точка в IV четверти");
					else
						if (x==0 & y==0) System.out.println("Точка в начале координат");
						else System.out.println("Введенные данные неверны");
		
	}
}