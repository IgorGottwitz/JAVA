import java.util.Scanner;
public class e {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double x, y, calc, comm;
        
        System.out.println("Qual seu salário? ");
        x = sc.nextDouble();
        
        System.out.println("Qual o valor das suas vendas? ");
        y = sc.nextDouble();
        
        comm = (y * 0.04);
        calc = x + (y * 0.04);
        
        System.out.println("Comissão = "+comm);
        
        System.out.println("Salário total = "+calc);
        
        sc.close();
    }

}