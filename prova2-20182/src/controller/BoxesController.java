package controller;

import entities.Caixa;
import entities.CaixaCircular;
import entities.CaixaPentagonal;
import entities.CaixaRetangular;


import java.util.*;

public class BoxesController {

    private Map<String, Caixa> caixas;
    private int numCaixas;

    public BoxesController(){
        this.caixas = new HashMap<>();
    }

    public void cadastraCaixa(String descricao, String personalizacao, String formato, double lado){
        if("Circular".equals(formato)){
            this.caixas.put(descricao, new CaixaCircular(descricao, personalizacao, formato, lado));
            this.numCaixas++;
        }
        else if("Pentagonal".equals(formato)){
            this.caixas.put(descricao, new CaixaPentagonal(descricao, personalizacao, formato, lado));
            this.numCaixas++;
        }
        else{
            throw new IllegalArgumentException("Formato Inexistente");
        }
    }

    public void cadastraCaixa(String descricao, String personalizacao, String formato, double lado1, double lado2){
        if("Retangular".equals(formato)){
            this.caixas.put(descricao, new CaixaRetangular(descricao, personalizacao,formato,lado1, lado2));
            this.numCaixas++;
        }

    }

    public void modificaPersonalizacao(String descricao, String novaPersonalizacao){
        if(this.caixas.containsKey(descricao)){
            this.caixas.get(descricao).setPersonalizacao(novaPersonalizacao);
        }
        else{
            throw new NoSuchElementException("Caixa inexistente");
        }
    }

    public boolean removeCaixa(String descricao){
        if(this.caixas.containsKey(descricao)){
            this.caixas.remove(descricao);
            this.numCaixas--;
            return true;
        }
        return false;
    }

    public int getNumCaixas(){
        return this.numCaixas;
    }

    public boolean consultaCaixa(String personalizacao, String formato){
        for(Caixa caixa : this.caixas.values()){
            if(caixa.getFormato().equals(formato) && caixa.getPersonalizacao().equals(personalizacao))
                return true;
        }
        return false;
    }

    public String caixasComPersonalizacaoInteresse(String personalizacao){
        List<Caixa> caixasLista = new ArrayList<>();

        for(Caixa c : this.caixas.values()){
            if(c.getPersonalizacao().equals(personalizacao))
                caixasLista.add(c);
        }
        Collections.sort(caixasLista);
        return Arrays.toString(caixasLista.toArray());
    }

    public String caixasComFormatoInteresse(String formato){
        List<Caixa> caixasLista = new ArrayList<>();

        for(Caixa c : this.caixas.values()){
            if(c.getFormato().equals(formato))
                caixasLista.add(c);
        }
        Collections.sort(caixasLista);
        return Arrays.toString(caixasLista.toArray());
    }

    public double getRendimento(){
        double sum = 0;
        for(Caixa caixa : this.caixas.values()){
            sum += caixa.getPreco();
        }
        return sum;
    }
}
