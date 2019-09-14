package entities;

public class CaixaPentagonal extends AbstractCaixa {

    private double lado;
    private double altura;

    public CaixaPentagonal(String descricao, String personalizacao,String formato, double lado){
        super(descricao, personalizacao, formato);
        this.lado = lado;
        calculaAltura();
    }

    private void calculaAltura(){
        this.altura = (this.lado / 2 * Math.sqrt(5) + 2 * Math.sqrt(5)) / 2;
    }

    private double areaTotal(){
        return  5.0 * (this.lado * this.altura) / 2.0;
    }

    @Override
    public double getPreco(){
        return areaTotal() * 0.1;
    }

}
