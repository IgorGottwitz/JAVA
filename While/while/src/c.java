import java.util.Scanner;
public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1,n2,n3,calc;
		int a = 0;
		
		do {
		a = a + 3;
		System.out.println("Digite 3 n�meros");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		calc = n1 + n2 + n3;
		System.out.println("A soma dos n�meros �: "+calc);
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: "+ n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero �: "+n2);
		}else {
			System.out.println("O maior n�mero �: "+n3);
		}
		
		if(n1 < n2 && n1 < n3) {
			System.out.println("O menor n�mero �: "+ n1);
		}else if(n2 < n1 && n2 < n3) {
			System.out.println("O menor n�mero �: "+n2);
		}else {
			System.out.println("O menor n�mero �: "+n3);
		}
		
		
		System.out.println(+a+" N�meros foram digitados.");
		}
		while (n1 != 30000||n2 != 30000 || n3 != 30000 );
		sc.close();
	}

}
