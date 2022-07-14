import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = 0,cidadeNumeroMenor = 0,cidadeNumeroMaior = 0,i = 1,veiculo = 0,acidente = 0;
		double x = 0,totalAcidente = 0,totalVeiculo,indice, mediaVeiculo = 0, mediaAcidente = 0,indiceMenor = 0,indiceMaior = 0;
		do {
			System.out.println("Cidade: "+i);
			System.out.println("Quantos veículos ela possui? ");
			veiculo = sc.nextInt();
			System.out.println("Quantos acidentes com vítimas ela possui? ");
			acidente = sc.nextInt();
			
			indice = acidente/veiculo;
			
			if(indice > indiceMaior) {
				indiceMaior = indice;
				cidadeNumeroMaior = i;
			}
			if(indiceMenor > indice) {
				indiceMenor = indice;
				cidadeNumeroMenor = i;
			}
			
			totalAcidente = acidente + mediaAcidente;
			
			totalVeiculo = veiculo + mediaVeiculo;
			
			if(veiculo<2000) {
				x = veiculo + x;
				y++;
			}
			
			
			i++;
		}while(i < 5);
		
		totalAcidente = x /y;
		mediaVeiculo = totalVeiculo/5;
		
		System.out.println("Cidade: "+cidadeNumeroMaior);
		System.out.println("Maior índice: "+indiceMaior);
		System.out.println("Cidade: "+cidadeNumeroMenor);
		System.out.println("Menor índice: "+indiceMenor);
		System.out.println("Média de veículo das 5 cidades: "+mediaVeiculo);
		System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: "+totalAcidente);
		sc.close();
	}

}
