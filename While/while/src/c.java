import java.util.Scanner;
public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double n1,n2,n3,calc;
		int a = 0;
		
		do {
		a = a + 3;
		System.out.println("Digite 3 números");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		
		calc = n1 + n2 + n3;
		System.out.println("A soma dos números é: "+calc);
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número é: "+ n1);
		}else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior número é: "+n2);
		}else {
			System.out.println("O maior número é: "+n3);
		}
		
		if(n1 < n2 && n1 < n3) {
			System.out.println("O menor número é: "+ n1);
		}else if(n2 < n1 && n2 < n3) {
			System.out.println("O menor número é: "+n2);
		}else {
			System.out.println("O menor número é: "+n3);
		}
		
		
		System.out.println(+a+" Números foram digitados.");
		}
		while (n1 != 30000||n2 != 30000 || n3 != 30000 );
		sc.close();
	}

}
