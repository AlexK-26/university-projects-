package homeEx1By10page;
import java.util.*;
import java.lang.*;
import java.text.DecimalFormat;
public class Ex17 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("¬веди переводимую величину в дюймах:");
		double inch=sc.nextDouble();
		double mm=inch*25.4;
		int cm=(int)mm/10;
		int m=cm/100;
		double outmm=mm-(cm*10);
		DecimalFormat df = new DecimalFormat( "#.#" );
		String fmm = df.format(outmm);
		System.out.println(+inch+" дюйм =" +m+" м "+(cm-(m*100))+" см "+fmm+" мм");

	}

}
