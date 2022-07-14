import java.util.Scanner;
public class e {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int id;
		float aumento;
		
		System.out.println("Qual o id do funcionario?");
		id = sc.nextInt();
		
		if (id==1) {
			System.out.println("Cargo: Escrituário, Salário atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.5));
			System.out.println("Esse é o salário pós aumento"+aumento);
		} else if (id==2) {
			System.out.println("Cargo: Secretário, Salário atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.35));
			System.out.println("Esse é o salário pós aumento"+aumento);
		}else if (id==3) {
			System.out.println("Cargo: Caixa, Salário atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.2));
			System.out.println("Esse é o salário pós aumento"+aumento);
		}else if (id==4) {
			System.out.println("Cargo: Gerente, Salário atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.1));
			System.out.println("Esse é o salário pós aumento"+aumento);
		}else if (id==5) {
			System.out.println("Cargo: Diretor, Salário atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*1));
			System.out.println("Esse é o salário pós aumento"+aumento);
		}
		
		
		
		sc.close();
	}

}
