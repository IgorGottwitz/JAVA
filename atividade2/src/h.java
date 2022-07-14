import java.util.Scanner;
public class h {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double sJoao = 3500,contas, calc;
       
        contas = (2 * 0.02) * sJoao;
        
        calc = sJoao - contas;
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}