import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double n1,calc;
		
		do {
			System.out.println("Digite um n�mero: ");
			n1 = sc.nextDouble();
			
			calc= n1 % 2;
			if(calc != 0) {
				System.out.println(n1+" N�o � um n�mero primo");
			}
			
		}while(calc != 0);
		
		System.out.println(n1+" � um n�mero primo");
		sc.close();
	}

}
