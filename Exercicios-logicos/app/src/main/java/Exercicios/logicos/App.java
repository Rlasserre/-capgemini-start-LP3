
package Exercicios.logicos;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            
            //entrada de dados
            System.out.println("Digite o ano de fabrica��o do ve�culo");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do carro");
            valorVeiculo = leitor.nextFloat();
                
            if (anoFabricacao >= 2000) {
                porcentagemDesconto = 0.12f;
            } else { 
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos ++;
            }
            totalCarros ++;
            
            valorDesconto = valorVeiculo * porcentagemDesconto;
            
            System.err.println("O valor de desconto foi de: " + valorDesconto);
            System.err.println("O valor que deve ser pago � de: " + valorPagar);
            
            System.out.println("Deseja fazer mais cadastros? S - sim / N - n�o");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}
