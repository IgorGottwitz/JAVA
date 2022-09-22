package program;
import java.util.Scanner;
import entities.soma;
import entities.sub;
import entities.divisao;
import entities.multiplicacao;
import entities.potencia;
import entities.raiz;
import entities.porcentagem;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int perg;
        soma soma = new soma();
        sub sub = new sub();
        divisao divisao = new divisao();
        multiplicacao multiplicacao = new multiplicacao();
        potencia potencia = new potencia();
        raiz raiz = new raiz();
        porcentagem porcentagem = new porcentagem();

        System.out.println("Qual operação você quer fazer?"
                + "\n 1 - Soma "
                + "\n 2 - Subtração  "
                + "\n 3 - Divisão "
                + "\n 4 - Multiplicação "
                + "\n 5 - Potenciacão"
                + "\n 6 - Raiz quadrada"
                + "\n 7 - Porcentagem");
        perg = sc.nextInt();

        switch (perg) {
            case 1:
                System.out.println("Quais números deseja somar? ");
                soma.n1 = sc.nextDouble();
                soma.n2 = sc.nextDouble();

                System.out.println("Resultado: "+soma.soma());
                break;

            case 2:
                System.out.println("Quais números deseja subtrair? ");
                sub.n1 = sc.nextDouble();
                sub.n2 = sc.nextDouble();

                System.out.println("Resultado: "+sub.sub());
                break;
            case 3:
                System.out.println("Quais números deseja dividir? ");
                divisao.n1 = sc.nextDouble();
                divisao.n2 = sc.nextDouble();

                System.out.println("Resultado: "+divisao.divisao());
                break;
            case 4:
                System.out.println("Quais números deseja multiplicar? ");
                multiplicacao.n1 = sc.nextDouble();
                multiplicacao.n2 = sc.nextDouble();

                System.out.println("Resultado: "+multiplicacao.multiplicacao());
                break;
            case 5:
                System.out.println("Quais números deseja potencializar? ");
                potencia.n1 = sc.nextDouble();
                potencia.n2 = sc.nextDouble();

                System.out.println("Resultado: "+potencia.potencia());
                break;
            case 6:
                System.out.println("Qual número deseja tirar a raiz quadrada? ");
                raiz.n1 = sc.nextDouble();

                System.out.println("Resultado: "+raiz.raiz());
                break;
            case 7:
                System.out.println("Qual número deseja tirar a porcentagem? ");
                porcentagem.n1 = sc.nextDouble();
                System.out.println("Qual o percentual? ");
                porcentagem.n2 = sc.nextDouble();

                System.out.println("Resultado: "+porcentagem.porcentagem()+"%");
                break;
        }
        sc.close();

   }
}
