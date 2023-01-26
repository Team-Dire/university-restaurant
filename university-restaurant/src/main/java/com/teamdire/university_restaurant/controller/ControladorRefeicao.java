package com.teamdire.university_restaurant.controller;

import com.teamdire.university_restaurant.model.Refeicao;
import com.teamdire.university_restaurant.model.TipoRefeicao;
import com.teamdire.university_restaurant.model.UniversityRestaurant;

import java.util.ArrayList;
import java.util.Calendar;

public class ControladorRefeicao {
    public ControladorRefeicao() {
    }

    public boolean inserirNovaRefeicao(byte tipoRefeicao, Calendar dataServentia, int quantidadeTiquetes,
                                       String nomeRefeicao, ArrayList<String> alimentosBase, String guarnicao,
                                       String salada, String bebida, String sobremesa)
    {
        Refeicao refeicao = new Refeicao(tipoRefeicao, dataServentia, quantidadeTiquetes,
                                         nomeRefeicao, alimentosBase, guarnicao, salada, bebida, sobremesa);
        UniversityRestaurant.addRefeicao(refeicao);
        return true;
    }
}
