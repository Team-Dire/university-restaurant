package com.teamdire.university_restaurant.model;

public class Usuario implements java.io.Serializable {
    private String cpf;
    private String senha;
    private Float saldo;
    private Boolean isAdmin;

    // Construtor
    public Usuario(String cpf, String senha, Boolean isAdmin) {
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = 0.0f;
        this.isAdmin = isAdmin;
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
}
