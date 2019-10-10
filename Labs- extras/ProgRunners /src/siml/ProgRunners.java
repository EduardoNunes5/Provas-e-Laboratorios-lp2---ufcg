package siml;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProgRunners {
    private Map<String, ProgCorredor> mapaProgramadores;

    public ProgRunners() {
        this.mapaProgramadores = new HashMap();
    }

    public void cadastrarCorredor(String nome, String cpf, int anoNascimento) {
        Util.validadorParametro(nome, "Nome inválido!");
        Util.validadorParametro(cpf,"Cpf inválido");
        Util.validadorDataFutura(anoNascimento, "Data inválida!");
        if(this.mapaProgramadores.containsKey(cpf)) {
            throw new IllegalArgumentException("Corretor já cadastrado!");
        }
        this.mapaProgramadores.put(cpf, new ProgCorredor(nome,cpf,anoNascimento));
    }
    public void cadastrarTreinoaAoCorredor(String cpf, double distancia, int tempoEsperado, String descricao) {
        Util.validadorParametro(cpf,"Cpf inválido");
        Util.validadorParametro(descricao, "Descrição inválida!");
        if(!(this.mapaProgramadores.containsKey(cpf))) {
            throw new IllegalArgumentException("Corredor não cadastrado!");
        }
        this.mapaProgramadores.get(cpf).cadastrarTreinoaAoCorredor(distancia, tempoEsperado, descricao);
    }

    public void finalizarTreino(String cpf, int indice, int tempoGasto) {
        Util.validadorParametro(cpf, "Cpf inválido!");
        this.mapaProgramadores.get(cpf).finalizarTreino(indice, tempoGasto);
    }

    public int contarTreinosFinalizadosCorredor(String cpf) {
        Util.validadorParametro(cpf, "Cpf inválido");
        return this.mapaProgramadores.get(cpf).contarTreinosFinalizadosCorredor();
    }

    public double resistenciaCorredor(String cpf) {
        Util.validadorParametro(cpf, "Cpf inválido!");
        return this.mapaProgramadores.get(cpf).resistenciaCorredor();

    }

    public String listarCorredores() {
        String saida = "";
        ArrayList<ProgCorredor> programadores = new ArrayList<>(this.mapaProgramadores.values());
        for (ProgCorredor corredor: programadores) {
            if(!(corredor == null)) {
                saida += corredor.toString() + "\n";
        }
                saida = saida.substring(0, programadores.size() - 2);
        }
        return saida;
    }

    public String exibirCategoriaCorredor(String cpf) {
        String saida = "";
        Util.validadorParametro(cpf, "Cpf inválido!");
        if(!(this.mapaProgramadores.containsKey(cpf))) {
            throw new IllegalArgumentException("Corredor não cadastrado!");
        }
        saida = this.mapaProgramadores.get(cpf).classificaProg(this.mapaProgramadores.get(cpf).getDataNascimento());
        return saida;
    }
}