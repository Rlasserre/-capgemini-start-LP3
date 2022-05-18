
package Exercicios.logicos;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        boolean desejaRepetir = true;
        
        while (desejaRepetir == true) {
            
            System.out.println("Digite o ano de fabricação do veículo");
            anoFabricacao = leitor.nextInt();
            
            System.out.println("Digite o valor do carro");
            valorCarro = leitor.nextFloat();
                
        }
        
    }
}
