import java.util.Scanner;
public class c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int dia1,mes1,ano1,dia2,mes2,ano2;
		
		System.out.println("Digite um dia: ");
		dia1 = sc.nextInt();
		System.out.println("Digite um mês: ");
		mes1 = sc.nextInt();
		System.out.println("Digite um ano: ");
		ano1 = sc.nextInt();
		
		System.out.println("Digite outro dia: ");
		dia2 = sc.nextInt();
		System.out.println("Digite outro mês: ");
		mes2 = sc.nextInt();
		System.out.println("Digite outro ano: ");
		ano2 = sc.nextInt();
		
		
		if (ano1 > ano2) {
			System.out.println("A data maior é: "+dia1+"/"+mes1+"/"+ano1);
			System.exit(0);
		} else if (ano1 <ano2) {
			System.out.println("\"A data maior é:" +dia2+"/"+mes2+"/"+ano2);
			System.exit(0);
		} else if(ano1 == ano2) {
			if(mes1 > mes2) {
				System.out.println("A data maior é: "+dia1+"/"+mes1+"/"+ano1);
				System.exit(0);
				} else if (mes1 < mes2) {
					System.out.println("\"A data maior é:" +dia2+"/"+mes2+"/"+ano2);
					System.exit(0);
				} else if(mes1 == mes2) {
					if(dia1 > dia2) {
						System.out.println("A data maior é: "+dia1+"/"+mes1+"/"+ano1);
						System.exit(0);
					}else {
						System.out.println("\"A data maior é:" +dia2+"/"+mes2+"/"+ano2);
						System.exit(0);
				}
			}
		}
		
		sc.close();
	}

}
