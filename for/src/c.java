import java.util.Scanner;
public class c {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salvarPeca = 0,salvarSalarioF = 0,salvarSalarioM = 0, salario = 0,folha = 0,mediaPecaM = 0,mediaPecaF = 0,salvarPecaF = 0, salvarPecaM = 0,salMaior = 0;
		int classePerg = 0,funcionario = 0,i,mulher = 0,homem = 0;
		
		for(i = 1;i<4;i++){
			System.out.println("Escolha uma classe de funcion�rio (1 a 3): ");
			classePerg = sc.nextInt();
			System.out.println("Quantas pe�as ele fez durante o m�s? ");
			double peca = sc.nextInt();
			System.out.println("Qual o sexo do funcion�rio? 1 para Feminino e 2 para Masculino ");
			char sexoPerg = sc.next().charAt(0);
			
			switch(classePerg) {
			case 1:
				salario = 1200;
				break;
			case 2:
				peca = peca - 30;
				salario = 1200 + ((1200 * 0.03)*peca);
				break;
			case 3:
				peca = peca - 30;
				salario = 1200 + ((1200*0.05)*peca);
				break;
			default:
				System.out.println("N�mero inv�lido.");
				sc.close();
			}
			
			if(sexoPerg == 1) {
				mulher++;
				salvarPecaF = peca + salvarPecaF;
			}else if(sexoPerg == 2) {
				homem++;
				salvarPecaM = peca + salvarPecaM;
			}
			
			if(salario > salMaior) {
				salMaior = salario;
				funcionario = i;
			}
			
			folha = salario + folha;
			salvarPeca = peca + salvarPeca;
			
			System.out.println("N�mero do funcion�rio: "+i);
			System.out.println("Sal�rio do funcion�rio: "+salario);
		}
		
		mediaPecaM = salvarPecaM/homem;
		mediaPecaF = salvarPecaF/mulher; 
		

		System.out.println("Valor da folha: "+folha);
		System.out.println("N�mero total de pe�as: "+salvarPeca);
		System.out.println("N�mero de pe�as que os guri fizeram: "+salvarPecaM);
		System.out.println("N�mero de pe�as que as guria fizeram: "+salvarPecaF);
		System.out.println("M�dia de pe�as que os homens fizeram: "+mediaPecaM);
		System.out.println("M�dia de pe�as que as mulheres fizeram: "+mediaPecaF);
		System.out.println("Funcion�rio com maior sal�rio �: "+funcionario);
		
		sc.close();
	}

}
