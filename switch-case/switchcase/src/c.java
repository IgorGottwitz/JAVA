import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String promocao;
        int quant_livros;
        double preco_livro = 0, fixo = 0, of1, of2, total;
        
        System.out.println("Quantos livros deseja comprar?");
        quant_livros = sc.nextInt();
        
        of1 =  7.50 + (quant_livros * 0.25);
        of2 = 2.50 + (quant_livros * 0.50);
        
        if(of1 > of2) {
            System.out.println("A melhor é a opção B");
        }else if(of2 > of1) {
            System.out.println("A melhor é a opção A");
        }
        System.out.println("Por favor, escolha a sua promoção:");
        System.out.println("A = R$0,25 por livro + R$7,50 fixo");
        System.out.println("B = R$0,50 por livro + R$2,50 fixo");
        promocao = sc.next();
            
        switch(promocao){
        	case("A"):
        		preco_livro = 0.25;
        		fixo = 7.50;
        		break;
        	case("B"):
        		preco_livro = 0.50;
        		fixo = 2.50;
        		break;
        	default:
        		System.out.println("Valor inválido inserido!");
        	}
        	
        total = (quant_livros * preco_livro) + fixo;
        System.out.println("Valor a pagar: R$"+total);
            
        sc.close();
    }

}