package oi;

import java.util.Objects;

public class VagaEstacionamento {
    private String placaCarro;
    private String horarioEntrada;
    private String codigoSetor;
    private int posicaoCarro;
    private String statusVaga;

    public VagaEstacionamento(String codigoSetor, int posicaoCarro) {
        this.codigoSetor = codigoSetor;
        this.posicaoCarro = posicaoCarro;
        this.statusVaga = "vaga";
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public String getCodigoLocalizacao() {
        return codigoSetor + "-" + posicaoCarro;
    }

    public String getStatusVaga() {
        return statusVaga;
    }

    public void setStatusVaga(String statusVaga) {
        this.statusVaga = statusVaga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VagaEstacionamento that = (VagaEstacionamento) o;
        return posicaoCarro == that.posicaoCarro &&
                Objects.equals(statusVaga, that.statusVaga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posicaoCarro, statusVaga);
    }

    @Override
    public String toString() {
        return String.format("%s - %s", getCodigoLocalizacao(), getStatusVaga());
    }
}
