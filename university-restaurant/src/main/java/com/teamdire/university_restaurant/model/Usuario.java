package com.teamdire.university_restaurant.model;

import java.util.HashMap;

public class Usuario implements java.io.Serializable {
    private String cpf;
    private String senha;
    private Float saldo;
    private Boolean isAdmin;

    private final HashMap<Refeicao, Tiquete> tiquetes;

    // Construtor
    public Usuario(String cpf, String senha, Boolean isAdmin) {
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = 0.0f;
        this.isAdmin = isAdmin;
        this.tiquetes = new HashMap<>();
    }

    // Getters
    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public Float getSaldo() {
        return saldo;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public HashMap<Refeicao, Tiquete> getTiquetes() {
        return tiquetes;
    }

    // Setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    // Métodos
    public void adicionaTiquete(Refeicao refeicao) {
        Tiquete tiquete = new Tiquete();
        this.tiquetes.put(refeicao, tiquete);
        // TODO: fix usando preço fixo de R$ 3,00
        this.saldo -= 3.0f;
    }

    public Tiquete getTicketByRefeicao(Refeicao refeicao) {
        Tiquete tiquete = this.tiquetes.get(refeicao);
        return tiquete;
    }
}
