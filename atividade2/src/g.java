import java.util.Scanner;
public class g {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int x,calc;
        
        System.out.println("Escolha um número: ");
        x = sc.nextInt();
        
        System.out.println("Tabuada de "+x+":");
        
        for(int i = 1; i <11; i++) {
        	calc = x*i;
            System.out.println(+x+"x"+i+" = "+calc);
        }
        
        sc.close();
    }

}