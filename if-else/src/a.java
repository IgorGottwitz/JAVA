import java.util.Scanner;
public class a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int res;
		double x;
		double y;
		double result;
		
		System.out.println("Escolha uma dessas op��es: ");
		System.out.println("1 - Somar dois n�meros: ");
		System.out.println("2 - Raiz quadrada de n�mero: ");
		System.out.println("--> ");
		res = sc.nextInt();
		
		if (res == 1) {
			System.out.println("Escolha dois n�meros para serem somados: ");
			x = sc.nextDouble();
			y = sc.nextDouble();
			result = x + y;
			System.out.println("Resultado = "+result);
		} else if (res == 2) {
			System.out.println("Escolha um n�mero para saber sua raiz quadrada: ");
			x = sc.nextDouble();
			result = Math.sqrt(x);
			
			System.out.println("Resultado = "+result);
		} else if (res != 1 || res != 2) {
			System.out.println("Erro, tente novamente");
			System.exit(0);
		}
		
		sc.close();
	}

}
