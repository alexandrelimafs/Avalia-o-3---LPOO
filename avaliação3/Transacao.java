package avaliacao3;

public class Transacao {
    private String descricao;
    private double valor;
    private int tipo;
    
    public Transacao(String descricao, double valor, int tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
    }
    
    public String getDescricao() { 
        return descricao; 
    }
    
    public double getValor() { 
        return valor; 
    }
    
    public int getTipo() {
        return tipo;
    }
    
}
