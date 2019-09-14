package entities;

public class CaixaCircular extends AbstractCaixa {

    private double raio;

    public CaixaCircular(String descricao, String personalizacao,String formato, double raio){
        super(descricao, personalizacao, formato);
        this.raio = raio;
    }

    private double areaTotal(){
        return 3.14 * this.raio * this.raio;
    }

    @Override
    public double getPreco(){
        return areaTotal() * 0.1;
    }
}
