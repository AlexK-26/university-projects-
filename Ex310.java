package nextlesson;

import java.util.Random;
import java.util.Scanner;

public class Ex310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("¬веди минимальный и максимальный возможный вес груза в тоннах . ѕример:(1 5) ");
		//int min = sc.nextInt();
		//int max = sc.nextInt();
		System.out.println();
		//int diff = max - min;
		int storage=0 , load=0 , z=0 , N=1;
		
		for (; storage < 1000 && N<2000; N++) { //
			//load = (r.nextInt(diff))+min;
			load = sc.nextInt();
			if (load+storage>1000) { 
				System.out.println("√руз є"+N+" весом "+load+"т не поместитс€ на склад");
				z++;
				//break;
				}
			else {
			storage+=load;
			System.out.println("√руз є"+N+" весом "+load+"т поместитс€ на склад.");
			System.out.println((1000-storage)+"т осталось места на складе." );
			System.out.println();
			
			}
			
		}
		if (z>0) {
			System.out.println(N-z+" грузов поместилось на склад. "+z+" грузов не поместилось");
			System.out.println((1000-storage)+"т на складе осталось свободного места");
		}
		if (z==0) System.out.println("¬се "+N+" грузов поместились на склад");
		

	}

}
