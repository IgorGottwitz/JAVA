import java.util.Scanner;
public class b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x, y,z, calc;
        
        System.out.println("Escolha um n�mero: ");
        x = sc.nextInt();
        
        System.out.println("Escolha outro n�mero: ");
        y = sc.nextInt();
        
        System.out.println("Escolha mais outro n�mero: ");
        z = sc.nextInt();
        
        calc = x * y * z;
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}