package com.teamdire.university_restaurant.model;

public class Tiquete implements java.io.Serializable {
    private Boolean foiUtilizado;

    public Tiquete() {
        this.foiUtilizado = false;
    }

    public Boolean getFoiUtilizado() {
        return foiUtilizado;
    }

    public void usar() {
        this.foiUtilizado = true;
    }
}
