import java.util.Scanner;
public class i {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double x, y,z,hT,hE, calc = 0;
        int perg;
        
        System.out.println("Quantas horas foram trabalhadas? ");
        x = sc.nextDouble();
        
        System.out.println("Qual o sal�rio minimo? ");
        y = sc.nextDouble();
        
        System.out.println("Quantas horas extras? ");
        z = sc.nextDouble();
        
        System.out.println("Quanto vale a hora trabalhada? ");
        hT = sc.nextDouble();
        
        System.out.println("Quanto vale a hora extra? ");
        hE = sc.nextDouble();
        
        System.out.println("Como voc� quer realizar o c�lculo?\n"
        		+ "1 - Hora trabalhada vale 1/8 do sal�rio;\n"
        		+ "2 - Hora trabalhada vale 1/4 do sal�rio;\n"
        		+ "3 - O sal�rio bruto equivale ao n�mero de horas trabalhadas multiplicado pelo valor da hora trabalhada;\n"
        		+ "4 - A quantia a receber pelas horas extras equivale ao n�mero de horas extras trabalhadas multiplicado pelo valor da hora extra;\n"
        		+ "5 - O sal�rio a receber equivale ao sal�rio bruto mais a quantia a receber pelas horas extras;\n");
        perg = sc.nextInt();
        
        if (perg == 1) {
            calc = (y/8) * (x + z);
        }
        if (perg == 2) {
            calc = (y/4) * (x + z);
        }
        if (perg == 3) {
            calc = hT * (x + z);
        }
    	if (perg == 4) {
    		calc = z * hE;
    	}
        if (perg == 5) {
            calc = y + (z * hE);
        }
        
        System.out.println("Resultado: "+calc);
        
        sc.close();
    }

}