import java.util.Scanner;

public class d {
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        int horaInicio, horaFim, minutoInicio, minutoFim, duracaoHora, duracaoMin;
        
        System.out.println("Insira a hora do início do jogo (primeiro a hora e depois minuto)");
            horaInicio = sc.nextInt();
            minutoInicio = sc.nextInt();
        System.out.println("Insira a hora do fim do jogo (primeiro a hora e depois minuto)");
            horaFim = sc.nextInt();
            minutoFim = sc.nextInt();
            
            if (horaInicio > horaFim) {
                duracaoHora = horaInicio - horaFim;
            }else {
                duracaoHora = horaFim - horaInicio;
            }
            if (minutoInicio > minutoFim) {
                duracaoMin = minutoInicio - minutoFim;
            }else {
                duracaoMin = minutoFim - minutoInicio;
            }
            if(duracaoHora > 24) {
                System.out.println("Jogo terminado, limite de 24 horas atingido.");
            }else {
                System.out.printf("O jogo durou %d horas e %d minutos", duracaoHora, duracaoMin);
            }
            sc.close();
    }
}
