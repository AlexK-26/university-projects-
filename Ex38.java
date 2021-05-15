package nextlesson;

import java.util.Scanner;
import java.text.*;
public class Ex38 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumIntegerDigits(2); 
		System.out.print("¬веди начало дн€(HH MM) ");
		int H=sc.nextInt();
		int M=sc.nextInt();
		int start=H*60+M;
		System.out.print("¬веди длительность урока");
		int urok=sc.nextInt();
		System.out.print("¬веди длительность перемены");
		int peremena=sc.nextInt();
		System.out.print("¬веди количество уроков");
		int n=sc.nextInt();
		int OutH, OutM,nachalo, konec; 
		for (int i=1; i<=n; i++) {
			nachalo=start+(i-1)*urok + (n-1)*peremena;
			OutH=nachalo/60;
			OutM=nachalo%60;
			System.out.print(i+" ”рок "+nf.format(OutH)+":"+nf.format(OutH) +"Ч");
			konec=start+i*urok+(i-1)*peremena;
			OutH=konec/60;
			OutM=konec%60;
			System.out.println(nf.format(OutH)+":"+nf.format(OutM));
		
			
		}

	}

}
