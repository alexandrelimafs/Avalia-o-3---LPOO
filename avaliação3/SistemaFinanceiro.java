package avaliacao3;

import java.util.ArrayList;
import java.util.List;

public class SistemaFinanceiro {
    
    private List<Transacao> listaDeTransacao = new ArrayList<>();
    
    public SistemaFinanceiro() {
        this.listaDeTransacao = new ArrayList<>();
    }
    
    public void adicionar(Transacao t) {
        this.listaDeTransacao.add(t);
    }
    
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
