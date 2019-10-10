package oi;

public class LitaPark {
    private VagaEstacionamento[] estacionamento;

    public LitaPark() {
        this.estacionamento = new VagaEstacionamento[50];
    }

    public void estacionarCarro(String codigoSetor, int posicao) {
        for (int i = 0; i < this.estacionamento.length; i++) {
            if(this.estacionamento[i].getPlacaCarro() == null) {
                this.estacionamento[i] = new VagaEstacionamento(codigoSetor,posicao);
                this.estacionamento[i].setStatusVaga("ocupado");
            }
        }
    }

    public boolean liberarVaga(int posicao) {
        this.estacionamento[posicao] = null;
        return true;
    }

    public String exibirPainelVagasLivres() {
        String saida = "";
        for (int i = 0; i < this.estacionamento.length ; i++) {
            if(this.estacionamento[i] == null) {
                saida += this.estacionamento[i].toString() + "\n";
            }
        }
        return saida;
    }

    public String localizarCarro(String placa) {
        String saida = "";
        for (int i = 0; i < this.estacionamento.length ; i++) {
            if(this.estacionamento[i].getPlacaCarro() == placa) {
                saida = this.estacionamento[i].getCodigoLocalizacao();
                break;
            }
        }
        return saida;
    }
    public String exibirPainelVagasOcupadas() {
        String saida = "";
        for (int i = 0; i < this.estacionamento.length ; i++) {
            if(!(this.estacionamento[i] != null)) {
                saida += this.estacionamento[i].toString() + "\n";
            }
        }
        return saida;
    }


}
