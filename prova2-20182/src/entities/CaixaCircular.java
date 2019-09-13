package entities;

public class CaixaCircular extends AbstractCaixa {

    private double raio;

    public CaixaCircular(String descricao, String personalizacao, double raio){
        super(descricao, personalizacao);
        this.raio = raio;
    }
}
