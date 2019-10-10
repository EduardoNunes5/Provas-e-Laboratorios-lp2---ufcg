package siml;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;

public class ProgCorredor {
    private String nome;
    private String cpf;
    private int dataNascimento;
    private ArrayList<Treino> listaTreinos;

    public ProgCorredor(String nome, String cpf, int dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.listaTreinos = new ArrayList<>();
    }
    public void cadastrarTreinoaAoCorredor(double distancia, int tempoEsperado, String descricao) {
        Util.validadorParametro(cpf,"Cpf inválido");
        Util.validadorParametro(descricao,"Descrição inválida!");

        this.listaTreinos.add(new Treino(distancia, tempoEsperado,descricao));
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }
    public String classificaProg(int dataNascimento) {
        String saida = "";
        Calendar cal = Calendar.getInstance();
        int idade = cal.get(Calendar.YEAR) - dataNascimento;
        if (idade < 15){
            throw new IllegalArgumentException("Idade inválida");
        }
        if (15 <= idade && 24 >= idade ) {
            saida = "JOVEM";
        }else if (25 <= idade && 40 >= idade) {
            saida = "ADULTO";
        }else if(41 <= idade && 64 >= idade) {
            saida = "SUPER_ADULTO";
        }else{
            saida = "MELHOR_IDADE";
        }
        return saida;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgCorredor that = (ProgCorredor) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }
    public ArrayList<Treino> getListaTreinos() {
        return listaTreinos;
    }
    public void finalizarTreino(int indice, int tempoGasto) {
        this.listaTreinos.get(indice).setStatusTreino();
        this.listaTreinos.get(indice).setTempoGastoTreino(tempoGasto);
    }
    public int contarTreinosFinalizadosCorredor() {
        int saida = 0;
        for (int i = 0; i < this.listaTreinos.size() ; i++) {
            if(!(listaTreinos.get(i) == null)) {
                saida += 1;
            }
        }
        return saida;
    }
    public double resistenciaCorredor() {
        double soma = 0.0;
        for (int i = 0; i < this.listaTreinos.size() ; i++) {
            if(!(listaTreinos.get(i) == null)) {
                soma += this.listaTreinos.get(i).qualificarTreino();
            }
        }
        calculaMedia(soma);
        return 0.0;
    }
    private double calculaMedia(double soma) {
        double media = 0.0;
        int linhas = 0;
        for (int i = 0; i < this.listaTreinos.size() ; i++) {
            if(!(listaTreinos.get(i) == null)){
                linhas += 1;
            }
        }
        media = soma / linhas;
        return media;
    }
    @Override
    public String toString() {
        return String.format("%s - %s - %s", getNome(), getCpf(), classificaProg(getDataNascimento()));
    }
}
