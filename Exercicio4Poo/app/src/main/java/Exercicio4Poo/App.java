/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Exercicio4Poo;

public class App {
    
    public static void main(String[] args) {
    
        Invoice inv = new Invoice(1, "Mousepad", -10, 50.0f);
        System.err.println("Valor total: " + inv.getInvoiceAmout());
    }
}