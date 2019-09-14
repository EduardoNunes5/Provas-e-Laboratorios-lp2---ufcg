package entities;

public class CaixaRetangular extends AbstractCaixa {

    private double lado;
    private double lado1;

    public CaixaRetangular(String descricao, String personalizacao,String formato, double lado, double lado1){
        super(descricao, personalizacao,formato);
        this.lado = lado;
        this.lado1 = lado1;
    }

    private double areaTotal(){
        return lado * lado1;
    }

    @Override
    public double getPreco(){
        return areaTotal() * 0.1;
    }
}
