package com.teamdire.university_restaurant.model;

import java.util.Calendar;

public class LogCreditos implements java.io.Serializable {
    private Usuario usuario;
    private Usuario usuarioResponsavel;
    private Float valorInserido;
    private Calendar dataInsercao;

    public LogCreditos(Usuario usuario, Usuario usuarioResponsavel, Float valorInserido, Calendar dataInsercao) {
        this.usuario = usuario;
        this.usuarioResponsavel = usuarioResponsavel;
        this.valorInserido = valorInserido;
        this.dataInsercao = dataInsercao;
    }

    // Getters
    public Usuario getUsuario() {
        return usuario;
    }
    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }
    public Float getValorInserido() {
        return valorInserido;
    }
    public Calendar getDataInsercao() {
        return dataInsercao;
    }

    // Setters
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
        this.usuarioResponsavel = usuarioResponsavel;
    }
    public void setValorInserido(Float valorInserido) {
        this.valorInserido = valorInserido;
    }
    public void setDataInsercao(Calendar dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
}
