import java.util.Scanner;
public class e {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int id;
		float aumento;
		
		System.out.println("Qual o id do funcionario?");
		id = sc.nextInt();
		
		if (id==1) {
			System.out.println("Cargo: Escritu�rio, Sal�rio atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.5));
			System.out.println("Esse � o sal�rio p�s aumento"+aumento);
		} else if (id==2) {
			System.out.println("Cargo: Secret�rio, Sal�rio atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.35));
			System.out.println("Esse � o sal�rio p�s aumento"+aumento);
		}else if (id==3) {
			System.out.println("Cargo: Caixa, Sal�rio atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.2));
			System.out.println("Esse � o sal�rio p�s aumento"+aumento);
		}else if (id==4) {
			System.out.println("Cargo: Gerente, Sal�rio atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*0.1));
			System.out.println("Esse � o sal�rio p�s aumento"+aumento);
		}else if (id==5) {
			System.out.println("Cargo: Diretor, Sal�rio atual = 1000 + 50% de aumento");
			aumento = (float) (1000 + (1000*1));
			System.out.println("Esse � o sal�rio p�s aumento"+aumento);
		}
		
		
		
		sc.close();
	}

}
