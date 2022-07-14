import java.util.Scanner;
public class f {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float salario,fim;
		
		System.out.println("1. Imposto");
		System.out.println("2. Novo salário");
		System.out.println("3. Classificação");
		int res = sc.nextInt();
		
		if (res==1) {
			System.out.println("Qual o salario do funcionario?");
			salario = sc.nextFloat();
			if(salario < 500) {
				fim = (float) (salario*0.05);
				System.out.println(fim);
			}else if(salario <= 850) {
				fim = (float) (salario*0.10);
				System.out.println(fim);
			}else if(salario > 850) {
				fim = (float) (salario*0.15);
				System.out.println(fim);
			}
		}else if (res==2) {
			System.out.println("Qual o salario do funcionario?");
			salario = sc.nextFloat();
			if(salario < 1500) {
				fim = (float) (salario + 25);
				System.out.println(fim);
			}else if(salario >= 750) {
				fim = (float) (salario+50);
				System.out.println(fim);
			}else if(salario >= 450) {
				fim = (float) (salario+75);
				System.out.println(fim);
			}else if(salario < 450) {
				fim = (float) (salario+100);
				System.out.println(fim);
		} else if (res==3) {
			System.out.println("Qual o salario do funcionario?");
			salario = sc.nextFloat();
			if(salario <= 700) {
				System.out.println("Mal remunerado");
			}else if(salario >700) {
				System.out.println("Bem remunerado");
			}
		}
	}
		
		sc.close();
	}

}
