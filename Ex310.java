package nextlesson;

import java.util.Random;
import java.util.Scanner;

public class Ex310 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("����� ����������� � ������������ ��������� ��� ����� � ������ . ������:(1 5) ");
		//int min = sc.nextInt();
		//int max = sc.nextInt();
		System.out.println();
		//int diff = max - min;
		int storage=0 , load=0 , z=0 , N=1;
		
		for (; storage < 1000 && N<2000; N++) { //
			//load = (r.nextInt(diff))+min;
			load = sc.nextInt();
			if (load+storage>1000) { 
				System.out.println("���� �"+N+" ����� "+load+"� �� ���������� �� �����");
				z++;
				//break;
				}
			else {
			storage+=load;
			System.out.println("���� �"+N+" ����� "+load+"� ���������� �� �����.");
			System.out.println((1000-storage)+"� �������� ����� �� ������." );
			System.out.println();
			
			}
			
		}
		if (z>0) {
			System.out.println(N-z+" ������ ����������� �� �����. "+z+" ������ �� �����������");
			System.out.println((1000-storage)+"� �� ������ �������� ���������� �����");
		}
		if (z==0) System.out.println("��� "+N+" ������ ����������� �� �����");
		

	}

}
