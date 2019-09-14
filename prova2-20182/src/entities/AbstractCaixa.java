package entities;

public abstract class AbstractCaixa implements Caixa{
    private String descricao;
    private String personalizacao;
    private String formato;

    public AbstractCaixa(String descricao, String personalizacao, String formato){
        this.descricao = descricao;
        this.personalizacao = personalizacao;
        this.formato = formato;
    }

    public void setPersonalizacao(String novaPersonalizacao){
        this.personalizacao = novaPersonalizacao;
    }

    public String getFormato(){
        return this.formato;
    }

    public String getPersonalizacao(){
        return this.personalizacao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String toString(){
        return "Caixa com " + this.personalizacao + " custa R$ " + String.format("%.2f.",this.getPreco()) + " Formato " + this.formato;
    }

    @Override
    public int compareTo(Caixa o){
        if(o == null)
            return 0;
        return this.descricao.compareTo(o.getDescricao());
    }




}
