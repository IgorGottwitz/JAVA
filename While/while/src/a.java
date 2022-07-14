import java.util.Scanner;

public class a {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         double val = 1, quadrado, cubo, raiz;
         
         System.out.println("Digite o número para conta, digite 0 ou val negativo para sair");
         
         while(val > 0) {
             val = sc.nextDouble();
             
             if(val != 0) {
             quadrado = val * val;
             cubo = val * val * val;
             raiz = Math.sqrt(val);
             
             System.out.println("Valor ao quadrado:"+quadrado);
             System.out.println("Valor ao cubo:"+cubo);
             System.out.println("Raiz quadrada do valor:"+raiz);
             System.out.println("Digite mais um número para continuar, ou 0 para sair.");
             
             }else {
                 System.out.println("Encerrando o programa.");
             }
         }
         sc.close();
    }
    
}