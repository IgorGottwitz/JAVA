import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1,calc;
		
		do {
			System.out.println("Digite um número: ");
			n1 = sc.nextDouble();
			
			calc= n1 % 2;
			if(calc != 0) {
				System.out.println(n1+" Não é um número primo");
			}
			
		}while(calc != 0);
		
		System.out.println(n1+" É um número primo");
		sc.close();
	}

}
