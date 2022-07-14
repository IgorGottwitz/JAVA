import java.util.Scanner;
public class b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x, y,z, calc;
        
        System.out.println("Escolha um número: ");
        x = sc.nextInt();
        
        System.out.println("Escolha outro número: ");
        y = sc.nextInt();
        
        System.out.println("Escolha mais outro número: ");
        z = sc.nextInt();
        
        calc = x * y * z;
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}