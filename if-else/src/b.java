import java.util.Scanner;

public class b {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
            
        int dia, mes, ano, horario, horaMin;
        String exmes = null;
        
            System.out.println("Digite o dia: ");
            dia = sc.nextInt();
            System.out.println("Digite o mes: ");
            mes = sc.nextInt();
            System.out.println("Digite o ano: ");
            ano = sc.nextInt();
            System.out.println("Digite o horario: ");
            horario = sc.nextInt();
            
            horaMin = horario * 60;
            
            if(mes == 1) {
                exmes = "Janeiro";
            }else if(mes == 2) {
                exmes = "Fevereiro";
            }else if(mes == 3) {
                exmes = "Março";
            }else if(mes == 4) {
                exmes = "Abril";
            }else if(mes == 5) {
                exmes = "Maio";    
            }else if(mes == 6) {
                exmes = "Junho";
            }else if(mes == 7) {
                exmes = "Julho";        
            }else if(mes == 8) {
                exmes = "Agosto";        
            }else if(mes == 9) {
                exmes = "Setembro";
            }else if(mes == 10) {
                exmes = "Outubro";
            }else if(mes == 11) {
                exmes = "Novembro";
            }else if(mes == 12) {
                exmes = "Dezembro";
            }else {
                System.out.println("Erro, não é um mês.");
            }
            
            if(dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 1950 && ano <= 2022 ) {            
                System.out.printf("A data é %d de %s de %d\n", dia, exmes, ano);
                System.out.printf("Agora são %d horas, %d convertido para minutos", horario, horaMin);
            }
            sc.close();
    }
}