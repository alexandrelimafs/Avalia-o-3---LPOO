package avaliacao3;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    
    // Corrigi: antes não utilizava uma lista de objetos Transacao (ArrayList), que era exigido na questão.
    private List<Transacao> listaDeTransacao = new ArrayList<>();
    
    // Corrigi: antes o construtor não existia ou estava incompleto.
    public SistemaFinanceiro() {
        this.listaDeTransacao = new ArrayList<>();
    }
    
    // Corrigi: implementei o método adicionar para inserir objetos Transacao na lista.
    public void adicionar(Transacao t) {
        this.listaDeTransacao.add(t);
    }
    
    // Corrigi: o metodo listarExtrato estava com lógica errada e não percorria a lista de transações corretamente.
    public void listarExtrato() {
        System.out.println("------------------");
        System.out.println("EXTRATO:");
        
        //Validação
        for (Transacao t : listaDeTransacao) {
            String textoTipo;
            if(t.getTipo() == 1) {
                textoTipo = "Receita";
            } else {
                textoTipo = "Despesa";
            }
            //De outra forma
            //String textoTipo = (t.getTipo() == 1) ? "Receita" : "Despesa";
            
            System.out.printf("%s - R$ %,.2f (%s)%n", t.getDescricao(), t.getValor(), textoTipo);
        } 
    }
}