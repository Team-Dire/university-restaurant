package com.teamdire.university_restaurant.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Refeicao implements java.io.Serializable {
    private String nome;
    private Calendar dataServentia;
    private TipoRefeicao tipoRefeicao;
    private int quantidadeTiquetes;
    private ArrayList<String> alimentosBase;
    private String guarnicao;
    private String salada;
    private String bebida;
    private String sobremesa;
    private String pratoPrincipal;

    //+ inserirNovaRefeicao(tipoRefeicao : TipoRefeicao, dataServentia : Calendar, quantidadeTiquetes : int, nomeRefeicao : String, alimentosBase : List<String>, guarnicao : String, salada : String, bebida : String, sobremesa : String) : boolean
    public Refeicao(byte tipoRefeicao, Calendar dataServentia, int quantidadeTiquetes,
                    String nomeRefeicao, String pratoPrincipal, ArrayList<String> alimentosBase, String guarnicao,
                    String salada, String bebida, String sobremesa)
    {
        switch(tipoRefeicao) {
            case 0:
                this.tipoRefeicao = TipoRefeicao.CAFE_DA_MANHA;
                break;
            case 1:
                this.tipoRefeicao = TipoRefeicao.ALMOCO;
                break;
            case 2:
                this.tipoRefeicao = TipoRefeicao.JANTA;
                break;
            default:
                this.tipoRefeicao = null;
                break;
        }
        this.dataServentia = dataServentia;
        this.quantidadeTiquetes = quantidadeTiquetes;
        this.nome = nomeRefeicao;
        this.alimentosBase = alimentosBase;
        this.guarnicao = guarnicao;
        this.salada = salada;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
        this.pratoPrincipal = pratoPrincipal;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public Calendar getDataServentia() {
        return dataServentia;
    }

    public TipoRefeicao getTipoRefeicao() {
        return tipoRefeicao;
    }

    public int getQuantidadeTiquetes() {
        return quantidadeTiquetes;
    }

    public ArrayList<String> getAlimentosBase() {
        return alimentosBase;
    }

    public String getGuarnicao() {
        return guarnicao;
    }

    public String getSalada() {
        return salada;
    }

    public String getBebida() {
        return bebida;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void descontaTiquete() {
        this.quantidadeTiquetes--;
    }
}
