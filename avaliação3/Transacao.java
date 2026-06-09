package avaliacao3;

// Classe Transação
public class Transacao {
    //Atributos privados
    private String descricao;
    private double valor;
    private int tipo;
    
    // Construtor que que recebe e inicializa os atributos
    public Transacao(String descricao, double valor, int tipo) {
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo; // Corrigi o this.tipo, antes não inicializava o atributo tipo no construtor.
    }
    
    // Métodos Getters pra ler os dados de fora (public)
    public String getDescricao() { 
        return descricao; 
    }
    
    public double getValor() { 
        return valor; 
    }
    
    public int getTipo() { // Corrigi: criei o getter do tipo que estava ausente.
        return tipo;
    }
    
    // E removi o getData() que a questão não pedia.
}