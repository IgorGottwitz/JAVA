import java.util.Scanner;
public class c {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x, y, calc;
        
        System.out.println("Escolha um n�mero: ");
        x = sc.nextInt();
        
        if(x == 0) {
            System.out.println("Erro, n�o aceitamos valor nulo");
            System.exit(0);
        }
        
        System.out.println("Escolha outro n�mero: ");
        y = sc.nextInt();
        
        calc = x/y;
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}