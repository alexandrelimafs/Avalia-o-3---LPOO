package avaliacao3;

import java.util.Locale;
import java.util.Scanner;

public class FinanceApp {
    
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt" , "BR"));
        
        SistemaFinanceiro sistema = new SistemaFinanceiro();
        Scanner scanner = new Scanner(System.in); // Entrada de valores.
        
        System.out.println("-- CADASTRO DE TRANSAÇÕES --");
        
        // Corrigi: antes o for executava 4 vezes (i <= 3), agora executa corretamente 3 vezes
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a descrição da transacao " + (i + 1) + ": ");
            String descricao = scanner.nextLine();
            
            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();
            
            System.out.print("Digite o tipo (1-Receita / 2-Despesa): ");
            int tipo = scanner.nextInt(); // Corrigi: antes eu pedia receita/despesa separado, agora uso o tipo como a questão exigia.
            
            scanner.nextLine();
            System.out.println();
            
            Transacao t = new Transacao(descricao, valor, tipo);
            
            sistema.adicionar(t); // Corrigi: antes eu não chamava o metodo adicionar no sistema.
        
        }
        
        sistema.listarExtrato(); // Corrigi: antes eu não chamava o método listarExtrato e estava na classe errada.
    
        scanner.close();
        
    }
    
}