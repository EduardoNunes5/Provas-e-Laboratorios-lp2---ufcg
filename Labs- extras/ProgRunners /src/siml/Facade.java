package siml;

public class Facade {
    private ProgRunners controleCorredores;

    public Facade() {
        this.controleCorredores = controleCorredores;
    }

    public void cadastrarCorretor(String nome, String cpf, int anoNascimento) {
        this.controleCorredores.cadastrarCorredor(nome,cpf, anoNascimento);
    }

    public String listarCorredores() {
        return this.controleCorredores.listarCorredores();
    }
    public String exibirCategoriaCorredor(String cpf) {
        return this.controleCorredores.exibirCategoriaCorredor(cpf);
    }

    public void cadastrarTreinoCorretor(String cpf, double distancia, int tempoEsperado, String descricao) {
        this.controleCorredores.cadastrarTreinoaAoCorredor(cpf, distancia, tempoEsperado,descricao);
    }

    public void finalizarTreino(String cpf, int indice, int tempoGasto) {
        this.controleCorredores.finalizarTreino(cpf,indice,tempoGasto);
    }

    public int contarTreinosFinalizadosCorredor(String cpf) {
        return this.controleCorredores.contarTreinosFinalizadosCorredor(cpf);
    }
    public double resistenciaCorredor(String cpf) {
        return this.controleCorredores.resistenciaCorredor(cpf);
    }

}
