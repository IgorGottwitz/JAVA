import java.util.Scanner;
public class f {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int sMin = 1212, sTrab, calc;
        
        System.out.println("Escolha um número: ");
        sTrab = sc.nextInt();
        
        calc = sTrab / sMin;
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}