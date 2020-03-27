
import java.util.Scanner;

public class leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도입력. : ");
		int a =sc.nextInt();
		
		if(a % 4 == 0 && a % 100!=0 || a % 400 == 0) { 
			System.out.println(a + "년, 윤년");
		}
		
		else {
			System.out.println(a + "년, 평년");
			} 
		}
	}
