import java.util.*;

public class gugu {
	public static void main(String[] args) {
	int a;
	Scanner sc = new Scanner(System.in);
	System.out.print("단 입력 : ");
	
	int x = sc.nextInt();
	
		for(a = 1; a<=9; a++) {
			System.out.println(x + " * " + a + " = "+ x * a );		
		}
	}
}
