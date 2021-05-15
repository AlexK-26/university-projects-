package nextlesson;

import java.util.Random;
import java.util.Scanner;

public class Ex321 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(100) + 1; //диапазон возможных случайных элементов 
		System.out.println("Количество элементов в последовательности: "+x);
		System.out.print("Введи минимальное и максимальное возможное значение элемента. Пример:(-5 5) ");
		int min = sc.nextInt();
		int max = sc.nextInt();
		int diff = max - min; 
		int minimal=max, sum=0, count=0, p;
		for (int i=0; i<=x-1;i++) { 
			p = r.nextInt(diff + 1);
			p +=min;
			System.out.print(" "+p);
			if (Math.abs(p)<Math.abs(minimal)) minimal=p;
			if (p<0) count++;
			if (p>0) sum+=p;
			
		}
		System.out.println();
		System.out.println("Наименьшее по модулю число: "+minimal);
		System.out.println("Количество отрицательных чисел последовательности: "+count);
		System.out.println("Сумма положительных чисел последовательности: "+sum);

	}

	}


