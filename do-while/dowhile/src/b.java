import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y = 0,cidadeNumeroMenor = 0,cidadeNumeroMaior = 0,i = 1,veiculo = 0,acidente = 0;
		double x = 0,totalAcidente = 0,totalVeiculo,indice, mediaVeiculo = 0, mediaAcidente = 0,indiceMenor = 0,indiceMaior = 0;
		do {
			System.out.println("Cidade: "+i);
			System.out.println("Quantos ve�culos ela possui? ");
			veiculo = sc.nextInt();
			System.out.println("Quantos acidentes com v�timas ela possui? ");
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
		System.out.println("Maior �ndice: "+indiceMaior);
		System.out.println("Cidade: "+cidadeNumeroMenor);
		System.out.println("Menor �ndice: "+indiceMenor);
		System.out.println("M�dia de ve�culo das 5 cidades: "+mediaVeiculo);
		System.out.println("M�dia de acidentes nas cidades com menos de 2000 ve�culos: "+totalAcidente);
		sc.close();
	}

}
