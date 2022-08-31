package com.api.shoppinglist.dtos;

import javax.validation.constraints.NotBlank;

public class ItemDto {

    @NotBlank
    private String classe;
    @NotBlank
    private String tipo;
    @NotBlank
    private String marca;
    private int quantidade;
    private double preco;
    private boolean contemLactose;
    private boolean contemAlcool;
    private int teorGordura;
    private int teorAlcoolico;


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isContemLactose() {
        return contemLactose;
    }

    public void setContemLactose(boolean contemLactose) {
        this.contemLactose = contemLactose;
    }

    public boolean isContemAlcool() {
        return contemAlcool;
    }

    public void setContemAlcool(boolean contemAlcool) {
        this.contemAlcool = contemAlcool;
    }

    public int getTeorGordura() {
        return teorGordura;
    }

    public void setTeorGordura(int teorGordura) {
        this.teorGordura = teorGordura;
    }

    public int getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(int teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }
}
