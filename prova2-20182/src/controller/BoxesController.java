package controller;

import entities.Caixa;
import entities.CaixaCircular;
import entities.CaixaPentagonal;
import enums.Formato;

import java.util.HashMap;
import java.util.Map;

public class BoxesController {

    private Map<String, Caixa> caixas;

    public BoxesController(){
        this.caixas = new HashMap<>();
    }

    public void cadastraCaixa(String descricao, String personalizacao, String formato, double lado){
        if(Formato.fromString(formato) == Formato.CIRCULAR){
            this.caixas.put(descricao, new CaixaCircular(descricao, personalizacao, lado));
        }
        else if(Formato.fromString(formato) == Formato.RETANGULAR){
            this.caixas.put(descricao, new CaixaPentagonal(descricao, personalizacao, lado));
        }
        else{
            throw new IllegalArgumentException("Formato Inexistente");
        }
    }

    public void cadastraCaixa(String descricao, String personalziacao, String formato, double lado1, double lado2){

    }

    private void defineFormato(String formato){

    }
}
