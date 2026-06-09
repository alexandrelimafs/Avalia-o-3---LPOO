package avaliacao3;

import java.util.Locale;
import java.util.Scanner;

public class FinanceApp {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt" , "BR"));
        
        SistemaFinanceiro sistema = new SistemaFinanceiro();
        Scanner scanner = new Scanner(System.in); // Entrada de valores.
        
        System.out.println("-- CADASTRO DE TRANSAÇÕES --");
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a descrição da transacao " + (i + 1) + ": ");
            String descricao = scanner.nextLine();
            
            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();
            
            System.out.print("Digite o tipo (1-Receita / 2-Despesa): ");
            int tipo = scanner.nextInt();
            
            scanner.nextLine();
            System.out.println();
            
            Transacao t = new Transacao(descricao, valor, tipo);
            
            sistema.adicionar(t);
        
        }
        
        sistema.listarExtrato();
    
        scanner.close();
        
    }
    
}
