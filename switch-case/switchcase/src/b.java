import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o número de um produto: ");
		int num_prod = sc.nextInt();
		System.out.println("Qual o peso do produto? ");
		double peso_prod = sc.nextDouble();
		System.out.println("Qual é o país de origem? ");
		int cod_pais = sc.nextInt();
		
		String nome_prod;
		double reaj_peso = 0,reaj_imposto,calc_imposto;
		
		switch (num_prod) {
		case 1:
			nome_prod = "Maçã";
			break;
		case 2:
			nome_prod = "Batata";
			break;
		case 3:
			nome_prod = "Cenoura";
			break;
		case 4:
			nome_prod = "Laranja";
			break;
		case 5:
			nome_prod = "Ameixa";
			break;
		case 6:
			nome_prod = "Carambola";
			break;
		case 7:
			nome_prod = "Tomate";
			break;
		case 8:
			nome_prod = "Banana";
			break;
		case 9:
			nome_prod = "Jaca";
			break;
		case 10:
			nome_prod = "Amora";
			break;
		default:
			nome_prod = "Número inválido";
		}
		
		switch(cod_pais) {
		case 1:
			reaj_imposto = 0;
			break;
		case 2:
			reaj_imposto = 0.15;
			break;
		case 3:
			reaj_imposto = 0.25;
			break;
		default:
			reaj_imposto = 0;
			nome_prod = "ERRO";
			sc.close();
		}
		
		if(num_prod <= 4) {
			reaj_peso = peso_prod * 10;
		}else if(num_prod <= 7) {
			reaj_peso = peso_prod * 25;
		}else if(num_prod <= 10) {
			reaj_peso = peso_prod * 35;
		}
		
		calc_imposto = reaj_peso + (reaj_imposto * reaj_peso);
		
		System.out.println("Nome do produto: "+nome_prod);
		System.out.println("Peso do produto:" +peso_prod);
		System.out.println("Preço do produto: " +reaj_peso);
		System.out.println("Valor do imposto: " +reaj_imposto);
		System.out.println("Valor total do produto: " +calc_imposto);
		
		
		sc.close();
	}

}
