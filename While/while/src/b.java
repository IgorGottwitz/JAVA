import java.util.Scanner;

public class b{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual é o seu salário carlos? ");
        double salarioCarlos = sc.nextDouble();
        int mes = 0;
        double salarioJoao = salarioCarlos / 3;
        while (salarioJoao < salarioCarlos) {
    
        salarioCarlos += (salarioCarlos * 2 /100);
        salarioJoao += (salarioJoao * 5 /100);
         mes = mes + 1;
        }
        System.out.println("Salario final: " + mes);

        sc.close();
        
    }

}