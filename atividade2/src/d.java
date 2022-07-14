import java.util.Scanner;
public class d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double x;
		double calc;
        
        System.out.println("Escolha um número: ");
        x = sc.nextDouble();        
        
        calc = (x * (0.10));
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}