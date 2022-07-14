import java.util.Scanner;

public class d {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int mod_compra = 0, parcelas = 0;
        double valor_com, desconto = 0, acrescimo = 0, total_compra, valor_parcelas = 0, dif_valor = 0;
        String tipo_pagamento = null;
            
            System.out.println("Qual o valor da compra?");
            valor_com = sc.nextDouble();
            
            System.out.println("Escolha o modelo da compra");
            System.out.println("1 - Pagamento à vista - 15% de desconto sobre o valor total da compra");
            System.out.println("2 - Pagamento com cheque pré-datado para 30 dias - 10% de desconto sobre o valor total da compra");
            System.out.println("3 - Pagamento parcelado em 6 vezes - não tem desconto");
            System.out.println("4 - Pagamento parcelado em 12 vezes - 8% de acréscimo sobre o valor da compra");
            mod_compra = sc.nextInt();
            
            switch(mod_compra) {
                case 1: 
                    desconto = 15;
                    tipo_pagamento = "Á VISTA";
                    break;
                case 2:
                    desconto = 10;
                    tipo_pagamento = "CHEQUE PRÉ-DATADO 30 DIAS";
                    break;
                case 3: 
                    desconto = 0;
                    tipo_pagamento = "PARCELADO 6x";
                    parcelas = 6;
                    break;
                case 4:
                    desconto = 0;
                    acrescimo = 8;
                    tipo_pagamento = "PARCELADO 12x";
                    parcelas = 12;
                    break;
                default:
                    System.out.println("Inválido");
            }
            
            if(mod_compra == 4) {
                total_compra = valor_com + (valor_com *(acrescimo / 100));
            }else {
                total_compra = valor_com - (valor_com * (desconto / 100));
            }
            if(mod_compra == 3 || mod_compra == 4) {
                valor_parcelas = total_compra / parcelas;
            }
                System.out.println("O valor bruto foi "+valor_com);
                System.out.println("Você escolheu o modelo "+tipo_pagamento);
                
                dif_valor = total_compra - valor_com;
                
            if(desconto > 0) {
                System.out.println("Você recebeu um desconto de "+desconto+"%");
            }else if(acrescimo > 0) {
                System.out.println("você pagará juros de "+acrescimo+"%");
                System.out.println("Você pagará em "+parcelas+" parcelas de "+valor_parcelas);
                
            }else if(desconto == 0) {
                System.out.println("você não possui desconto");
                System.out.println("Você pagará em "+parcelas+" parcelas de "+valor_parcelas);
            }
                
            System.out.println("O valor final: R$"+total_compra+" Diferença foi: R$"+dif_valor);
            
            sc.close();
    }

}