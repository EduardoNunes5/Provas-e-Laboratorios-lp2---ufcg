package entities;

public class CaixaPentagonal extends AbstractCaixa {

    private double lado;

    public CaixaPentagonal(String descricao, String personalizacao, double lado){
        super(descricao, personalizacao);
        this.lado = lado;
    }
}
