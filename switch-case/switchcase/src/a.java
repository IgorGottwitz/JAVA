import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o n�mero de algum funcion�rio: ");
		int x = sc.nextInt();
		System.out.println("Qual seu sal�rio? ");
		double salario = sc.nextDouble();
		
		double calc, percent;
		int cod = 0;
		String func;
		
		switch (x) {
		case 1:
			func = "Escrituario";
			cod = 1;
			percent = 0.50;
			break;
		case 2:
			func = "Secretario";
			cod = 2;
			percent = 0.35;
			break;
		case 3:
			func = "Caixa";
			cod = 3;
			percent = 0.20;
			break;
		case 4:
			func = "Gerente";
			cod = 4;
			percent = 0.10;
			break;
		case 5:
			func = "Diretor";
			cod = 5;
			percent = 0;
			break;
		default :
			func = "Valor inv�lido";
			percent = 0;
			break;
		}
		calc = salario + (salario * percent);
		
		System.out.println("Id: "+cod+" - Cargo: "+func+" - Sal�rio: "+calc);
		sc.close();
	}

}
