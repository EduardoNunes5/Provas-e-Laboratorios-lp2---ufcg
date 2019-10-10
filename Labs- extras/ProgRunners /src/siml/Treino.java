package siml;

public class Treino {
    private double distanciaTreino;
    private int tempoEsperado;
    private int tempoGasto;
    private String descricaoTreino;
    private String statusTreino;

    public Treino(double distancia, int tempoEsperado, String descricaoTreino) {
        this.distanciaTreino = distancia;
        this.tempoEsperado = tempoEsperado;
        this.tempoGasto = 0;
        this.descricaoTreino = descricaoTreino;
        this.statusTreino = "Não inicializado";
    }

    public double getDistancia() {
        return distanciaTreino;
    }

    public int getTempoEsperado() {
        return tempoEsperado;
    }

    public int getTempoGasto() {
        return tempoGasto;
    }

    public void setTempoGastoTreino(int tempoGastoTreino) {
        this.tempoGasto = tempoGastoTreino;
    }

    public String getDescricaoTreino() {
        return descricaoTreino;
    }

    public void setStatusTreino() {
        this.statusTreino = "Terminado";
    }
    public double qualificarTreino() {
        int saida = 0;
        double diferencaTempo = getTempoEsperado() - getTempoGasto();
        if (diferencaTempo > 0.0) {
            saida = 1;
        }else if(diferencaTempo < 0.0) {
            saida = -1;
        }
        return saida;
    }

    @Override
    public String toString() {
        return String.format("%skm - %smin - %s", getDistancia(), getTempoEsperado(),getDescricaoTreino());
    }
}
