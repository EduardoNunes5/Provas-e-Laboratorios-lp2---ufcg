package entities;

public interface Caixa extends  Comparable<Caixa>{

    void setPersonalizacao(String novaPersonalizacao);
    String getFormato();
    String getPersonalizacao();
    String getDescricao();
    double getPreco();
}
