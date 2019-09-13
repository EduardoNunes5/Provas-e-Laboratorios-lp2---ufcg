package entities;

public class AbstractCaixa implements Caixa{
    private String descricao;
    private String personalizacao;

    public AbstractCaixa(String descricao, String personalizacao){
        this.descricao = descricao;
        this.personalizacao = personalizacao;
    }
}
